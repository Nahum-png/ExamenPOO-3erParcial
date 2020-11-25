package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;

public class EastLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String digits = "1234567890";
        String initPlate = "3";
        String finalPlate = "Z";
        Random random = new Random();
        final int characters = 4;
        String allowedStates = "CAM ROO TAB VER YUC";

        if(!allowedStates.contains(state)){
            throw new BadRegionException("Allowed state codes: CAM, ROO, TAB, VER, YUC");
        }else{
            for(int i = 0; i < characters - 2; i++){
                initPlate += digits.charAt(random.nextInt(digits.length()));
            }
            initPlate += finalPlate;
            return initPlate;
        }
    }
}
