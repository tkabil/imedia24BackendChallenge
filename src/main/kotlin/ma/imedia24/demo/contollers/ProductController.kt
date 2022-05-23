package ma.imedia24.demo.contollers

import ma.imedia24.demo.entities.Product
import ma.imedia24.demo.services.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController(private val productService: ProductService) {
    @GetMapping
    fun getProducts() = productService.getProducts()

    @GetMapping("/{id}")
    fun getProduct(@PathVariable id:Long) = productService.getProduct(id)

    @PostMapping
    fun saveProduct(@RequestBody product : Product) = productService.saveProduct(product)

}