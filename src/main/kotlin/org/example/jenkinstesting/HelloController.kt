package org.example.jenkinstesting

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloController {

    @GetMapping
    suspend fun printHello(): Flow<String> {
        println("fix:NC-240")
        return flowOf("Hello World")
    }
}