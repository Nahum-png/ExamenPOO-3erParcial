package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;

public class SouthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String digits = "1234567890";
        String initPlate = "4";
        Random random = new Random();
        String allowedStates = "CHP GRO MIC OAX";
        int flag = 0;
        final int characters = 7;

        if (!allowedStates.contains(state)) {
            throw new BadRegionException("Allowed state codes: CHP, GRO, MIC, OAX");
        }else {
            for(int i=0; i < characters - 4; i++){
                if((random.nextInt(digits.length()) % 2) == 1 && flag != 1){
                    initPlate += state;
                    flag = 1;
                }
                initPlate += digits.charAt(random.nextInt(digits.length()));
            }
            return initPlate;
        }
    }
}
