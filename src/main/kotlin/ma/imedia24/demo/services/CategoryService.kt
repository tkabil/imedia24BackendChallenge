package ma.imedia24.demo.services

import ma.imedia24.demo.entities.Category
import ma.imedia24.demo.repositories.CategoryRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/categories")
class CategoryService(private val categoryRepository: CategoryRepository) {
    fun getCategories() = categoryRepository.findAll()

    fun getCategory(id:Long) = categoryRepository.findById(id)

    fun saveCategory(category: Category) = categoryRepository.save(category)

}