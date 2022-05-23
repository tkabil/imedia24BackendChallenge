package ma.imedia24.demo.services

import ma.imedia24.demo.entities.Product
import ma.imedia24.demo.repositories.CategoryRepository
import ma.imedia24.demo.repositories.ProductRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductService(private val productRepository: ProductRepository,private val categoryRepository: CategoryRepository) {

    fun getProducts() = productRepository.findAll()

    fun getProduct(id:Long) = productRepository.findById(id)

    fun saveProduct(product : Product):Product {
        product.category.id?.let { categoryRepository.findById(it) };
        return productRepository.save(product)
    }

}