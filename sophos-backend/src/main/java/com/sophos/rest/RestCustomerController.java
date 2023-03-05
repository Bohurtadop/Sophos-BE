package com.sophos.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sophos.model.Customer;
import com.sophos.repo.ICustomerRepo;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class RestCustomerController {

    @Autowired
    private ICustomerRepo repo;

    @GetMapping
    public @ResponseBody Iterable<Customer> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public @ResponseBody Customer save(@RequestBody Customer customer) {
        return repo.save(customer);
    }

    @DeleteMapping
    public @ResponseBody void delete(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }

}
