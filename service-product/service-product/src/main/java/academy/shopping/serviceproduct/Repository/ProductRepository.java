package academy.shopping.serviceproduct.Repository;

import academy.shopping.serviceproduct.Entities.Category;
import academy.shopping.serviceproduct.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);

}
