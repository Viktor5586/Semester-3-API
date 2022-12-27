package s3.project.springbootbackend.persistence.repositories;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import s3.project.springbootbackend.persistence.Entities.UserEntity;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByUsername(String username);
    @Modifying
    @Transactional
    @Query("update UserEntity as u set u.username = :username , u.password = :password where u.customer.id = :id")
    void updateUser(@Param("username")String username,@Param("password")String password,@Param("id")Long id);
    @Query("select u from UserEntity as u where u.customer.id = :id or u.employee.id = :id")
    UserEntity findByCustomerIdOrEmployee_Id(@Param("id")Long userId);
//    @Modifying
//    @Transactional
//    @Query(value = "delete from user_role where user_id = :id",nativeQuery = true)
//    void deleteUserRole(@Param("id")long id);
//    @Modifying
//    @Query("delete FROM UserEntity as u WHERE ( u.customer.id = :id) or (u.employee.id = :id)")
//    void deleteByCustomer_IdOrEmployee_Id(@Param("id") long id);

}
