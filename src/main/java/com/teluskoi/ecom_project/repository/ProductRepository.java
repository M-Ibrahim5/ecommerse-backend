package com.teluskoi.ecom_project.repository;

import com.teluskoi.ecom_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    //JPQL = JPA qually language (similar to sql, in sql we use table, in JPQL we use class name)

    @Query("SELECT p from Product p WHERE "+
        "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword , '%')) OR " +
        "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword , '%')) OR "+
        "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword , '%')) OR "+
        "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword , '%'))")

    List<Product> searchProducts(String keyword);

    //public List<Product> findByBrand(String brand);

}
