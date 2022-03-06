package rifqimuhammadaziz.crud.services;

import org.springframework.stereotype.Component;
import rifqimuhammadaziz.crud.entities.ProductEntity;
import rifqimuhammadaziz.crud.response.CommonResponse;

import java.util.List;

@Component
public interface ProductService {

    ProductEntity addProduct(ProductEntity product);

    List<ProductEntity> getAllProduct();

    ProductEntity getById(int id);

    ProductEntity update(ProductEntity product);

    void delete(int id);
}
