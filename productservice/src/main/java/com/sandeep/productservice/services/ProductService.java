package com.sandeep.productservice.services;

import com.sandeep.productservice.Dtos.FakeStoreProductDto;
import com.sandeep.productservice.Dtos.GenericProductDto;
import com.sandeep.productservice.exceptions.NotFoundException;
import com.sandeep.productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public GenericProductDto getProductByID(Long id) throws NotFoundException;

   public  GenericProductDto createProduct(GenericProductDto product);

    public List<GenericProductDto> getAllProducts();

    public GenericProductDto deleteProductById(Long id);

    public GenericProductDto updateProductById(Long id, FakeStoreProductDto fakeStoreProductDto);
}
