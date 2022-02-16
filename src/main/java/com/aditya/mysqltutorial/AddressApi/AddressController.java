/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.mysqltutorial.AddressApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
@RequestMapping("/employees")
public class AddressController {
    
    @Autowired
    private AddressService addressService;
    
    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    
    @GetMapping("{id}")
    public Address getAddress(@PathVariable Integer id){
        return addressService.getAddress(id);
    }
    
    @PostMapping
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }
    
    @PutMapping("{id}")
    public void updateAddress(@RequestBody Address address,@PathVariable Integer id){
        addressService.updateAddress(address,id);
    }
    
    @DeleteMapping("{id}")
    public void deleteAddress(@PathVariable Integer id){
        addressService.deleteAddress(id);
    }
}
