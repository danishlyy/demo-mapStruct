package com.example.demo.dto.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
@Data
public class PersonRequestDTO implements Serializable {

    private static final long serialVersionUID = -5099997314615241386L;
    private Integer age;

    private String name;

    private String phone;
}
