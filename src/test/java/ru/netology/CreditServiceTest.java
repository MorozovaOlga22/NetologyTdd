package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditServiceTest {

    @Test
    public void getMonthlyPayment() {
        final int loanAmount = 5_000;
        final int creditRateInPercents = 20;
        final int months = 12;

        final int expectedMonthlyPayment = 500;

        final int actualMonthlyPayment = CreditService.getMonthlyPayment(loanAmount, creditRateInPercents, months);

        assertEquals(expectedMonthlyPayment, actualMonthlyPayment);
    }

    @Test
    public void getTotalSum() {
        final int loanAmount = 5_000;
        final int creditRateInPercents = 20;

        final int expectedTotalSum = 6_000;

        final int actualTotalSum = CreditService.getTotalSum(loanAmount, creditRateInPercents);

        assertEquals(expectedTotalSum, actualTotalSum);
    }

    @Test
    public void getOverpayment() {
        final int loanAmount = 5_000;
        final int creditRateInPercents = 20;

        final int expectedOverpayment = 1_000;

        final int actualOverpayment = CreditService.getOverpayment(loanAmount, creditRateInPercents);

        assertEquals(expectedOverpayment, actualOverpayment);
    }
}