/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springsample.controller;

import com.example.springsample.repository.ProductRepository;
import com.exapmle.springsample.domain.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Yoshikazu
 */
@Controller
public class ProductControler {

    @Autowired
    private ProductRepository productRepository;
    
    @RequestMapping(value = "/product")
    public String product(Model model){
        model.addAttribute("products", productRepository.getAllProducts());
//        List<Product> list = new ArrayList<>();
//        model.addAttribute("products", list);
        
        return "product";
    }
}
