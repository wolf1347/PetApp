package com.am.petmanager.controller
import com.am.petmanager.model.Dog
import com.am.petmanager.service.PetAppService
import com.beust.klaxon.Klaxon
import org.springframework.boot.configurationprocessor.json.JSONObject
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@Controller
class PetAppController (
    val service: PetAppService
        ){
    @GetMapping("/greeting/{name}")
    fun greeting(@PathVariable name: String):ResponseEntity<String>{
        return ResponseEntity("Woof $name", HttpStatus.OK)
    }

    @PostMapping("/greeting")
    fun createGreeting(@RequestBody body: String):ResponseEntity<String>{
        //deserializing the responsebody which is a JSON string in to a dog object called result
       val result: Dog? = Klaxon().parse<Dog>(body)
        return if (result != null) {
            ResponseEntity(service.greeting(result),HttpStatus.ACCEPTED)
        } else {
            ResponseEntity("Error",HttpStatus.BAD_REQUEST)
        }
    }
}