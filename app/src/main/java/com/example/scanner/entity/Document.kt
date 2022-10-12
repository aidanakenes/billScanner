package com.example.scanner.entity

import java.util.*


data class Document(
    val id: String = UUID.randomUUID().toString(),
    val createdAt: Long = Date().time
)