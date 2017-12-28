package com.shoponline.dao;

import java.util.List;

import com.shoponline.entity.DiscountProduct;
import com.shoponline.entity.Product;

public interface ProductDao {
	public List<Product> showProducts();



	public float getCost(long productId);
	public List<DiscountProduct> getDiscount();
	public int getDiscountbyProductId(long productId);
	public void saveData(Product product);
}
