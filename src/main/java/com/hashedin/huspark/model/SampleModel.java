package com.hashedin.huspark.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SampleModel {
    @Id
    private Long id;
    private String name;
}
