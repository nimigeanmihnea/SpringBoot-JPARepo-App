package application.validations;

import application.entity.Product;
import application.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by NMI4CLJ on 29.08.2017.
 */

@Service
public class ProductValidator {

    @Autowired
    private ProductRepository productRepository;

    public ProductValidator(){}

    public boolean validate(Product product){
        long productId = product.getId();
        Product aux = productRepository.findByProductId(productId);
        if(aux != null)
            return false;
        else
            return true;
    }
}
