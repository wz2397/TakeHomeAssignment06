package com.example.weiyingzhu.takehomeassignment06;

import java.io.Serializable;

/**
 * Created by weiyingzhu on 18/3/4.
 */

public class Money implements Serializable {
    private double amount;
    private double tip;
    private double tax;

    public Money(double amounts, double tip, double tax) {
        this.amount = amounts;
        this.tip = tip;
        this.tax = tax;
    }



    public double setTip() {

        return amount*tip;
    }

    public double setTax() {
        return amount*tax;
    }
    public double setAmounts() {
        return amount= amount+amount*tax+amount*tip;
    }

    public void getAmounts(long amounts) {
        this.amount = amounts;
    }

    public double getAmounts() {
        return amount;
    }

    public double getTip() {
        return tip;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        double tips=amount*tip;
        double taxes=amount*tax;
        double amount1=amount+tip+tax;
        return " Total: " + amount+"\n" +
                " Tip: " +tips + "\n" +
                " Tax: " + taxes + "\n" +
                " Grand total: " + amount1;
    }
}
