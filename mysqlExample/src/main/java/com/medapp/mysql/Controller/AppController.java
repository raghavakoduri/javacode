package com.medapp.mysql.Controller;

import java.util.List;
import com.medapp.mysql.Service.*;
import com.medapp.mysql.Entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
//@Controller
@RestController
public class AppController {
 
    /*@Autowired
    private ProductService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
    	List<Product> listProducts = service.listAll();
    	model.addAttribute("listProducts", listProducts);
    	return "index";
    	
    }*/
	
	   @Autowired
	    private ProductService service;

	    @PostMapping("/addProduct")
	    public Product addProduct(@RequestBody Product product) {
	        return service.saveProduct(product);
	        
	    }

	    @PostMapping("/addProducts")
	    public List<Product> addProducts(@RequestBody List<Product> products) {
	        return service.saveProducts(products);
	    }

	    @GetMapping("/products")
	    public List<Product> findAllProducts() {
	        return service.getProducts();
	    }

	   /* @GetMapping("/productById/{id}")
	    public Product findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }*/

	    @GetMapping("/product/{name}")
	    public Product findProductByName(@PathVariable String name) {
	        return service.getProductByName(name);
	    }

	    @PutMapping("/update")
	    public Product updateProduct(@RequestBody Product product) {
	        return service.updateProduct(product);
	    }

	    /*@DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	    }*/
	    @GetMapping("/")
	    public ModelAndView index() {
	        return new ModelAndView("index.html");
	    }
}