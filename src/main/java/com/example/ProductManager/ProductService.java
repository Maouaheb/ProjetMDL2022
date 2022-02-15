package com.example.ProductManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
  private  ProductRepository repo;
    public List<Product> listeAll(){
        List<Product> liste=repo.findAll();
        return liste;
    }
    public void save(Product product){
        repo.save(product);
    }
    public void delete(int id){
        repo.deleteById(id);
    }
    public Product get(int id){
        return repo.findById(id).get();
    }

}
