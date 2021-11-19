package com.testswagger.swaproj.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home2")
public class RestHomeController {


    @ApiOperation(value = "Retrieves a list")
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<?>> getAllVehicles() {

        ArrayList<String> list = new ArrayList<>();
        list.add("OK-2");
        list.add("OK-3");
        System.out.println("OK-3");

        return new ResponseEntity<List<?>>(list, HttpStatus.OK);

    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<String> getProducts() {
        List<String> productsList = new ArrayList<>();
        productsList.add("Honey");
        productsList.add("Almond");
        return productsList;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String createProduct() {
        return "Product is saved successfully";
    }


}
