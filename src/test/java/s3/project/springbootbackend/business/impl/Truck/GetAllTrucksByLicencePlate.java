package s3.project.springbootbackend.business.impl.Truck;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import s3.project.springbootbackend.persistence.repositories.TruckRepository;

@ExtendWith(MockitoExtension.class)
public class GetAllTrucksByLicencePlate {
    @Mock
    TruckRepository truckRepository;
    @InjectMocks
    GetTrucksByAnyParameterUseCaseImpl useCase;

    @Test
    void getAllTrucksByLicencePlate_Successful(){
        //truckRepository.getTruckEntitiesByIdAndLocationAAndHeightAndLengthAndWidthAndMaxWeightAndTankVolumeAndFuelConsumptionPerKm();
    }
}
