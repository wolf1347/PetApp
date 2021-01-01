package com.am.petmanager.controller
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

class PetAppController {
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String):ResponseEntity<String>{
        return ResponseEntity("Woof", HttpStatus.OK)
    }
}