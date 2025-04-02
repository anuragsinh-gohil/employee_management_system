package com.ems.CRUD_Spring.controller;

import com.ems.CRUD_Spring.entity.Customer;
import com.ems.CRUD_Spring.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.postCustomer(customer);
        return ResponseEntity.ok(savedCustomer);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        List<Customer> customers = customerService.getAllCustomer();
        System.out.println("Fetched customers: " + customers); // Debug log
        return ResponseEntity.ok(customers);
    }
    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
        Customer customer = customerService.getCustomerById(id);
        if (customer == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(customer);

    }
    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer){
        Customer existingCustomer = customerService.getCustomerById(id);
        if (existingCustomer == null)
            return ResponseEntity.notFound().build();
        existingCustomer.setName(customer.getName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());
        Customer updateeCustomer = customerService.updateCustomer(existingCustomer);
        return ResponseEntity.ok(updateeCustomer);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long id){
        Customer existingCustomer = customerService.getCustomerById(id);
        if (existingCustomer == null)
            return ResponseEntity.notFound().build();
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }
}