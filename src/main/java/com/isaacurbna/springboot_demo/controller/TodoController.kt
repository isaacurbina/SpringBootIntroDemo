package com.isaacurbna.springboot_demo.controller

import com.isaacurbna.springboot_demo.model.CreateTodoRequest
import com.isaacurbna.springboot_demo.model.TodoEntity
import com.isaacurbna.springboot_demo.repository.TodoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodoController(
	private val todoRepository: TodoRepository
) {

	@GetMapping
	fun getTodos(
		@RequestParam(value = "name") name: String
	): List<TodoEntity> {
		return todoRepository.findByName(name = name)
	}

	@PostMapping
	fun postTodo(
		@RequestBody request: CreateTodoRequest
	): TodoEntity {
		return todoRepository.save(TodoEntity(name = request.name))
	}

}
