package com.medapp.mysql.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medapp.mysql.Entity.*;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findByName(String name);

	

}
