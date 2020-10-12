package com.wb.spring.boot.web;

import com.wb.spring.boot.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

	@GetMapping("/list")
	public List<User> userList() {
		List<User> userList = new ArrayList<>();
		User user1 = new User("name1", 1L, 12);
		User user2 = new User("name2", 2L, 13);
		User user3 = new User("name3", 3L, 14);
		User user4 = new User("name4", 4L, 15);

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);

		return userList;
	}
}
