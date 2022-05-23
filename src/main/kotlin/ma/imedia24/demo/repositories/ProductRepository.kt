package ma.imedia24.demo.repositories

import ma.imedia24.demo.entities.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product,Long> {

}