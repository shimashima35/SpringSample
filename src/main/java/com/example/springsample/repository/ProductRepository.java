/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springsample.repository;

import com.exapmle.springsample.domain.Product;
import java.util.List;

/**
 *
 * @author Yoshikazu
 */
public interface ProductRepository {
    
    List<Product> getAllProducts();
    
}
