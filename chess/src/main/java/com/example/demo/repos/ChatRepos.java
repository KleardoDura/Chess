package com.example.demo.repos;

import com.example.demo.models.Chat;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepos extends JpaRepository<Chat, Integer> {
}
