package com.sandeep.productservice.services;

import com.sandeep.productservice.Dtos.FakeStoreProductDto;
import com.sandeep.productservice.Dtos.GenericProductDto;
import com.sandeep.productservice.models.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("selfProductServiceImpl")
public class SelfProductServiceImple implements ProductService{
    @Override
    public GenericProductDto getProductByID(Long id) {
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        return null;
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        return null;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDto updateProductById(Long id, FakeStoreProductDto fakeStoreProductDto) {
        return null;
    }
}
