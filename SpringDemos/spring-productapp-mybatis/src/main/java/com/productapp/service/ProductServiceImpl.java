package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;
@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductRepository productRepository;

	@Override
	public void addproduct(Product product) {
		productRepository.addproduct(product);
		
	}

	@Override
	public void updateProduct(int productId,double price) {
		productRepository.updateProduct(productId, price);
		
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteProduct(productId);
		
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		Product product= productRepository.findById(productId);
		if(product==null)
			throw new ProductNotFoundException("invalid Id");
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> product=productRepository.findAll();
		return product;
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
	List<Product>product= productRepository.findByBrand(brand);
		return product;
	}

	@Override
	public List<Product> getByLessPrice(double price) throws ProductNotFoundException {
		List<Product> product=productRepository.findByLessPrice(price);
		return product;
	}

	@Override
	public List<Product> getByCategoryandPrice(String category, double price) throws ProductNotFoundException {
		List<Product> product=productRepository.findByCategoryandPrice(category, price);
		return product;
	}

}
