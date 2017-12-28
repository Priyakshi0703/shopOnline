package com.shoponline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.app.model.UsersModel;
import com.shoponline.entity.DiscountProduct;
import com.shoponline.entity.Product;
import com.shoponline.model.ProductListModel;
import com.shoponline.model.ProductModel;
import com.shoponline.service.ProductService;

@RestController
public class HomeController {
	@Autowired
	ProductService productService;
	/**
	 * @author Priyakshi Tiwari
	 * @description displaying list of products
	 * @return list object containing product details
	 */
	@RequestMapping("/show")
	public List<Product> showProducts(){
		return productService.showProducts();
	}
	
//	@RequestMapping(value="/save",method=RequestMethod.POST)
//	public String saveData(@RequestBody List<ProductListModel> productListModel) {
//		productService.saveData(productListModel);
//		return "Success";
//	}
	/**
	 * @author Priyakshi Tiwari
	 * @description calculating bill
	 * @return bill
	 */
	@RequestMapping(value="/bill",method=RequestMethod.POST)
	public float calculateBill(@RequestBody List<ProductModel> productModel){
	return productService.calculateBill(productModel);
	
	}
	/**
	 * @author Priyakshi Tiwari
	 * @description displaying discount table
	 * @return list of DiscountProduct
	 */
	@RequestMapping(value="/discount",method=RequestMethod.GET)
	public List<DiscountProduct> getDiscount(){
		return productService.getDiscount();
	}
	
    }
