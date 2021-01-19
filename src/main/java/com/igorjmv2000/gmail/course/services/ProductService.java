package com.igorjmv2000.gmail.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorjmv2000.gmail.course.entities.Product;
import com.igorjmv2000.gmail.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		return repository.findById(id).get();
	}
}
