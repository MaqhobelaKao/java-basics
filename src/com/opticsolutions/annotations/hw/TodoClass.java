package com.opticsolutions.annotations.hw;

import com.opticsolutions.annotations.hw.Todo.Priority;
import com.opticsolutions.annotations.hw.Todo.Status;

public class TodoClass {
	@Todo(author = "Kao", priority=Priority.HIGH, status=Status.STARTED)
	public void  doSothing() {
		
	}

}
