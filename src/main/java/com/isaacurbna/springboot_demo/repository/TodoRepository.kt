package com.isaacurbna.springboot_demo.repository

import com.isaacurbna.springboot_demo.model.TodoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param

interface TodoRepository : JpaRepository<TodoEntity, Long> {
	fun findByName(@Param("name") name: String): List<TodoEntity>
}
