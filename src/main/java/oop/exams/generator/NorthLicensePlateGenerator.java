package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;

public class NorthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String initPlate = "1";
        String digits = "1234567890";
        Random random = new Random();
        String allowedStates = "BCN BCS CHH COA NLE SON TAM";
        final int characters = 6;

        if (!allowedStates.contains(state)) {
            throw new BadRegionException("Allowed state codes: BCN, BCS, CHH, COA, NLE, SON, TAM");
        }else{
            initPlate += state;
            for(int i = 0; i < characters - 4; i++){
                initPlate += digits.charAt(random.nextInt(digits.length()));
            }
            return initPlate;
        }
    }
}
