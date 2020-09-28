package th.ac.ku.atm.model;

public class BankAccount {

    private int id;
    private int customerId;
    private String type;
    private double balance;

    //  ..Generate.. Getters, Setters, toString()
    public BankAccount(int id, int customerId, String type, double balance) {
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerIdId() {
        return customerId;
    }

    public void setCustomerIdId(int customerId) {
        this.id = customerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() { return balance; }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
