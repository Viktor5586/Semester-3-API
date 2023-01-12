package s3.project.springbootbackend.controller;

import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s3.project.springbootbackend.business.impl.statistics.GetAllStatsUseCaseImpl;
import s3.project.springbootbackend.configuration.security.isauthenticated.IsAuthenticated;
import s3.project.springbootbackend.domain.Responses.Statistics.GetStatisticsResponse;

import javax.annotation.security.RolesAllowed;

@Generated
@RestController
@RequestMapping("/statistics")
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class StatisticsController {
    private GetAllStatsUseCaseImpl getAllStatsUseCaseImpl;
    @IsAuthenticated
    @RolesAllowed({"ROLE_EMPLOYEE"})
    @GetMapping()
    public ResponseEntity<?> getGargosStatistics() {
        GetStatisticsResponse response = getAllStatsUseCaseImpl.getStats();
        return ResponseEntity.ok(response);
    }
}
