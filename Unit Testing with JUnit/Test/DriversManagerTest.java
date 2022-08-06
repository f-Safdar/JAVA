import calculator.model.drive.Driver;
import calculator.model.drive.DriversManager;
import calculator.model.drive.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriversManagerTest
{

    private final DriversManager driversManager = new DriversManager();

    @BeforeEach
    public void setup(){
        driversManager.addPassenger( new Passenger( "Carlos", "44234", 100 ) );

        driversManager.addDriver( new Driver( "Emilio", "1234990", 10f ) );
    }

    @Test
    public void startTripTest(){

    }

    @Test
    public void endTripTest(){

    }

    @Test
    public void nextAvailableDriverTest(){

    }
}
