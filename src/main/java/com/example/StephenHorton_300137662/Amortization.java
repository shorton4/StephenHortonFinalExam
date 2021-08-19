package com.example.StephenHorton_300137662;

public class Amortization {
    private int year;
    private double startingAmount;
    private double interest;
    private double monthlyPayment;
    private double endingBalance;
    private double loanAmount;
    private double monthlyRate;
    private int termInMonths;
    private double balance;
    private double interestRate;

    public Amortization(int year, double startingAmount, double interest, double monthlyPayment, double endingBalance) {
        this.year = year;
        this.startingAmount = startingAmount;
        this.interest = interest;
        this.monthlyPayment = monthlyPayment;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public double getStartingAmount() {
        return startingAmount;
    }

    public void setStartingAmount(double startingAmount) {
        this.startingAmount = startingAmount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    public double calcInterest(double interest, double interestRate, double monthlyPayment, double balance){
        interest = balance * interestRate;
        return interest;
    }

    public double getMonthlyPayment() {

        return monthlyPayment;
    }

    public double calcMonthlyPayment(double monthlyPayment, double loanAmount, double monthlyRate, int termInMonths){
        monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
                return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getEndingBalance() {
        return endingBalance;
    }

    public void setEndingBalance(double endingBalance) {
        this.endingBalance = endingBalance;
    }
}

