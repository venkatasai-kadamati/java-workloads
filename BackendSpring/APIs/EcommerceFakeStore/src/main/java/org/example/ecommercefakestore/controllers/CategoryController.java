package org.example.ecommercefakestore.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    @GetMapping
    public String getCategory(){
        return "Electronics"; // sample ctg
    }

    @GetMapping("/count")
    public int getCategoryCount(){
        return 5; // sample cnt
    }

    @DeleteMapping
    public String deleteCategory(){
        return "Category Deleted";
    }

    @PostMapping
    public String postCategory(){
        return "Posted Cyber";
    }
}
