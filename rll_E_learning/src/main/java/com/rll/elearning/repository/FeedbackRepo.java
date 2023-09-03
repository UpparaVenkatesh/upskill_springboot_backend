package com.rll.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rll.elearning.model.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback,Integer> {

}
