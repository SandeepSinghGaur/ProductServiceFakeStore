package com.sandeep.productservice.thirdPartyClient;

import com.sandeep.productservice.Dtos.FakeStoreProductDto;
import com.sandeep.productservice.Dtos.GenericProductDto;
import com.sandeep.productservice.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreThirdPartyProductService implements ThirdPartyProductService{
    private RestTemplateBuilder restTemplateBuilder;

    @Value("${fakestore.api.url}")
    private String fakeStoreApiUrl;

    @Value("${fakestore.api.paths.products}")
    private String fakeStoreProductsApiPath;
    private String fakeStoreProductBaseUrl;
    private String specificFakeStoreProductUrl;


    public FakeStoreThirdPartyProductService(RestTemplateBuilder restTemplateBuilder,@Value("${fakestore.api.url}")String fakeStoreApiUrl,@Value("${fakestore.api.paths.products}") String fakeStoreProductsApiPath){
        this.restTemplateBuilder = restTemplateBuilder;
        this.fakeStoreProductBaseUrl = fakeStoreApiUrl + fakeStoreProductsApiPath;;
        this.specificFakeStoreProductUrl = this.fakeStoreProductBaseUrl+ "/{id}";;
    }
    @Override
    public GenericProductDto getProductByID(Long id) {
        RestTemplate restTemplate = this.restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response = restTemplate.getForEntity(this.specificFakeStoreProductUrl, FakeStoreProductDto.class, id);
        if (response.getBody() == null) {
            throw new NotFoundException("Product with this  " + id + " doesn't exits");
        }

        FakeStoreProductDto fakeStoreProductDto = response.getBody();
        GenericProductDto product = new GenericProductDto();
        product.setCategory(fakeStoreProductDto.getCategory());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImage(fakeStoreProductDto.getImage());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        return product;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        RestTemplate restTemplate = this.restTemplateBuilder.build();
        ResponseEntity<GenericProductDto> response = restTemplate.postForEntity(fakeStoreProductBaseUrl,product,GenericProductDto.class);
        return response.getBody();
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        RestTemplate restTemplate=this.restTemplateBuilder.build();
        ResponseEntity<List >response=restTemplate.getForEntity(fakeStoreProductBaseUrl,List.class);
        return response.getBody();
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        RestTemplate restTemplate=this.restTemplateBuilder.build();
        RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(GenericProductDto.class);
        ResponseExtractor<ResponseEntity<GenericProductDto>> responseExtractor = restTemplate.responseEntityExtractor(GenericProductDto.class);
        ResponseEntity<GenericProductDto> response =restTemplate.execute(specificFakeStoreProductUrl, HttpMethod.DELETE,requestCallback,responseExtractor,id);
        return response.getBody();
    }

    @Override
    public GenericProductDto updateProductById(Long id, FakeStoreProductDto fakeStoreProductDto) {
        RestTemplate restTemplate = this.restTemplateBuilder.build();
        RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(GenericProductDto.class);
        ResponseExtractor<ResponseEntity<GenericProductDto>> responseExtractor = restTemplate.responseEntityExtractor(GenericProductDto.class);
        ResponseEntity<GenericProductDto> response =restTemplate.execute(specificFakeStoreProductUrl, HttpMethod.PUT,requestCallback,responseExtractor,id);
        response.getBody().setPrice(fakeStoreProductDto.getPrice());
        response.getBody().setCategory(fakeStoreProductDto.getCategory());
        response.getBody().setTitle(fakeStoreProductDto.getTitle());
        response.getBody().setImage(fakeStoreProductDto.getImage());
        return response.getBody();
    }
}
