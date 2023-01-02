package s3.project.springbootbackend.business.impl.statistics;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.statistics.GetCountOfEmployeesUseCase;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;

@Service
@AllArgsConstructor
public class GetCountOfEmployeesUseCaseImpl implements GetCountOfEmployeesUseCase {
//    UserRepository userRepository;
    EmployeeRepository employeeRepository;
    @Override
    public long getCountOfEmployees() {
//        return userRepository.countAllByUserRoles(role);
        return employeeRepository.count();
    }
}
