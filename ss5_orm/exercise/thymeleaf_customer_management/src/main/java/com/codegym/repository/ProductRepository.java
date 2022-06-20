package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findAll() {
        List<Product> productList = BaseRepository.entityManager.createQuery("select p from product p", Product.class).getResultList();
        return productList;
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(Integer id) {
        Product product = BaseRepository.entityManager.createQuery("select p from product p where p.idProduct = ?1", Product.class).setParameter(1, id).getSingleResult();
        return product;
    }

    @Override
    public void update(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void remove(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(findById(product.getIdProduct()));
        entityTransaction.commit();
    }

    @Override
    public List<Product> searchByName(Product product) {
        List<Product> searchList = BaseRepository.entityManager
                .createQuery("select p from product p where p.nameProduct like ?1", Product.class)
                .setParameter(1, "%" + product.getNameProduct() + "%")
                .getResultList();
        return searchList;
    }
}
