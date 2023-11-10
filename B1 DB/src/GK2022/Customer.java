package GK2022;

public class Customer extends Bank implements Implement,Comparable<Customer>{
    private String id;
    private String name;
    private int age;
    private int ID_bank;
    private String accountNum;
    private double accountBalance;
    private String address;
    private boolean membership;


    public Customer(String id, String name, int age, int ID_bank, String accountNum, double accountBalance, String address, boolean membership) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ID_bank = ID_bank;
        this.accountNum = accountNum;
        this.accountBalance = accountBalance;
        this.address = address;
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account number=" + accountNum +
                ", account balance=" + accountBalance +
                ", address='" + address + '\'' +
                ", membership='" + membership + '\'' +
                '}';
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID_bank() {
        return ID_bank;
    }

    public void setID_bank(int ID_bank) {
        this.ID_bank = ID_bank;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }
    @Override
    public double addMoney(String receiverID, String receiverAccountNum, double moneyADD) {
        Customer receiver1;
        try {
            receiver1 = Bank.getCustomerbyIDandNum(receiverID, receiverAccountNum);
        }
        catch (NullPointerException exc1) {
            System.out.println("Invalid id and accountnum.");
        }
        receiver1.accountBalance += moneyADD;
        return receiver1.accountBalance;
    }
    @Override
    public double withdrawMoney(String wdID, String wdAccountNum, double moneyWD) {
        Customer wd;
        try {
            wd = Bank.getCustomerbyIDandNum(wdID, wdAccountNum);
        }
        catch (NullPointerException exc1) {
            System.out.println("Invalid id and accountnum.");
        }
        if(moneyWD > 50000) {
            if(wd.getAccountBalance() >= moneyWD) {
                if(membership == true) {
                    wd.accountBalance = wd.accountBalance - moneyWD;
                }
                else wd.accountBalance = wd.accountBalance - moneyWD - 2000;
            }
            else {
                System.out.println("Not have enough balance for transaction!");
            }
        }
        else {
            System.out.println("Withdraw money is smaller than requirement!");
        }
        return wd.accountBalance;
    }
    @Override
    public boolean transferMoney(String senderId, String senderAccountNumber, String receiverId, String receiverAccountNumber, double amount) {
        Customer receiver;
        Customer sender;

        try {
            sender = Bank.getCustomerbyIDandNum(senderId, senderAccountNumber);
            receiver = Bank.getCustomerbyIDandNum(receiverId, receiverAccountNumber);
        }
        catch (NullPointerException exc) {
            System.out.println("Invalid id and accountnum.");
            return false;
        }

        if (amount > 10000 && sender.getAccountBalance() >= amount) {
            if(membership == true) {
                receiver.accountBalance = receiver.accountBalance + amount;
                sender.accountBalance = sender.accountBalance - amount;
                return true;
            }
            else {
                sender.accountBalance = sender.accountBalance - amount - 2000;
                receiver.accountBalance = receiver.accountBalance + amount;
                return true;
            }
        }
        else {
            System.out.println("Insufficient balance or amount less than 10000.");
            return false;
        }
    }

    @Override
    public double checkAccount(String id, String accountNum) {
        return getCustomerbyIDandNum(id,accountNum).accountBalance;
    }
    public int compareTo(Customer customer) {
        if (this.accountBalance < customer.accountBalance) return -1;
        if (this.accountBalance > customer.accountBalance) return 1;
        return 0;
    }
}