package com.example.animal;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public record Dog(@Id UUID id, String name, Breed breed) {}
