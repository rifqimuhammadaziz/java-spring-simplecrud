package rifqimuhammadaziz.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rifqimuhammadaziz.crud.entities.ProductEntity;

public interface ProductImageRepository extends JpaRepository<ProductEntity, Integer> {
}
