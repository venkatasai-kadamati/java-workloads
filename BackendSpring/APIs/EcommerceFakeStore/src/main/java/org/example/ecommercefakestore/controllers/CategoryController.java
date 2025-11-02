package org.example.ecommercefakestore.controllers;

import org.example.ecommercefakestore.services.CategoryService;
import org.example.ecommercefakestore.services.ICategoryService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")
public class CategoryController {
    // The below violates a SOLID Principle: Dependency Injection
    // DI specifics that 2 concrete classes can't depend on each other.
    private ICategoryService categoryService;

    CategoryController(ICategoryService _categoryService){
        this.categoryService = _categoryService;
    }

    @GetMapping
    public String getAllCategories(){
        // shouldn't have any logic, just call the service layer
        // simply: has-a relation
        return "";
    }
}
