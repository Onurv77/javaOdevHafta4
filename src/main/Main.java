package main;

import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisAdapterService;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisAdapterService());
		try {
			customerManager.save(new Customer(0,"Onur","Özcan",LocalDate.of(2000, 1, 6),"2000000000"));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
