package com.example.demo.convert;

import com.example.demo.domain.model.Car;
import com.example.demo.dto.response.CarRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
@Mapper
public interface CarMapper{

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class );

    /**
     * CarRequestDTO 中的 manufacturer对应 Car 的 make属性
     * CarRequestDTO 中的 seatCount对应 Car 的 numberOfSeats属性
     * @param car
     * @return
     */
    @Mappings({
            @Mapping(source = "manufacturer",target = "make"),
            @Mapping(source = "seatCount",target = "numberOfSeats")
    })
    Car carRequestDTO2Car(CarRequestDTO car);

    List<Car> carRequestList2CarList(List<CarRequestDTO> car);

    Set<String> convertList2Set(List<Integer> accountList);

    /**
     * Stream 的转换
     * @param integers
     * @return
     */
    Set<String> integerStreamToStringSet(Stream<Integer> integers);
}
