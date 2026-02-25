package com.example.controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.dao.ProductService;
import com.example.model.Product;

@Controller
public class ProductController 
{
    @Autowired
    private ProductService ps;
    
    public ProductController() 
    {
		System.out.println("Product Controller Created...");
	}
    public ProductController(Product p) 
    {
    	this.ps = ps;
		System.out.println("Product Front-Controller Created...");
	}
    
    @RequestMapping("/")
    public ModelAndView Home() 
    {
    	return new ModelAndView ("Login").addObject("product", new Product()); 
    }
    
    @RequestMapping("/login")
    public String Save(@ModelAttribute("product") Product p)
    {
    	ps.Save(p);
    	return "Login";
    }
    
    @RequestMapping("/view")
    public ModelAndView ViewProduct()
    {
    	List<Product> allProduct = ps.ViewAll();
    	return new ModelAndView("ViewProduct").addObject("product", allProduct);
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView Edit(@PathVariable int id)
    {
    	Product p = ps.Edit(id);
    	return new ModelAndView ("Edit").addObject("product", p);
    }
    
    @RequestMapping("/update")
    public ModelAndView Update(@ModelAttribute("product") Product p)
    { 
    	ps.Update(p);
		return new ModelAndView ("success").addObject("success", "Update Successfully...");
    }
    
    @RequestMapping("/delete/{id}")
    public ModelAndView Delete(@PathVariable int id, Product p)
    {
    	ps.Delete(id);
    	return new ModelAndView ("delete").addObject("delete", "Delete Successfully...");
    }
}
