package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import domain.Product;
import domain.Review;

@Repository
@Transactional
public class ReviewDAOJpaImpl implements ReviewDAO  {

  @Autowired EntityManager em;

  @Override
  public Review findById(int id) {
    return em.find(Review.class, id);
  }

  @Override
  public Review save(Review toBeSaved,int productId) {
	Product p = em.find(Product.class, productId);
	toBeSaved.setProduct(p);
    em.persist(toBeSaved);
    return toBeSaved;
  }

  @Override
  public void deleteById(int id) {
    Review r = em.find(Review.class, id);
    em.remove(r);
  }

  @Override
  public List<Review> findAll() {
    return null;
  }
}



