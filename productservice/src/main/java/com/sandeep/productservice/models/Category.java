package com.sandeep.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity(name="categories")
public class Category extends BaseModel{
    private String name;
   @OneToMany(mappedBy = "category")
    List<Product> products = new ArrayList<>();
}
