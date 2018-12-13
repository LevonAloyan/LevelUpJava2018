package com.company.codeWars;


public class DigitalRoot {

    public int digital_root (int n) {
        int sum = 0;
        int midvalue;
        int digit;
        while (n > 0) {
            digit = n % 10;
            midvalue = n / 10;
            sum = sum + digit;
            n = midvalue;

        }
        int result = sum;
        if (result > 10) {
            System.out.println("=> " + sum);
            result = digital_root(result);
            return result;
        }
    return sum;
    }

    public static void main(String[] args) {
        DigitalRoot result = new DigitalRoot();
        System.out.println("=> " + result.digital_root(493193));
    }
}
