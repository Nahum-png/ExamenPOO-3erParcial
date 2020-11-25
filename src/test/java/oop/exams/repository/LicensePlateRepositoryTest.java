package oop.exams.repository;

import oop.exams.exception.BadRegionException;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;
import oop.exams.model.Region;

import java.util.EnumMap;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LicensePlateRepositoryTest {
    @Test
    public void givenAValidState_whenGetState_thenReturnARegion(){
        //Given:
        LicensePlateRepository licensePlateRepository = new LicensePlateRepository();
        String state = "SLP";
        Region expectedRegion = Region.CENTER;

        //When:
        Region region = licensePlateRepository.getRegionByState(state);

        //Then:
        assertThat(region).isEqualTo(expectedRegion);
    }

    @Test
    public void givenANonValidState_whenGetState_thenThrowAException(){
        //Given:
        LicensePlateRepository licensePlateRepository = new LicensePlateRepository();
        String state = "SLP";
        String randomStateAbbreviation = "X" + RandomString.make(2);
        Region expectedRegion = Region.CENTER;

        //When:
        //Then:
        assertThatThrownBy(() -> licensePlateRepository.getRegionByState(randomStateAbbreviation)).isInstanceOf(BadRegionException.class);
    }
}
