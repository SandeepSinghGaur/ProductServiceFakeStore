package com.sandeep.productservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
    @ManyToOne
    @JoinColumn(name = "Category")
    private Category category;
    @OneToOne
    private Price price = new Price();
}
