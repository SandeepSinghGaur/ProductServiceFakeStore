package com.sandeep.productservice.repository;

import com.sandeep.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CategotyRepository extends JpaRepository<Category, UUID> {
}
