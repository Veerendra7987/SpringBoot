package com.xits.firstclaas.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    ProductRepositry productRepositry;

    @GetMapping("/addproduct")
    public String addproduct(){
        return "addproduct";
    }

    @PostMapping("/saveproduct")
    public String saveproduct(String proname, String category,boolean isavailable){
        Products product= new Products();
        product.setProname(proname);
        product.setCategory(category);
        product.setIsavailabel(isavailable);
        productRepositry.save(product);
        return "Confirmation";
    }
}
