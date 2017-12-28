package com.shoponline.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shoponline.dao.ProductDao;
import com.shoponline.entity.DiscountProduct;
import com.shoponline.entity.Product;
import com.shoponline.model.ProductListModel;
import com.shoponline.model.ProductModel;
import com.shoponline.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	float totalBill;
	float cost;
	int discount;
    /**
     * @author Priyakshi Tiwari
     * @description show the list of products
     */
	@Transactional
	public List<Product> showProducts() {
		List<Product> show = productDao.showProducts();
		return show;

	}
	/**
	 * @author Priyakshi Tiwari
	 * @description calculate the bill of selected items
	 */

	@Transactional
	public float calculateBill(List<ProductModel> productModel) {
		totalBill = 0;
		for (int limit = 0; limit < productModel.size(); limit++) {
			cost = productDao.getCost(productModel.get(limit).getProductId());
			discount=productDao.getDiscountbyProductId(productModel.get(limit).getProductId());
			cost=cost-(cost*discount)/100;
			totalBill = totalBill+cost * productModel.get(limit).getNoOfProducts();
			System.out.println(totalBill);
		}
		return totalBill;
	}
	/**
	 * @author Priyakshi Tiwari
	 * @description show the discount on items
	 */
	@Transactional
	public List<DiscountProduct> getDiscount(){
		List<DiscountProduct> calculate=productDao.getDiscount();
		return calculate;
	}
	@Override
	public void saveData(ProductListModel productListModel) {
		Product product=new Product();
		product.setProductName(productListModel.getName());
		product.setCost(productListModel.getCost());
		productDao.saveData(product);
		
	}
	}
