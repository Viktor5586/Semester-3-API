package s3.project.springbootbackend.persistence.impl;

import org.springframework.stereotype.Repository;
import s3.project.springbootbackend.persistence.Entities_DTO.CustomerEntity;
import s3.project.springbootbackend.persistence.repositories.CustomerRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private static long NEXT_ID = 1;
    private final List<CustomerEntity> savedUsers;

    public CustomerRepositoryImpl() {
        this.savedUsers = new ArrayList<>();
    }


    @Override
    public CustomerEntity save(CustomerEntity user) {
        if (user.getId() == null) {
            user.setId(NEXT_ID);
            NEXT_ID++;
            this.savedUsers.add(user);
        }
        return user;
    }

    @Override
    public void deleteById(long userId) {
        this.savedUsers.removeIf(studentEntity -> studentEntity.getId().equals(userId));
    }

    @Override
    public List<CustomerEntity> findAll() {
        return Collections.unmodifiableList(this.savedUsers);
    }

    @Override
    public Optional<CustomerEntity> findById(long id) {
        return this.savedUsers.stream()
                .filter(studentEntity -> studentEntity.getId().equals(id))
                .findFirst();
    }


}
