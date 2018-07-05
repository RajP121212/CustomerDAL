package com.suraj.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.suraj.customer.dal.entities.Customer;
import com.suraj.customer.dal.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerDalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer() {

		Customer customer = new Customer();
		customer.setC_name("Suraj Pillutla");
		customer.setC_email("Suraj@gmail.com");

		customerRepository.save(customer);
	}

	@Test
	public void testFindCustomerById() {

		Customer customer = customerRepository.findById(1).get();
		System.out.println(customer);
	}

	@Test
	public void testUpdateCustomerById() {

		Customer customer = customerRepository.findById(1).get();
		customer.setC_email("SurajPillutla@gmail.com");

		customerRepository.save(customer);
	}

	@Test
	public void testDeleteCustomerById() {

		Customer customer = new Customer();
		customer.setId(1);

		customerRepository.delete(customer);
	}

}
