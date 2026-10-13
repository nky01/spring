package com.nkydev.springboot.di.app.springboot_di.services;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(Long id);
}
