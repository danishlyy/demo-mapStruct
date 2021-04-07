package com.example.demo.service.impl;

import com.example.demo.convert.PersonMapper;
import com.example.demo.domain.model.Person;
import com.example.demo.dto.request.AddressRequestDTO;
import com.example.demo.dto.request.PersonRequestDTO;
import com.example.demo.service.PersonService;
import org.springframework.stereotype.Component;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
@Component
public class PersonServiceImpl implements PersonService {
    @Override
    public void getPersonInfo(PersonRequestDTO personRequestDTO, AddressRequestDTO addressRequestDTO) {
      Person person = PersonMapper.INSTANCE.convertRequest2PersonDO(personRequestDTO,addressRequestDTO);
    }
}
