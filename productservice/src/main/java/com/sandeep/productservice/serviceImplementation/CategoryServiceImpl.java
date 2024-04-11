package com.sandeep.productservice.serviceImplementation;

import com.sandeep.productservice.models.Category;
import com.sandeep.productservice.repository.CategotyRepository;
import com.sandeep.productservice.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategotyRepository categotyRepository;

    public CategoryServiceImpl(CategotyRepository categotyRepository) {
        this.categotyRepository = categotyRepository;
    }
    @Override
    public String getCategoryById(String id) {
        Optional<Category> category=this.categotyRepository.findById(UUID.fromString(id));
        Category c1 = category.get();
        System.out.println("=============================================");
        System.out.println("Result"+" "+c1.getProducts());
        System.out.println("=============================================");
        return c1.getName();
    }
}
