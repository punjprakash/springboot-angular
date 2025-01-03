package com.products.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int productId;
    private String productName;
    private String productCode;
    private String releaseDate;
    private String description;
    private double price;
    private double starRating;
    private String imageUrl;
}
