package com.placement.demolition.component;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.util.SafeEncoder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.placement.demolition.component.RedisComponent.Serializer;


public class JsonSerializer implements Serializer {

	private Logger logger = LoggerFactory.getLogger(JsonSerializer.class);

	@Override
	public byte[] serialzation(Object object) {
		if (object == null)
			return null;
		try {
			return SafeEncoder.encode(JSONObject.toJSONString(object));
		} catch (Exception e) {
			logger.error("", e);
			return null;
		}
	}

	@Override
	public <T> T deserialization(byte[] byteArray, Class<T> c) {
		if (byteArray == null || byteArray.length == 0)
			return null;
		try {
			return JSON.parseObject(SafeEncoder.encode(byteArray), c);
		} catch (Exception e) {
			logger.error("", e);
			return null;
		}
	}

	@Override
	public <E> List<E> deserializationList(byte[] byteArray, Class<E> elementC) {
		if (byteArray == null || byteArray.length == 0)
			return null;
		try {
			return JSON.parseArray(SafeEncoder.encode(byteArray), elementC);
		} catch (Exception e) {
			logger.error("", e);
			return null;
		}
	}

}