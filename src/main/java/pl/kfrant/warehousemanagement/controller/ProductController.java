package pl.kfrant.warehousemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.kfrant.warehousemanagement.model.Product;
import pl.kfrant.warehousemanagement.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String productsList(Model model){
        model.addAttribute("listProducts",productService.getAllProducts());
        return "product_list";
    }

    @GetMapping("/addProduct")
    public String newProductForm(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "add_product";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/updateProduct/{id}")
    public String updateProductForm(@PathVariable(value = "id") Integer id, Model model){
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "update_product";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable(value = "id") Integer id){
        this.productService.deleteProductById(id);
        return "redirect:/products";
    }
}
