package com.isaacurbna.springboot_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class SpringBootIntroApplication

fun main(args: Array<String>) {
	runApplication<SpringBootIntroApplication>(*args)
}

@Component
class Test {
	init {
		println("Hello world!")
	}
}
