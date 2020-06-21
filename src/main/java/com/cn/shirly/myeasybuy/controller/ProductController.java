package com.cn.shirly.myeasybuy.controller;

import com.alibaba.fastjson.JSON;
import com.cn.shirly.myeasybuy.dao.ProductDao;
import com.cn.shirly.myeasybuy.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductDao productDao;

    @RequestMapping("/update")
    public String updateProduct(Product product){
        int count= productDao.updateProduct(product);
        if(count>0){
            return "ok";
        }
        return "no";
    }

    @RequestMapping("/getProductById")
    public String getProductById(Integer id){
        Product product=productDao.getProductById(id);
        String productJson=JSON.toJSONString(product);
        return productJson;
    }

    @RequestMapping("/delProduct")
    public String delProduct(Integer id){
       int count= productDao.delProduct(id);
       if(count>0){
           return "ok";
       }
       return "no";
    }

    @RequestMapping("/showAllProduct")
    public Object showAllProduct(){
        List<Product> products=productDao.getAllProduct();
        String productJson= JSON.toJSONString(products);
        System.out.println("productJson:"+productJson);
        return productJson;
    }


    @RequestMapping("/addProduct")
    public String addProduct(Product product){
        int count=productDao.addProduct(product);
        //当添加成功的时候，count的值为被插入的数据的行数
        System.out.println("总共插入了："+count+"条数据");
        if(count>0){
            return "ok";
        }
        return "no";
    }
}
