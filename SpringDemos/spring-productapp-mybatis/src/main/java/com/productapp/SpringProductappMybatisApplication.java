package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}

//	@Autowired
//	IProductService productService;
//	@Override
//	public void run(String... args) throws Exception {
//		Product product=new Product(1,"mobile","apple",150000,"15pro");
//		productService.addproduct(product);
//		Product product=new Product(3,"mobile","oneplus",80000,"8pro");
//		productService.addproduct(product);
//		Product product=new Product(5,"mobile","realme",80000,"8pro");
//		productService.addproduct(product);
		//productService.updateProduct(3, 85000);
		//productService.deleteProduct(4);
	}

//}