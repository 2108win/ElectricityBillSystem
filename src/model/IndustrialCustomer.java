/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author dangc
 */
public class IndustrialCustomer extends Customer {
    private double usageCoefficient;

    public IndustrialCustomer(int id, String name, int prevReading, int currReading, double usageCoefficient) {
        super(id, name, prevReading, currReading);
        this.usageCoefficient = usageCoefficient;
    }

    public double calculateBill() {
        double unitPrice = 7000;
        BigDecimal bd = new BigDecimal(usage * unitPrice * usageCoefficient);
        return Double.parseDouble(bd.toPlainString());
    }

    public double getUsageCoefficient() {
        return usageCoefficient;
    }

    public void setUsageCoefficient(double usageCoefficient) {
        this.usageCoefficient = usageCoefficient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrevReading() {
        return prevReading;
    }

    public void setPrevReading(int prevReading) {
        this.prevReading = prevReading;
    }

    public int getCurrReading() {
        return currReading;
    }

    public void setCurrReading(int currReading) {
        this.currReading = currReading;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        BigDecimal bd = new BigDecimal(this.calculateBill());
        return "Industrial Customer [id=" + id + ", name=" + name + ", prevReading=" + prevReading + ", currReading="
                + currReading
                + ", coefficient =" + usageCoefficient + ", bill= " + bd + "]";
    }
}