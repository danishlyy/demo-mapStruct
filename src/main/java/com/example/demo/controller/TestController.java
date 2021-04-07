package com.example.demo.controller;

import com.example.demo.dto.response.CarRequestDTO;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
@RestController
public class TestController {

    @Autowired
    private  CarService carService;



    @GetMapping(value = "/get/carInfo")
    public String getCarInfo(@RequestBody CarRequestDTO carRequestDTO){

        carService.getCarInfo(carRequestDTO);

        return "success";
    }
}
