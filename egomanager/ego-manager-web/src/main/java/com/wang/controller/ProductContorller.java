package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/2.
 */
@Controller
@RequestMapping("/product")
public class ProductContorller {
    /**
     * 商品-添加商品
     */

    @RequestMapping("/add")
    public String productAdd(){
        return "product/product-add";
    }

    /**
     * 商品-列表
     * @return
     */

    @RequestMapping("/list")
    public String productList(){
        return "product/product-list";
    }

    /**
     * 商品分类-添加分类
     */
    @RequestMapping("/category/add")
    public String categoryAdd(){
        return "product/category-add";
    }

    /**
     * 商品分类-列表
     * @return
     */
    @RequestMapping("/category/list")
    public String categoryList(){
        return "product/category-list";
    }
}
