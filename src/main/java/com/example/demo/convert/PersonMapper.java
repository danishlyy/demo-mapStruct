package com.example.demo.convert;

import com.example.demo.domain.model.Person;
import com.example.demo.dto.request.AddressRequestDTO;
import com.example.demo.dto.request.PersonRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class );

    /**
     * address.address1 代表 address对象中的属性address1，赋值给目标对象person中的province
     * @param person
     * @param address
     * @return
     */
    @Mapping(source = "address.address1", target = "province")
    @Mapping(source = "address.address2", target = "city")
    @Mapping(source = "address.address3", target = "district")
    @Mapping(source = "address.address4", target = "village")
    @Mapping(source = "person.age", target = "age")
    @Mapping(source = "person.name", target = "name")
    @Mapping(source = "person.phone", target = "phone")
    Person convertRequest2PersonDO(PersonRequestDTO person,
                                   AddressRequestDTO address);
}
