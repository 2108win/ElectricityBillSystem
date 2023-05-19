/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;
// import java.util.Scanner;

/**
 *
 * @author dangc
 *
 */

public class ElectricityBillingSystem {
  ArrayList<Customer> customers = new ArrayList<>();

  public void printCustomers() {
    for (Customer customer : customers) {
      System.out.println(customer);
    }
  }

  public void addCustomer(Customer customer) {
    customers.add(customer);
  }

  public void removeCustomer(Customer customer) {
    customers.remove(customer);
  }

  public void removeCustomer(int id) {
    for (Customer customer : customers) {
      if (customer.id == id) {
        removeCustomer(customer);
        break;
      }
    }
  }

  public void findCustomer(int id) {
    for (Customer customer : customers) {
      if (customer.id == id) {
        System.out.println(customer);
        break;
      }
    }
  }

  public double avgBill() {
    double totalBill = 0;
    for (Customer customer : customers) {
      totalBill += customer.calculateBill();
    }
    return totalBill / customers.size();
  }

  public void findCustomerMaxBill() {
    double maxBill = 0;
    String customerName = "";
    for (Customer customer : customers) {
      double currentBill = customer.calculateBill();
      if (currentBill > maxBill) {
        maxBill = currentBill;
        customerName = customer.name;
      }
    }
    System.out.printf("First customer with highest bill: %s (%.0f VND)\n", customerName, maxBill);
  }

  public void findCustomerIndustrialMinBill() {
    double minBill = 0;
    String customerName = "";
    for (Customer customer : customers) {
      if (customer instanceof IndustrialCustomer) {
        System.out.println(customer);
        double currentBill = customer.calculateBill();
        if (currentBill < minBill) {
          minBill = currentBill;
          customerName = customer.name;
        }
      }
    }
    System.out.printf("First industrial customer with lowest bill: %s (%.0f VND)\n", customerName, minBill);
  }

  public ArrayList<Customer> loadData() {
    customers.add(new CommercialCustomer(123, "A", 120, 960, 1.8));
    customers.add(new ResidentialCustomer(124, "B", 400, 450));
    customers.add(new CommercialCustomer(125, "C", 300, 689, 1.3));
    customers.add(new IndustrialCustomer(126, "D", 150, 965, 1.5));
    customers.add(new ResidentialCustomer(127, "E", 500, 999));
    customers.add(new IndustrialCustomer(128, "F", 350, 987, 1.6));
    customers.add(new IndustrialCustomer(129, "G", 100, 989, 1.9));
    return customers;
  }

  // public static void main(String[] args) {
  // // Yêu cầu 1: Thực hiện việc tính toán điện cho từng khách hàng.
  // // Yêu cầu 2: Tìm kiếm tên chủ hộ, số tiền điện theo mã khách hàng.
  // // Yêu cầu 3: Tính trung bình tiền điện của tất cả các khách hàng trong
  // Phường.
  // // Yêu cầu 4: Tìm khách hàng đầu tiên có số tiền điện cao nhất.
  // // Yêu cầu 5: Tìm khách hàng loại "Hộ sản xuất" có số tiền điện nhỏ nhất.
  // // Yêu cầu 6: Khởi tạo nhanh 7 khách hàng có dữ liệu cho trước.
  // ElectricityBillingSystem ebs = new ElectricityBillingSystem();
  // System.out.println("1: Khoi tao nhanh 7 khach hang.");
  // System.out.println("2: Tinh tien dien cho tung khach hang.");
  // System.out.println("3: Tim kiem khach hang theo ma khach hang.");
  // System.out.println("4: Tinh trung binh tien dien cua tat ca cac khach
  // hang.");
  // System.out.println("5: Tim khach hang dau tien co so tien dien cao nhat.");
  // System.out.println("6: Tim khach hang loai 'Ho san xuat' co so tien dien nho
  // nhat.");
  // System.out.println("0: Thoat chuong trinh.");
  // Scanner scanner = new Scanner(System.in);
  // int choice = -1;
  // while (choice != 0) {
  // System.out.print("Nhap lua chon: ");
  // choice = scanner.nextInt();
  // switch (choice) {
  // case 1:
  // ebs.loadData();
  // break;
  // case 2:
  // ebs.printCustomers();
  // break;
  // case 3:
  // System.out.print("Nhap ma khach hang: ");
  // int id = scanner.nextInt();
  // ebs.findCustomer(id);
  // break;
  // case 4:
  // System.out.printf("Trung binh tien dien cua tat ca cac khach hang: %.0f
  // VND\n", ebs.avgBill());
  // break;
  // case 5:
  // ebs.findCustomerMaxBill();
  // break;
  // case 6:
  // ebs.findCustomerIndustrialMinBill();
  // break;
  // case 0:
  // System.out.println("Thoat chuong trinh.");
  // break;
  // default:
  // System.out.println("Lua chon khong hop le.");
  // break;
  // }
  // }
  // scanner.close();
  // }
}
