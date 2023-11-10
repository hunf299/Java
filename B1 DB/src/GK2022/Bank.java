package GK2022;

import java.util.List;

public class Bank {
    private int bankID;
    private String bankName;
    private static List<Customer> customers;

    public Bank(int bankId, String bankName, List<Customer> customers) {
        this.bankID = bankId;
        this.bankName = bankName;
        this.customers = customers;
    }
    public Bank() {
    }
    public int getBankId() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public static Customer getCustomerbyIDandNum(String id, String accountNumber) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id) && customer.getAccountNum().equals(accountNumber)) {
                return customer;
            }
        }
        return null;
    }
    public double sumMoneyBank() {
        return this.customers.stream().mapToDouble(Customer::getAccountBalance).sum();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id='" + bankID + '\'' +
                ", bank name='" + bankName + '\'' +
                ", sum of money='" + sumMoneyBank() +
                ", customer list=" + getCustomers() +
                '}';
    }
}