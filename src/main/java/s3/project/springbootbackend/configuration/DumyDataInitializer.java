package s3.project.springbootbackend.configuration;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import s3.project.springbootbackend.persistence.Entities.UserEntity;
import s3.project.springbootbackend.persistence.UserRepository;

@Component
@AllArgsConstructor
public class DumyDataInitializer {
    private UserRepository userRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void initialDummyData(){
        if (userRepository.findAll().size() == 0){
            userRepository.save(UserEntity.builder().id(1L).username("Gepi").password("asdfghjk").build());
            userRepository.save(UserEntity.builder().id(2L).username("Gogi").password("asdfghjk").build());
            userRepository.save(UserEntity.builder().id(3L).username("Ko").password("asdfghjk").build());
            userRepository.save(UserEntity.builder().id(4L).username("Ne").password("asdfghjk").build());
        }
    }


}
