package com.isaacurbna.springboot_demo.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table
import org.springframework.data.annotation.Id

@Entity
@Table(name = "todos")
data class TodoEntity(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long = 0,

	@Column(nullable = false)
	val name: String
)
