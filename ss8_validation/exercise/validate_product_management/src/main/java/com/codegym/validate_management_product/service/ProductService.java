package com.codegym.validate_management_product.service;

import com.codegym.validate_management_product.model.Product;
import com.codegym.validate_management_product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> findAllProduct(Pageable pageable) {
        return iProductRepository.findAllProduct(pageable);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product.getNameProduct(), product.getPrice(), product.getDescription(), product.getManufacturer());
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findByIdProduct(id);
    }

    @Override
    public void update(Product product) {
        iProductRepository.update(product.getNameProduct(), product.getPrice(), product.getDescription(), product.getManufacturer(), product.getIdProduct());
    }

    @Override
    public void remove(Product product) {
        iProductRepository.delete(product.getIdProduct());
    }

    @Override
    public Page<Product> findAllProductByName(Pageable pageable, Product product) {
        return iProductRepository.findAllProductByName(pageable, product.getNameProduct());
    }


}
