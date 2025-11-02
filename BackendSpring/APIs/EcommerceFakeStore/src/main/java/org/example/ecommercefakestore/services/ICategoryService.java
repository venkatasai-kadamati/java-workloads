package org.example.ecommercefakestore.services;

import java.util.List;

// Interface build to avoid DInjection. i.e, have 2 concrete classes depend on each other in controller layer.
public interface ICategoryService {
    List<String> getAllCategories();
}
