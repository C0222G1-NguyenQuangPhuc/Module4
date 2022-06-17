package com.codegym.model;

public class Product {

    private Integer idProduct;
    private String nameProduct;
    private Integer price;
    private String description;
    private String manufacturer;

    public Product() {
    }

    public Product(Integer idProduct, String nameProduct, Integer price, String description, String manufacturer) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
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
}
