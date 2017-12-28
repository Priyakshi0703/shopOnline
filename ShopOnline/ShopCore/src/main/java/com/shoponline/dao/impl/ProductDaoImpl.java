package com.shoponline.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoponline.dao.ProductDao;
import com.shoponline.entity.DiscountProduct;
import com.shoponline.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;

	/**
	 * @author Priyakshi Tiwari
	 * @description get details of the products
	 * @return showProducts
	 */

	@Override
	public List<Product> showProducts() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Product.class);
		List<Product> showProducts = criteria.list();
		return showProducts;
	}

	/**
	 * @author Priyakshi Tiwari
	 * @description getting cost according to product id
	 * @return getCost
	 */
	@Override
	public float getCost(long productId) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Product.class);
		criteria.add(Restrictions.eq("productId", productId));
		Product results = (Product) criteria.uniqueResult();
		return results.getCost();
	}

	@Override
	public List<DiscountProduct> getDiscount() {
		Session session = sessionFactory.getCurrentSession();
		Criteria discount = session.createCriteria(DiscountProduct.class);
		List<DiscountProduct> getDiscount = discount.list();
		return getDiscount;
	}

	/**
	 * @author Priyakshi Tiwari
	 * @description
	 */
	@Override
	public int getDiscountbyProductId(long productId) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(DiscountProduct.class,"discount");
		criteria.createAlias("discount.product", "product");
		criteria.add(Restrictions.eq("product.productId", productId));
		DiscountProduct results = (DiscountProduct) criteria.uniqueResult();
		if (results == null) {
			return 0;
		} else {
			return results.getDiscount();
		}
	}

	@Override
	public void saveData(Product product) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Product.class);
		List<Product> saveProducts = criteria.list();
		
		
		
		
	}
}
