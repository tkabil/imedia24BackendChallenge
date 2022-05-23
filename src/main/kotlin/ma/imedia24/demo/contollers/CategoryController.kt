package ma.imedia24.demo.contollers

import ma.imedia24.demo.entities.Category
import ma.imedia24.demo.services.CategoryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/categories")
class CategoryController(private val categoryService: CategoryService) {
    @GetMapping
    fun getCategories() = categoryService.getCategories()

    @GetMapping("/{id}")
    fun getCategory(@PathVariable id:Long) = categoryService.getCategory(id)

    @PostMapping
    fun saveCategory(@RequestBody category: Category) = categoryService.saveCategory(category)

}