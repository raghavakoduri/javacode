package com.medapp.mysql.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medapp.mysql.Repository.*;
import com.medapp.mysql.Entity.*;

import java.util.List;

/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medapp.mysql.Repository.*;
import com.medapp.mysql.Entity.*;

@Service
//@Transactional
public class ProductService {

/*	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll() {
		return  repo.findAll();
	}
	
    public void save(Product product) {
        repo.save(product);
    }
     
    public Product get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }*/
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
    	return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    /*public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }*/

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    /*public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }*/

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
       // existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }


}
