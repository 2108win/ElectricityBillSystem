/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dangc
 */
public abstract class Customer {
    protected int id;
    protected String name;
    protected int prevReading;
    protected int currReading;
    protected int usage;

    public Customer(int id, String name, int prevReading, int currReading) {
        this.id = id;
        this.name = name;
        this.prevReading = prevReading;
        this.currReading = currReading;
        this.usage = currReading - prevReading;
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
        return "Customer [id=" + id + ", name=" + name + ", prevReading=" + prevReading + ", currReading=" + currReading
                + "]";
    }

    public abstract double calculateBill();
}