/*package com.org.auth.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.org.auth.domain.User;
import com.org.auth.repository.UserRepository;

public class UserServiceTest {

	@InjectMocks
	private UserServiceImpl userService;

	@Mock
	private UserRepository repository;

	@Before
	public void setup() {
		initMocks(this);
	}

	@Test
	public void shouldCreateUser() {

		User user = new User();
		user.setUsername("name");
		user.setPassword("password");

		userService.create(user);
		verify(repository, times(1)).save(user);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldFailWhenUserAlreadyExists() {

		User user = new User();
		user.setUsername("name");
		user.setPassword("password");

		when(repository.findOne(user.getUsername())).thenReturn(new User());
		userService.create(user);
	}
}
*/