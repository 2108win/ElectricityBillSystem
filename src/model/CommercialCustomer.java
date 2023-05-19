/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dangc
 */
public class CommercialCustomer extends Customer {
    private double usageCoefficient;

    public CommercialCustomer(int id, String name, int prevReading, int currReading, double usageCoefficient) {
        super(id, name, prevReading, currReading);
        this.usageCoefficient = usageCoefficient;
    }

    public double calculateBill() {
        double unitPrice = usage <= 500 ? 5500 : 7000;
        return usage * unitPrice * usageCoefficient;
    }

    @Override
    public String toString() {
        return "Commercial Customer [id=" + id + ", name=" + name + ", prevReading=" + prevReading + ", currReading="
                + currReading
                + ", coefficient =" + usageCoefficient + ", bill= " + this.calculateBill() + "]";
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

}