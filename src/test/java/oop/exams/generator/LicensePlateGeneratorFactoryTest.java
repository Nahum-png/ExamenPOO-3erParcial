package oop.exams.generator;

import oop.exams.model.Region;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LicensePlateGeneratorFactoryTest {

    private LicensePlateGeneratorFactory licensePlateGeneratorFactory;

    @BeforeEach
    public void setup(){
        licensePlateGeneratorFactory = new LicensePlateGeneratorFactory();
    }

    @Test
    public void givenANorthRegionState_whenGetInstance_thenNorthRegionGeneratorIsReturned() {
        // Given:
        String []northStates = {"BCN", "BCS", "CHH", "COA", "NLE", "SON", "TAM"};

        for(String state: northStates) {
            // When:
            LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(state);

            // Then:
            assertThat(instance).isInstanceOf(NorthLicensePlateGenerator.class);
        }
    }

    @Test
    public void givenASouthRegionState_whenGetInstance_thenSouthRegionGeneratorIsReturned() {
        // Given:
        String []southStates = {"CHP", "GRO", "MIC", "OAX"};

        for(String state: southStates) {
            // When:
            LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(state);

            // Then:
            assertThat(instance).isInstanceOf(SouthLicensePlateGenerator.class);
        }
    }

    @Test
    public void givenAEastRegionState_whenGetInstance_thenEastRegionGeneratorIsReturned() {
        // Given:
        String []southStates = {"CAM", "ROO", "TAB", "VER", "YUC"};

        for(String state: southStates) {
            // When:
            LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(state);

            // Then:
            assertThat(instance).isInstanceOf(EastLicensePlateGenerator.class);
        }
    }

    @Test
    public void givenAWestRegionState_whenGetInstance_thenWestRegionGeneratorIsReturned() {
        // Given:
        String []southStates = {"COL", "JAL", "NAY", "SIN"};

        for(String state: southStates) {
            // When:
            LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(state);

            // Then:
            assertThat(instance).isInstanceOf(WestLicensePlateGenerator.class);
        }
    }

    @Test
    public void givenACenterRegionState_whenGetInstance_thenCenterGeneratorIsReturned() {
        // Given:
        String []centerStates = {"AGU", "CMX", "DUR", "GUA", "HID", "MEX", "PUE", "QUE", "SLP", "TLA", "ZAC"};

        for(String state: centerStates) {
            // When:
            LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(state);

            // Then:
            assertThat(instance).isInstanceOf(CenterLicensePlateGenerator.class);
        }
    }

    @Test
    public void givenANorthRegion_whenGetInstance_thenNorthIsReturned(){
        //Given :
        Region region = Region.NORTH;

        //When:

        LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(region);

        //Then:

        assertThat(instance).isInstanceOf(NorthLicensePlateGenerator.class);

    }

    @Test
    public void givenASouthRegion_whenGetInstance_thenSouthIsReturned(){
        //Given :
        Region region = Region.SOUTH;

        //When:

        LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(region);

        //Then:

        assertThat(instance).isInstanceOf(SouthLicensePlateGenerator.class);

    }

    @Test
    public void givenAWestRegion_whenGetInstance_thenWestIsReturned(){
        //Given :
        Region region = Region.WEST;

        //When:

        LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(region);

        //Then:

        assertThat(instance).isInstanceOf(WestLicensePlateGenerator.class);

    }

    @Test
    public void givenAEastRegion_whenGetInstance_thenEasttIsReturned(){
        //Given :
        Region region = Region.EAST;

        //When:

        LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(region);

        //Then:

        assertThat(instance).isInstanceOf(EastLicensePlateGenerator.class);

    }

    @Test
    public void givenACenterRegion_whenGetInstance_thenCentertIsReturned(){
        //Given :
        Region region = Region.CENTER;

        //When:

        LicensePlateGenerator instance = licensePlateGeneratorFactory.getInstance(region);

        //Then:

        assertThat(instance).isInstanceOf(CenterLicensePlateGenerator.class);

    }
}