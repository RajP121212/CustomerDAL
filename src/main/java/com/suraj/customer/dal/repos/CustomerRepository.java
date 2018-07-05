package com.suraj.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.suraj.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
