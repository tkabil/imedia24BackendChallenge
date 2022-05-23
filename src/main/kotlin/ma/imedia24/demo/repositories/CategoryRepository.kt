package ma.imedia24.demo.repositories

import ma.imedia24.demo.entities.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : CrudRepository<Category,Long> {

}