/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entitiy.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author User
 */
public interface ProductDao extends PagingAndSortingRepository<Product, String>{
    
}
