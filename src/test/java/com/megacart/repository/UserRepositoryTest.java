package com.megacart.repository;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringRunner;

import com.megacart.domain.user.McUser;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testSave() {
		McUser user = new McUser();
		user.setUsername("user2");
		user.setLastname("user2");
		user.setUserGroupId(2);
		user.setPassword("2");
		user.setSalt("2");
		user.setCode("2");
		user.setDateAdded(new Date());
		user.setEmail("abc");
		user.setFirstname("user2");
		user.setImage("view/image/logo.png");
		user.setIp("localhost");
		user.setStatus((byte)2);
		
		assertTrue(user.getUserId() == null);
		
		userRepository.save(user);
		McUser userFromDb = userRepository.findByLastname(user.getLastname());
		
		assertTrue(userFromDb.getUserId() != null);
	}
	
	@Test
	public void testFind(){
		final int page = 0;
		final int rowsLimit = 10;
		final String order = "DESC";
		final String sort = "username";
		
		Page<McUser> users = userRepository.findAll(
				new PageRequest(page, rowsLimit, new Sort(Direction.fromString(order.toUpperCase()), sort)));
		System.out.println("users: " + users.getContent());
		assertTrue(users.getContent().size() > 0 && users.getContent().size() < rowsLimit);
	}

}
