package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.model.Product;

@Service
public class ProductService 
{
     @Autowired
     private ProductRepository pr;
     
     public ProductService(ProductRepository pr) 
     {
		this.pr = pr;
		System.out.println("Product Service Created...");
	}
    public void Save(Product p)
    {
         pr.save(p);
    }
    public List<Product> ViewAll()
    {
    	List<Product> allProduct = (List<Product>) pr.findAll();
    	return allProduct;
    }
    public Product Edit(int id)
    {
    	return pr.findById(id).get();
    }
    public void Update(@ModelAttribute("product") Product p)
    {
    	Product p1 = pr.findById(p.getId()).get();
    	p1.setPname(p.getPname());
    	p1.setCname(p.getCname());
    	p1.setPrice(p.getPrice());
    	pr.save(p1);
    }
    public void Delete(int id)
    {
    	pr.deleteById(id);
    }
}
