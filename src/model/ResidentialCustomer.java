/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dangc
 */
public class ResidentialCustomer extends Customer {
  public ResidentialCustomer(int id, String name, int prevReading, int currReading) {
    super(id, name, prevReading, currReading);
  }

  public double calculateBill() {
    double unitPrice = usage <= 100 ? 3500 : 5500;
    return usage * unitPrice;
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
    return "Residential Customer [id=" + id + ", name=" + name + ", prevReading=" + prevReading + ", currReading="
        + currReading
        + ", bill= " + this.calculateBill() + "]";
  }
}