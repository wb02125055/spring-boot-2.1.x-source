package com.wb.spring.boot.conf;

import com.wb.spring.boot.domain.City;
import com.wb.spring.boot.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WangBing
 * @date 2023/8/11 07:47
 */
@Configuration
@Slf4j
public class PersonConfiguration {
	@Bean
	// 容器中有City类型的bean时，初始化Person
	@ConditionalOnBean(City.class)
	public Person person(City city) {
		log.info("---> get city: {}", city);
		city.setName("陕西");
		Person personEntity = Person.builder()
				.age(18)
				.name("王兵")
				.city(city)
				.build();
		log.info("---> init person: {}", personEntity);
		return personEntity;
	}
}
