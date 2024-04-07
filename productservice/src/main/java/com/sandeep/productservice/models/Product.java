package com.sandeep.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
    //P:C
    //1:1
    //M:1
    @ManyToOne
    private Category category;
    private Double price;
}
