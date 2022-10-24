package com.opticsolutions.annotations.hw;

public class TodoAnnotationDemo {
	public static void main(String[] args) {
		TodoAnalyzer analyzer = new TodoAnalyzer();
		String todoReport =  analyzer.getTodoReport(TodoClass.class);
		System.out.println(todoReport);
	}
}
