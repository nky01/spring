package com.nkydev.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import com.nkydev.springboot.di.app.springboot_di.repositories.ProductRepositoryImpl;

public class ProductServiceImpl implements IProductService {

    private ProductRepositoryImpl repository = new ProductRepositoryImpl();

    @Override 
    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            Product newProd = (Product) p.clone();
            newProd.setPrice(priceTax.longValue());
            return newProd;
        }).collect(Collectors.toList());
    }

    @Override 
    public Product findById(Long id) {
        return repository.findById(id);
    }
}