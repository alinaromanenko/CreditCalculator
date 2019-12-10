package ru.nsu.flowerstore;

public class Calculation {
    private int sumOfCredit;
    private double interestRate;
    private int numberOfMonth;

    public Calculation(int sumOfCredit, double interestRate, int numberOfMonth) {
        this.sumOfCredit = sumOfCredit;
        this.interestRate = interestRate;
        this.numberOfMonth = numberOfMonth;
    }

    public double sumCalculate(){
        return sumOfCredit*(1+totalInterestRate()/100);
    }

    public double totalInterestRate(){
        return interestRate*numberOfMonth/12;
    }

    public double getMonthPaymentSum(){
        return sumCalculate()/numberOfMonth;
    }

    public double getMonthInterestRate(){
        return interestRate/12;
    }

}

