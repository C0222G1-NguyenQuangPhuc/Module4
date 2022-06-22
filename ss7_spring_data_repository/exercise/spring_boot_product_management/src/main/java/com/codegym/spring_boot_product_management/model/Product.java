package com.codegym.spring_boot_product_management.model;

import javax.persistence.*;

@Entity(name = "product")
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer idProduct;
    @Column(name = "name_product")
    private String nameProduct;
    private Integer price;
    private String description;
    private String manufacturer;
    @Column(name = "status_delete")
    private Integer statusDelete;

    public Product() {
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(Integer statusDelete) {
        this.statusDelete = statusDelete;
    }
}
