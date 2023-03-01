package com.spring.player.dao;

import com.spring.player.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(path = "osos")
public interface playerdao extends JpaRepository<Product,Integer> {
   List <Product>  findByName (@RequestParam String name);
    List <Product>  findByNameContaining (@RequestParam String name);

}

//