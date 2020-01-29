package com.rakuten.training.dal;

import java.util.List;

import domain.Review;

public interface ReviewDAO {

  Review findById(int id);

  Review save(Review toBeSaved, int productId);

  void deleteById(int id);

  List<Review> findAll();
}