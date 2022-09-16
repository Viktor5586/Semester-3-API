package s3.project.springbootbackend.business.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.domain.User;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.UserRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetUserUseCaseImplTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    GetUserUseCaseImpl getUserUseCase;
/*          wrong(two different id)
    @Test
    void getEmployee(){
        Optional<UserEntity> user1 = Optional.of(UserEntity.builder().id(1L).username("sth").password("sth").build());

        when(userRepository.findById(1L))
                .thenReturn(user1);

        Optional<User> actual = getUserUseCase.getUser(1L);
        Optional<User> user2 = Optional.of(User.builder().id(1L).username("sth").password("sth").build());

        assertEquals(user2, actual);
        verify(userRepository).findById(1L);

    }*/
}