package com.cn.shirly.myeasybuy.dao;

import com.cn.shirly.myeasybuy.pojo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductDao {
    //新增
    public int addProduct(Product product);
    //删
    public int delProduct(Integer id);
    //改
    public int updateProduct(Product product);
    //查所有
    public List<Product> getAllProduct();
    //根据id号查一个商品
    public Product getProductById(Integer id);
}
