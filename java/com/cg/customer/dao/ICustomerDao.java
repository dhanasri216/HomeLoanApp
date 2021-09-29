package com.cg.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.customer.entity.Customer;

@Repository
public interface ICustomerDao extends JpaRepository<Customer, Integer> {

}
