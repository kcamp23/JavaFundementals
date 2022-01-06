package com.careerdevs.intro;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String[] args){
        final byte MONTHS = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Principal:");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/ PERCENT / MONTHS

        System.out.print("Period(Years):");
        byte years = scanner.nextByte();
        int payments = years * MONTHS;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,payments))


    }
}
