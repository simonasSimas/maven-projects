package eu.academy.test.service;

import eu.academy.test.service.GpmValidator;

public class ChangeGpmValidator extends GpmValidator {
    @Override
    public void checkGpmCode(int code) {
        int[] a = new int[9];
        int A1;
        int A2;
        int R1;
        int R2;
        int C9;
        String numbCode = "" + code;
        if (numbCode.length() == 9) {
            if (numbCode.charAt(7) == '1') {
                for (int i = 0; i < numbCode.length(); i++) {
                    a[i] = Integer.parseInt("" + numbCode.charAt(i));
                }
                A1 = a[0] + 2 * a[1] + 3 * a[2] + 4 * a[3] + 2 * a[4] + 6 * a[5] + 7 * a[6] + 8 * a[7];
                R1 = A1 % 11;
                if (R1 != 10) {
                    C9 = R1;
                } else {
                    A2 = 3 * a[0] + 4 * a[1] + 5 * a[2] + 6 * a[3] + 2 * a[4] + 8 * a[5] + 9 * a[6] + a[7];
                    R2 = A2 % 11;
                    if (R2 == 22) {
                        C9 = 0;
                    } else {
                        C9 = R2;
                    }
                }
                if (C9 == a[8]) {
                    System.out.println("your code is valid");
                } else {
                    System.out.println("Invalid code");
                }
            } else {
                System.out.println("Invalid code");
            }

        } else {
            System.out.println("Invalid code");
        }
    }
}
