package com.ytaocrow.springbootmall.service.impl;

import com.ytaocrow.springbootmall.dao.ProductDao;
import com.ytaocrow.springbootmall.model.Product;
import com.ytaocrow.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
