package com.example.demo.service;

import com.example.demo.dto.response.CarRequestDTO;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
public interface CarService {
    void getCarInfo(CarRequestDTO carRequestDTO);
}
