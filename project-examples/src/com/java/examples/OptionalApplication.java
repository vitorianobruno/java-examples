package com.java.examples;

import java.util.Optional;

public class OptionalApplication {
	
	public void test(String value) {
		System.out.println(value.contains("Java8"));
	}
	
	public void orElse(String value) {
		Optional<String> opt = Optional.ofNullable(value);
		String x = opt.orElse("Default");
		System.out.println(x);
	}
	
	public void orElseThrow(String value) {
		Optional<String> opt = Optional.ofNullable(value);
		opt.orElseThrow(NumberFormatException::new);
	}
	
	public void isPresent(String value) {
		Optional<String> opt = Optional.ofNullable(value);
		System.out.println(opt.isPresent());
	}
	
	public static void main(String[] args) {

		OptionalApplication opt = new OptionalApplication();
		//opt.test(null);
		opt.orElse(null);
		//opt.orElseThrow(null);
		opt.isPresent(null);

	}

}
