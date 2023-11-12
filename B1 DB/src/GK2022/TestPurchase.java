package GK2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> customers1 = new ArrayList<>();
        System.out.println("Enter bank id: ");
        int bankId = sc.nextInt();
        System.out.println("Enter bank name: ");
        sc.nextLine();
        String bankName = sc.nextLine();
        Bank b1 = new Bank(bankId,bankName,customers1);
        while(true) {
            System.out.println("Enter 1 to create a customer in a bank");
            System.out.println("Enter 2 to implement request");
            System.out.println("Enter 3 to exit");
            String option = sc.nextLine();
            switch (option) {
                case "1": {
                    System.out.println("Enter customer id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter customer name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter customer age: ");
                    int age = sc.nextInt();
                    int ID_bank = b1.getBankId();
                    System.out.println("Enter customer account number: ");
                    sc.nextLine();
                    String accountNum = sc.nextLine();
                    System.out.println("Enter account balance: ");
                    int accountBalance = sc.nextInt();
                    System.out.println("Enter address: ");
                    sc.nextLine();
                    String address = sc.nextLine();
                    boolean membership;
                    if (accountBalance > 1000000) {
                        membership = true;
                    }
                    else membership = false;
                    Customer c1 = new Customer(id,name,age,ID_bank,accountNum,accountBalance,address,membership);
                    b1.addCustomer(c1);
                    break;
                }
                case "2": {
                    System.out.println("Enter a to print out of screen list of bank and customers");
                    System.out.println("Enter b to calculate the total of money in the bank");
                    System.out.println("Enter c to make transaction");
                    System.out.println("Enter d to sort list of customers based on customer's balance");
                    System.out.println("Enter e to check a specific customer's balance");
                    String line = sc.nextLine();
                    switch (line) {
                        case "a": {
                            System.out.println(b1);
                            System.out.println(b1.getBankName() + " customers: " + b1.getCustomers());
                            break;
                        }
                        case "b": {
                            System.out.println(b1.getBankName() + " balance: " + b1.sumMoneyBank());
                            break;
                        }
                        case "c": {
                            System.out.println("Enter a to add money");
                            System.out.println("Enter b to transfer money");
                            System.out.println("Enter c to withdraw money");
                            String option2 = sc.nextLine();
                            switch (option2) {
                                case "a": {
                                    System.out.println("Enter the amount of money: ");
                                    double money = sc.nextDouble();
                                    System.out.println("Enter receiver id: ");
                                    sc.nextLine();
                                    String receiverID = sc.nextLine();
                                    System.out.println("Enter receiver account num: ");
                                    String receiverAccountNum = sc.nextLine();
                                    Customer receiverCustomer = Bank.getCustomerbyIDandNum(receiverID, receiverAccountNum);
                                    receiverCustomer.addMoney(money);
                                    break;
                                }
                                case "b": {
                                    System.out.println("Enter the amount of money: ");
                                    double money = sc.nextDouble();
                                    System.out.println("Enter sender id: ");
                                    sc.nextLine();
                                    String senderID = sc.nextLine();
                                    System.out.println("Enter sender account number: ");
                                    String senderAccountNum = sc.nextLine();
                                    System.out.println("Enter receiver id: ");
                                    String id = sc.nextLine();
                                    System.out.println("Enter receiver account number: ");
                                    String num = sc.nextLine();
                                    Customer sender = Bank.getCustomerbyIDandNum(senderID, senderAccountNum);
                                    Customer receiver = Bank.getCustomerbyIDandNum(id, num);
                                    if (sender == null || receiver == null) {
                                        System.out.println("Invalid id and accountnum.");
                                    }
                                    else {
                                    System.out.println(sender.transferMoney(sender, receiver, money));
                                    }
                                    break;
                                }
                                case "c": {
                                    System.out.println("Enter the amount of money: ");
                                    double money = sc.nextDouble();
                                    System.out.println("Enter wd person id: ");
                                    sc.nextLine();
                                    String wdID = sc.nextLine();
                                    System.out.println("Enter wd account num: ");
                                    String wdAccountNum = sc.nextLine();
                                    Customer receiver = Bank.getCustomerbyIDandNum(wdID,wdAccountNum);
                                    receiver.withdrawMoney(money);
                                    break;
                                }
                                case "e": {
                                    System.out.println("Enter customer id: ");
                                    sc.nextLine();
                                    String cusID = sc.nextLine();
                                    System.out.println("Enter account num: ");
                                    String cusAccountNum = sc.nextLine();
                                    for (Customer customer : customers1) {
                                        System.out.println("Balance: " + customer.checkAccount(cusID,cusAccountNum));
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println("Invalid");
                                    break;
                                }
                            }
                            break;
                        }
                        case "d": {
                            Collections.sort(customers1);
                            for(Customer customer : customers1) {
                                System.out.println(customer);
                            }
                        }
                        default: {
                            System.out.println("Invalid");
                            break;
                        }
                    }
                    break;
                }
                case "3": {
                    return;
                }
                default: {
                    System.out.println("Invalid");
                    continue;
                }
            }
        }
    }
}