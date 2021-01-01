package com.am.petmanager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetManagerApplication

fun main(args: Array<String>) {
	runApplication<PetManagerApplication>(*args)
	println("Hello world!")
}
