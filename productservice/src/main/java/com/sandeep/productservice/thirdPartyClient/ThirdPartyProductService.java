package com.sandeep.productservice.thirdPartyClient;

import com.sandeep.productservice.Dtos.FakeStoreProductDto;
import com.sandeep.productservice.Dtos.GenericProductDto;

import java.util.List;

public interface ThirdPartyProductService {
    public GenericProductDto getProductByID(Long id);

    public  GenericProductDto createProduct(GenericProductDto product);

    public List<GenericProductDto> getAllProducts();

    public GenericProductDto deleteProductById(Long id);

    public GenericProductDto updateProductById(Long id, FakeStoreProductDto fakeStoreProductDto);
}
