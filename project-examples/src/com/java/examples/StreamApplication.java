package com.java.examples;

import java.util.ArrayList;
import java.util.List;

public class StreamApplication {

	private final List<String> list;
	private final List<String> numbers;
	
	public StreamApplication() {
		list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("Javascript");
		
		numbers = new ArrayList<String>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
	}
	
	@Override
	public String toString() {
		return "StreamApp [list=" + list + ", numbers=" + numbers + "]";
	}

	public void filter() {
		list.stream().filter(x -> x.startsWith("J")).forEach(System.out::println); // or (x -> x.System.out.println(x));
	}
	
	public void order() {
		list.stream().sorted().forEach(System.out::println); //ASC
		list.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println); //DESC
	}
	
	public void transform() {
		list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
		//list.stream().map(String::toUpperCase()).forEach(System.out::println);
		
		/*
		for (String x : numeros) {
			int num = Integer.parseInt(x);
			System.out.println(num);
		}
		*/
		numbers.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limit () {
		list.stream().sorted().limit(2).forEach(System.out::println);
	}
	
	public void count() {
		long c = list.stream().count();
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		StreamApplication app = new StreamApplication();
		app.filter();
		System.out.println("===========Filter ^");
		app.order();
		System.out.println("===========Order ^");
		app.transform();
		System.out.println("===========Transform ^");
		app.limit();
		System.out.println("===========Limit ^");
		app.count();
		System.out.println("===========Count ^");
		
	}
}
