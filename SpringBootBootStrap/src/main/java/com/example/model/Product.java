package com.example.model;

import org.hibernate.annotations.GenericGenerator; 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product 
{
    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    @Column(name = "ID")
    private int id;
    
    @Column(name = "Product_Name")
    private String pname;
    
    @Column(name = "Company_Name")
    private String cname;
    
    @Column(name = "Price")
    private double price;
    
    public Product() 
    {
		System.out.println("Product Table Created..");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
}
