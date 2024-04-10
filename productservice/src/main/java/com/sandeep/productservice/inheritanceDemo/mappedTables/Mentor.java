package com.sandeep.productservice.inheritanceDemo.mappedTables;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="ms_mentor")
public class Mentor extends User{
    private String avgRating;
}
