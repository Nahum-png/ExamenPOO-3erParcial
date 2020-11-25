package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;

public class WestLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String digits = "1234567890";
        String initPlate = "2";
        Random random = new Random();
        String allowedStates = "COL JAL NAY SIN";
        final int characters = 5;

        if (!allowedStates.contains(state)) {
            throw new BadRegionException("Allowed state codes: COL, JAL, NAY, SIN");
        }else {
            for(int i=0; i < characters - 4; i++){
                initPlate += digits.charAt(random.nextInt(digits.length()));
            }
            initPlate += state;
            return initPlate;
        }
    }
}
