package com.mostafa.reactive.controller;


import com.mostafa.reactive.model.Product;
import com.mostafa.reactive.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/product", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Product> getProduct() {
        return productService.getProducts();
    }

}