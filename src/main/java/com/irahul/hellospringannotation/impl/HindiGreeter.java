package com.irahul.hellospringannotation.impl;

import org.springframework.stereotype.Component;

import com.irahul.hellospring.Greeter;

/**
 * Knows Hindi
 * @author rahul
 *
 */
@Component
public class HindiGreeter implements Greeter {

	public String sayHello() {
		return "Namaste";
	}

}
