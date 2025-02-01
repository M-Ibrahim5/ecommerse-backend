package com.teluskoi.ecom_project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

    //use jackson library that convert data to object and vise versa
    //we want to change the date format in db
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;

    //annotation for large object data
    @Lob
    private byte[] imageData;




    public Product() {
    }

    public Product(String imageName, String imageType, byte[] imageData,  Date releaseDate, int stockQuantity, boolean productAvailable, String category, BigDecimal price, String brand, String description, String name, int id) {
        this.releaseDate = releaseDate;
        this.stockQuantity = stockQuantity;
        this.productAvailable = productAvailable;
        this.category = category;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.name = name;
        this.id = id;
        this.imageName = imageName;
        this.imageType = imageType;
        this.imageData = imageData;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isproductAvailable() {
        return productAvailable;
    }

    public void setproductAvailable(boolean productAvailable) {
        this.productAvailable = productAvailable;
    }

    public int getstockQuantity() {
        return stockQuantity;
    }

    public void setstockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
