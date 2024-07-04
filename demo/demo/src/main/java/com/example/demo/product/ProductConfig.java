package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    private final ProductService productService;

    @Autowired
    public ProductConfig(ProductService studentService) {
        this.productService = studentService;
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository){
        return args -> {
            //"Электро-товары","маршрутизаторы",
            Product pr1 = new Product("Маршрутизаторы","Tenda ",
                    "Маршрутизатор Tenda HG1","123456789",1899 ,1000);
            Product pr2 = new Product("Маршрутизаторы","Tenda ",
                    "Маршрутизатор Tenda HG3","123456789",3500 ,1500);

            repository.saveAll(
                    List.of(pr1,pr2)
            );
        };
    }

}
