/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.mysqltutorial.AddressApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;
    
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public Address getAddress(Integer id) {
        return addressRepository.findOne(id);
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void updateAddress(Address address, Integer id) {
        Address updateAddress = addressRepository.findOne(id);
        updateAddress.setFirstName(address.getFirstName());
        updateAddress.setLastName(address.getLastName());
        updateAddress.setEmailId(address.getEmailId());
        addressRepository.save(updateAddress);
    }

    public void deleteAddress(Integer id) {
        addressRepository.delete(id);
    }
    
}
