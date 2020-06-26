package com.icia.cheatingday;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.time.*;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import com.icia.cheatingday.user.dao.*;
import com.icia.cheatingday.user.entity.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class UserDaoTest {
	@Autowired
	private UserDao dao;
	
	//@Test
	public void insert() {
		User user = User.builder().uUsername("cheat").uIrum("cheating").uEmail("cheating@naver.com")
				.uTel("01011111111").uAddress("인천 학익동").uPassword("1234").uJoinDate(LocalDateTime.now()).build();
		dao.insert(user);
	}
	//@Test
		public void findByIdTest() {
			assertThat(dao.findById("cheat"), is(false));
		}
	//@Test
	public void exsistsById() {
		assertThat(dao.existsById("summer"), is(false));
		assertThat(dao.existsById("spring"), is(true));
		
	}
	
	//@Test
	public void existsByUEmail() {
		assertThat(dao.existsByUEmail("spring@naver.com"), is(true));
		assertThat(dao.existsByUEmail("spring12@naver.com"), is(false));
	}
	//@Test
	public void updateTest() {
	User user = User.builder().uUsername("cheat").uIrum("HI").uEmail("cheating@naver.com")
			.uTel("1111111111").uAddress("인천 계산동").uPassword("1234").build();
	dao.update(user);
	}
	//@Test
	public void findUUsernameByUIrumAndUEmailTest() {
		assertThat(dao.findUUsernameByUIrumAndUEmail("spring", "spring@naver.com"), is(notNullValue()));
	}
	//@Test
	public void findPasswordByIdTest() {
		assertThat(dao.findPasswordById("spring"), is(notNullValue()));
	}
	@Test
	public void deleteTest() {
		assertThat(dao.delete("cheat"), is(notNullValue()));
	}
}
