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

import com.sophos.model.Order;
import com.sophos.repo.IOrderRepo;

@RestController
@RequestMapping("/order")
public class RestOrderController {

    @Autowired
    private IOrderRepo repo;

    @GetMapping
    public @ResponseBody Iterable<Order> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public @ResponseBody Order save(@RequestBody Order customer) {
        return repo.save(customer);
    }

    @DeleteMapping
    public @ResponseBody void delete(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }

}
