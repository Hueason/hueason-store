package com.hueason.service.product;

import com.hueason.pojo.product.Product;

import java.util.List;

/**
 * DESCRIPTION
 *
 * @Author hueason
 * @create 2017-06-25 16:25
 */
public interface ProductService {
    //查询商品信息  返回分页   String page 查询第几页,String rows每页显示记录数,String sidx排序字段,String sord 排序条件 asc，desc
    public List<Product> selectProductList(String page,String rows,String sidx,String sord);
}
