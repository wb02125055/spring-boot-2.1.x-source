package com.wb.spring.boot.conf;

import com.wb.spring.boot.domain.City;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WangBing
 * @date 2023/8/11 07:46
 */
@Configuration
public class CityConfiguration {
	@Bean
	public City city() {
		return City.builder().code("0001").name("北京").build();
	}
}
