package eu.academy.test;

import eu.academy.test.service.ChangeGpmValidator;
import eu.academy.test.service.GpmValidator;

public class App {
    public static void main(String[] args) {
        GpmValidator gpmValidator = new GpmValidator();
        gpmValidator.checkGpmCode(213179422);
        gpmValidator.checkGpmCode(213179412);
        ChangeGpmValidator changeGpmValidator = new ChangeGpmValidator();
        changeGpmValidator.checkGpmCode(213179422);
        changeGpmValidator.checkGpmCode(213179412);
    }
}
