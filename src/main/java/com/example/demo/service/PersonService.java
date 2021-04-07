package com.example.demo.service;

import com.example.demo.dto.request.AddressRequestDTO;
import com.example.demo.dto.request.PersonRequestDTO;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
public interface PersonService {


    public void getPersonInfo(PersonRequestDTO personRequestDTO,
                              AddressRequestDTO addressRequestDTO);
}
