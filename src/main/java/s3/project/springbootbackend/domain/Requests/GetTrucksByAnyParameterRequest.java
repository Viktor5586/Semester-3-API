package s3.project.springbootbackend.domain.Requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import s3.project.springbootbackend.configuration.Generated;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class GetTrucksByAnyParameterRequest {

    private Long id;
    private String licencePlate;
    private String location;
    private  Double height;
    private  Double width;
    private  Double length;
    private  Double maxWeight;
    private  Double tankVolume;
    private  Double fuelConsumptionPerKm;
}
