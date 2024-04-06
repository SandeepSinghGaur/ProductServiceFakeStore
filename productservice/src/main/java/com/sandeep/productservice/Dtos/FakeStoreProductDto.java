package com.sandeep.productservice.Dtos;

import com.sandeep.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
