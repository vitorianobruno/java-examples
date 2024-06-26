package com.java.examples.app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;
import java.util.function.BiFunction;

public class Calculator {

	public double evaluate(String expr) {

		if (!Objects.equals(expr, "")) {
			Stack<Double> numbers = new Stack<>();
			Arrays.stream(expr.split(" ")).forEach(number -> {
				switch (number) {
				// Valid operations are +, -, *, /.
				case "+":
					operators(numbers, Double::sum);
					break;
				case "-":
					operators(numbers, (n1, n2) -> n2 - n1);
					break;
				case "*":
					operators(numbers, (n1, n2) -> n2 * n1);
					break;
				case "/":
					operators(numbers, (n1, n2) -> n2 / n1);
					break;
				default:
					numbers.push(Double.parseDouble(number));
				}
			});
			return numbers.pop();
		} else {
			// Empty expression should evaluate to 0.
			return 0;
		}

	}

	protected static Stack<Double> operators(Stack<Double> numbers, BiFunction<Double, Double, Double> operation) {
		numbers.push(operation.apply(numbers.pop(), numbers.pop()));
		return numbers;
	}

}