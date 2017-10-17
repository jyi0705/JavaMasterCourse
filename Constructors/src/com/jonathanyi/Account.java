package com.jonathanyi;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // this is a constructor of the class that allows you to pass in parameters to use for the variables
    public Account() {
        // this is calling the Account constructor below to assign default values for it using this keyword
        // make sure this is called first before anymore line of code
        this("54545", 2.50, "Default name", "default@email.com", "0000000");
        System.out.println("Empty constructed called");
    }
    // constructor overloading
    // should have one major constructor and other constructor can call major constructor to have default values for certain parameters
    public Account(String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        // can also do it this way to set account number advantage of this is if you have an validator in the function
        // it will go through validator before setting the account number
        setAccountNumber(number);
        // better to use this.balance over setMethods when you do subclassing
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // used the Code-Generate-constructor provided by inteliJ to create this constructor
    public Account(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    // to quickly create getters and setters in inteliJ go to Code-Generate-Getter and Setter
    public void setAccountNumber(String number) {
        this.number = number;
    }

    public String getAccountNumber() {
        return number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double funds) {
        // can do balance or this.balance. this.balance is better for clarification
        this.balance += funds;
        System.out.println("Deposit of " + funds + " made. New balance is " + this.balance);
    }

    public void withdrawFunds(double funds) {
        if(balance >= funds) {
            this.balance -= funds;
            System.out.println("Withdrawal of " + funds + " processed. Remaining balance = " + this.balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }
    }
}
