package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;

public class CenterLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String digits = "1234567890";
        String initPlate = "5";
        Random random = new Random();
        String allowedStates = "AGU CMX DUR GUA HID MEX PUE QUE SLP TLA ZAC";
        final int characters = 8;

        if (!allowedStates.contains(state)) {
            throw new BadRegionException("Allowed state codes: AGU, CMX, DUR, GUA, HID, MEX, PUE, QUE, SLP, TLA, ZAC");
        }else {
            for(int i=0; i < characters - 1; i++){
                initPlate += digits.charAt(random.nextInt(digits.length()));
            }
            return initPlate;
        }
    }
}
