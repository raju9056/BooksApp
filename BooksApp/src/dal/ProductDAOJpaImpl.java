package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Product;

@Repository
public class ProductDAOJpaImpl implements ProductDAO {
	@Autowired
	EntityManager em;

  @Override
  public Product save(Product toBeSaved) {
    em.persist(toBeSaved);
    return toBeSaved;
  }

  @Override
  public Product findById(int id) {
    return em.find(Product.class, id);
  }

  @Override
  public List<Product> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteById(int id) {
    Product p = em.find(Product.class, id);
    em.remove(p);
    
  }
	
}
