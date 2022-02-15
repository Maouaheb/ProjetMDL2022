package com.example.ProductManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService service;
    @RequestMapping("/")
    public String viewAllProducts(Model model){
        List<Product> liste=service.listeAll();
        model.addAttribute("liste",liste);
        return "index";
    }
    @RequestMapping("/new")
    public String createProduct(Model model){
        Product product=new Product();
        model.addAttribute("product",product);
        return "create_product";
    }
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("product") Product xxxxxxx){
        service.save(xxxxxxx);
        return "redirect:/";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        service.delete(id);
        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView editProduct(@PathVariable("id") int id){
        ModelAndView mav=new ModelAndView("edit_product");
        Product product=service.get(id);
        mav.addObject("product",product);
        return mav;

    }
}
