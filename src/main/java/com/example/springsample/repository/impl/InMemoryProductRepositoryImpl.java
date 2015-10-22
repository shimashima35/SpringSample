/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springsample.repository.impl;

import com.example.springsample.repository.ProductRepository;
import com.example.springsample.domain.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yoshikazu
 */
@Repository
public class InMemoryProductRepositoryImpl implements ProductRepository{

    @Override
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("hoge", 10));
        list.add(new Product("fuga", 20));
        return list;
    }
    
    public InMemoryProductRepositoryImpl(){
    }
            
    
    
}
