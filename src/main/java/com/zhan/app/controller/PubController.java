package com.zhan.app.controller;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhan.app.util.ResultUtil;

@RestController
@RequestMapping("/pub")
public class PubController {
	@Resource
	protected RedisTemplate<String, Serializable> redisTemplate;

	@RequestMapping("topub")
	public String pub(HttpServletRequest request, String content) {
		redisTemplate.convertAndSend("news", "java我发布的消息!");
		return "";
	}
}
