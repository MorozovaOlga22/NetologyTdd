package ru.netology;

/**
 * Дорогие клиенты! Наш Банк использует наиболее простые формулы для расчета кредита,
 * чтобы Вам было удобнее считать, сколько денег Вы потеряете вместе с нами.
 */
public class CreditService {
    /**
     * Метод рассчитывает месячный платеж
     *
     * @param loanAmount           - размер кредита
     * @param creditRateInPercents - кредитная ставка в процентах
     * @param months               - количество месяцев
     */
    public static int getMonthlyPayment(int loanAmount, int creditRateInPercents, int months) {
        /*TODO*/
        return 0;
    }

    /**
     * Метод рассчитывает общую сумму к возврату в Банк
     *
     * @param loanAmount           - размер кредита
     * @param creditRateInPercents - кредитная ставка в процентах
     */
    public static int getTotalSum(int loanAmount, int creditRateInPercents) {
        /*TODO*/
        return 0;
    }

    /**
     * Метод рассчитывает переплату за весь период
     *
     * @param loanAmount           - размер кредита
     * @param creditRateInPercents - кредитная ставка в процентах
     */
    public static int getOverpayment(int loanAmount, int creditRateInPercents) {
        /*TODO*/
        return 0;
    }
}
