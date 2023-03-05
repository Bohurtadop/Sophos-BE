package com.sophos.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sophos.model.Category;
import com.sophos.repo.ICategoryRepo;

@RestController
@RequestMapping("/category")
public class RestCategoryController {

    @Autowired
    private ICategoryRepo repo;

    @GetMapping
    public @ResponseBody Iterable<Category> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public @ResponseBody Category save(@RequestBody Category customer) {
        return repo.save(customer);
    }

    @DeleteMapping
    public @ResponseBody void delete(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }

}
