package com.jonathanyi;

public class Main {

    public static void main(String[] args) {
	    Account bobsAccount = new Account();
//	    bobsAccount.setAccountNumber("12345");
//	    bobsAccount.setBalance(0.00);
//	    bobsAccount.setCustomerName("Bob Brown");
//	    bobsAccount.setEmail("myemail.bob.com");
//	    bobsAccount.setPhoneNumber("(087) 123-4567");

	    Account bobsAccount1 = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "12342423");

	    bobsAccount.withdrawFunds(100.0);

	    bobsAccount.depositFunds(50.0);
	    bobsAccount.withdrawFunds(100.0);

	    bobsAccount.depositFunds(51.0);
	    bobsAccount.withdrawFunds(100.0);

	    Account timsAccount = new Account("Tim", "tim@email.com", "1234");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());
        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());
        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@gmail.com");
        System.out.println(customer3.getName());

    }
}
