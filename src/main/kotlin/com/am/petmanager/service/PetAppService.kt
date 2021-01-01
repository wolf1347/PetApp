package com.am.petmanager.service

import com.am.petmanager.model.Dog
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service
class PetAppService {
    fun greeting(pet: Dog): String {
        return if(pet.gender == "male")
        {
            "What a good boy ${pet.name}"
        }
        else
        {
            "What a good girl ${pet.name}"
        }
    }
}