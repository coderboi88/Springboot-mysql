/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.mysqltutorial.AddressApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author hp
 */
@EnableJpaRepositories(basePackages = "com.aditya.mysqltutorial.AddressApi")
@SpringBootApplication
public class AddressApi {
    public static void main(String[] args) {
        SpringApplication.run(AddressApi.class, args);
    }
}
