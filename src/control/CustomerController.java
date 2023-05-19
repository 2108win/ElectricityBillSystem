/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;

import model.CommercialCustomer;
import model.Customer;
import model.IndustrialCustomer;
import model.ResidentialCustomer;

/**
 *
 * @author dangc
 */
public class CustomerController {
  static ArrayList<Customer> customers = new ArrayList<>();

  // tạo data trả về kiểu ArrayList<Customer>
  public static ArrayList<Customer> getCustomers() {
    customers.add(new CommercialCustomer(123, "A", 120, 960, 1.8));
    customers.add(new ResidentialCustomer(124, "B", 400, 450));
    customers.add(new CommercialCustomer(125, "C", 300, 689, 1.3));
    customers.add(new IndustrialCustomer(126, "D", 150, 965, 1.0));
    customers.add(new ResidentialCustomer(127, "E", 500, 999));
    customers.add(new IndustrialCustomer(128, "F", 350, 987, 1.1));
    customers.add(new IndustrialCustomer(129, "G", 100, 989, 1.1));
    return customers;
  }

  // tìm kiếm theo id
  public static Customer findCustomer(int id) {
    for (Customer customer : customers) {
      if (customer.getId() == id) {
        return customer;
      }
    }
    return null;
  }

  // tính trung bình
  public static double calculateAvgBill() {
    double totalBill = 0;
    for (Customer customer : customers) {
      totalBill += customer.calculateBill();
    }
    return totalBill / customers.size();
  }

  // tìm khách hàng có hóa đơn cao nhất
  public static Customer findCustomerMaxBill() {
    double maxBill = 0;
    Customer customerMaxBill = null;
    for (Customer customer : customers) {
      double currentBill = customer.calculateBill();
      if (currentBill > maxBill) {
        maxBill = currentBill;
        customerMaxBill = customer;
      }
    }
    return customerMaxBill;
  }

  // tìm khách hàng Hộ sản xuất có hóa đơn cao nhất
  public static Customer findIndustrialCustomerMaxBill() {
    double maxBill = 0;
    Customer customerMaxBill = null;
    for (Customer customer : customers) {
      if (customer instanceof IndustrialCustomer) {
        double currentBill = customer.calculateBill();
        if (currentBill > maxBill) {
          maxBill = currentBill;
          customerMaxBill = customer;
        }
      }
    }
    return customerMaxBill;
  }
}
