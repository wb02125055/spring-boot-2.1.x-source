package com.wb.spring.boot.domain;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author WangBing
 * @date 2023/8/11 07:44
 */
@Data
@ToString
@Builder
public class Person implements Serializable {
	private String name;
	private Integer age;
	private City city;
}
