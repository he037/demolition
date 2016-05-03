package com.placement.demolition.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.placement.demolition.component.RedisComponent;

public class RedisTest extends BaseServiceTest {
	@Autowired
	private RedisComponent redisComponent;

	@Test
	public void redisConnectTest() {
		redisComponent.set("test1", "1111");
		System.out.println(redisComponent.get("test1", String.class));
	}
}
