package com.opticsolutions.annotations.hw;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TodoAnalyzer {
	public String getTodoReport(Class<? extends Object> clazz) {
		return Arrays.stream(clazz.getDeclaredMethods())
				.filter(method -> method.getAnnotation(Todo.class) != null)
				.map( method -> {
					var annotation = method.getAnnotation(Todo.class);
					return "Method name: " + method.getName()
							+ ", author: " + annotation.author()
							+ ", priority:"+ annotation.priority()
							+ ", status: " + annotation.status();
				})
				.collect(Collectors.joining(System.lineSeparator()));
	}
}

