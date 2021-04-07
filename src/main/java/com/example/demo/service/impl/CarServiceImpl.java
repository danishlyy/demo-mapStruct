package com.example.demo.service.impl;

import com.example.demo.convert.CarMapper;
import com.example.demo.domain.model.Car;
import com.example.demo.dto.response.CarRequestDTO;
import com.example.demo.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
@Slf4j
@Component
public class CarServiceImpl implements CarService {
    @Override
    public void getCarInfo(CarRequestDTO carRequestDTO) {
        Car car = CarMapper.INSTANCE.carRequestDTO2Car(carRequestDTO);
        log.info("----------convert result--------");
        log.info("制造商:{},座位：{},车颜色:{}",car.getMake(),car.getNumberOfSeats(),
                car.getColor());

    }
}
