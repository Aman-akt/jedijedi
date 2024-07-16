package com.flipkart.business;

public class CustomerBusiness {
    public void createCustomer() {
        System.out.println("Creating new customer...");

    }

        public boolean deleteCustomer(int customerID) {
            System.out.println("Deleting customer..." + customerID);
            return true;
        }
        public boolean updateCustomer(int customerID) {
            System.out.println("Updating customer..." + customerID);
            return true;
        }

        public void listCustomers() {
            System.out.println("Listing all customers...");
        }
}
