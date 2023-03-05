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

import com.sophos.model.Product;
import com.sophos.repo.IProductRepo;

@RestController
@RequestMapping("/product")
public class RestProductController {

    @Autowired
    private IProductRepo repo;

    @GetMapping
    public @ResponseBody Iterable<Product> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public @ResponseBody Product save(@RequestBody Product customer) {
        return repo.save(customer);
    }

    @DeleteMapping
    public @ResponseBody void delete(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }

}
