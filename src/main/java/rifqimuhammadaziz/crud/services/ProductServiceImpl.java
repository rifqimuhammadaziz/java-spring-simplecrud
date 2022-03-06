package rifqimuhammadaziz.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rifqimuhammadaziz.crud.entities.ProductEntity;
import rifqimuhammadaziz.crud.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductEntity addProduct(ProductEntity product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity getById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public ProductEntity update(ProductEntity product) {
        ProductEntity findProduct = productRepository.findById(product.getId()).get();
        findProduct.setProductName(product.getProductName());
        findProduct.setCategory(product.getCategory());
        findProduct.setDescription(product.getDescription());

        return productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }
}
