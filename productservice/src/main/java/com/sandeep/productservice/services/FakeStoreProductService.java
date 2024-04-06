package com.sandeep.productservice.services;

import com.sandeep.productservice.Dtos.FakeStoreProductDto;
import com.sandeep.productservice.Dtos.GenericProductDto;
import com.sandeep.productservice.exceptions.NotFoundException;
import com.sandeep.productservice.thirdPartyClient.FakeStoreThirdPartyProductService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    private FakeStoreThirdPartyProductService fakeStoreThirdPartyProductService;

    public FakeStoreProductService(FakeStoreThirdPartyProductService fakeStoreThirdPartyProductService){
        this.fakeStoreThirdPartyProductService = fakeStoreThirdPartyProductService;
    }
    @Override
    public GenericProductDto getProductByID(Long id) {
        return this.fakeStoreThirdPartyProductService.getProductByID(id);
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        return this.fakeStoreThirdPartyProductService.createProduct(product);
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        return this.fakeStoreThirdPartyProductService.getAllProducts();
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        return this.fakeStoreThirdPartyProductService.deleteProductById(id);

    }

    @Override
    public GenericProductDto updateProductById(Long id,FakeStoreProductDto fakeStoreProductDto) {
        return this.fakeStoreThirdPartyProductService.updateProductById(id,fakeStoreProductDto);
    }
}
