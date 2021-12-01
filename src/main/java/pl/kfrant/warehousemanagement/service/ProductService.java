package pl.kfrant.warehousemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.kfrant.warehousemanagement.model.Product;
import pl.kfrant.warehousemanagement.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        this.productRepository.save(product);
    }

    public Product getProductById(Integer id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        Product product;
        if(optionalProduct.isPresent()){
            product = optionalProduct.get();
        }else {
            throw new RuntimeException("Product with id: "+id+" not found ");
        }
        return product;
    }

    public void deleteProductById(Integer id){
        this.productRepository.deleteById(id);
    }

}
