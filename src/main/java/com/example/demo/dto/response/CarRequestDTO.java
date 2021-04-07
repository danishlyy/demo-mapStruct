package com.example.demo.dto.response;

import lombok.*;

import java.io.Serializable;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
@Data
public class CarRequestDTO implements Serializable {

    private static final long serialVersionUID = 8275370688823271702L;
    private String name;

    private String color;

    private String price;

    private String manufacturer;

    private String seatCount;
}
