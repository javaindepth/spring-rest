package com.javaindepth.springrest.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaindepth.springrest.model.Greeting;

@RestController
public class MyAppController {
	AtomicInteger counter=new AtomicInteger();
	private String format="Hello %s";
	@RequestMapping("/greetings")
public Greeting greetings(@RequestParam(value="name",defaultValue="javaindepth")String name){
	return new Greeting(counter.incrementAndGet(),String.format(format, name));
}
	
}
