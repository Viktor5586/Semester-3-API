package s3.project.springbootbackend.business.impl.Employee;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import s3.project.springbootbackend.business.useCases.Employee.DeleteEmployeeUseCase;
import s3.project.springbootbackend.domain.Requests.DeleteEmployeeByIdRequest;
import s3.project.springbootbackend.persistence.repositories.EmployeeRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class DeleteEmployeeUseCaseImpl implements DeleteEmployeeUseCase {
    private EmployeeRepository employeeRepository;
    @Override
    @Transactional
    public void delete(DeleteEmployeeByIdRequest request) {
        employeeRepository.deleteById(request.getEmployeeId());
    }
}
