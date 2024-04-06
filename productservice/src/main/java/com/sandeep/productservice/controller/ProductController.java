package com.sandeep.productservice.controller;

import com.sandeep.productservice.Dtos.FakeStoreProductDto;
import com.sandeep.productservice.Dtos.GenericProductDto;
import com.sandeep.productservice.exceptions.NotFoundException;
import com.sandeep.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    private ProductService productService;
    public ProductController(@Qualifier ("fakeStoreProductService") ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<GenericProductDto> getAllProducts() {
        return this.productService.getAllProducts();

    }
    @GetMapping("{id}")
    public ResponseEntity<GenericProductDto> getProductByID(@PathVariable("id") Long id) throws NotFoundException{
        GenericProductDto response =this.productService.getProductByID(id);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
    @DeleteMapping("{id}")
    public ResponseEntity<GenericProductDto> deleteProductById(@PathVariable("id") Long id){
        GenericProductDto response = this.productService.deleteProductById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
    @PutMapping("{id}")
    public ResponseEntity<GenericProductDto> updateProductById(@PathVariable("id") Long id, @RequestBody FakeStoreProductDto updateRequest){
        GenericProductDto response = this.productService.updateProductById(id,updateRequest);
        return new ResponseEntity<>(response,HttpStatus.OK);


    }
    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto product){
        return this.productService.createProduct(product);

    }

}
