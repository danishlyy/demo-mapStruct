package com.example.demo.dto.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liyongyong
 * @date 2021-04-06
 */
@Data
public class AddressRequestDTO implements Serializable {
    private static final long serialVersionUID = 8697623107667421398L;

    /**
     * 省
     */
    private String address1;
    /**
     * 市
     */
    private String address2;
    /**
     * 区
     */
    private String address3;
    /**
     * 村
     */
    private String address4;
}
