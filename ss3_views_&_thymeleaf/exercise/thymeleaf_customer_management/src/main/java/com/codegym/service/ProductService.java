package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    private static final Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Iphone11", 800, "New", "Apple"));
        products.put(2, new Product(2, "Xiaomi11", 500, "New", "Xiaomi"));
        products.put(3, new Product(3, "OppoNeo2", 400, "New", "Oppo"));
        products.put(4, new Product(4, "SamsungS12", 700, "New", "Samsung"));
        products.put(5, new Product(5, "RedMi K50", 350, "New", "Redmi"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getIdProduct(), product);
    }

    @Override
    public Integer createId() {
        Product product = this.findAll().get(this.findAll().size() - 1);
        return product.getIdProduct() + 1;
    }

    @Override
    public List<Product> searchByName(Product product) {
        List<Product> searchList = new ArrayList<>();
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if (entry.getValue().getNameProduct().toLowerCase().contains(product.getNameProduct().toLowerCase())) {
                searchList.add(entry.getValue());
            }
        }
        return searchList;
    }

    @Override
    public Product findById(Integer id) {
        return products.get(id);
    }

    @Override
    public void update(Integer id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(Integer id) {
        products.remove(id);
    }
}
