package com.shoponline.service;

import java.util.List;

import com.shoponline.entity.DiscountProduct;
import com.shoponline.entity.Product;
import com.shoponline.model.ProductListModel;
import com.shoponline.model.ProductModel;


public interface ProductService {
	public List<Product> showProducts();

	public float calculateBill(List<ProductModel> productModel);

	public List<DiscountProduct> getDiscount();

	public void saveData(ProductListModel productListModel);
	

}
