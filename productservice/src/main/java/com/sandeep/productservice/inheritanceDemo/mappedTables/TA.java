package com.sandeep.productservice.inheritanceDemo.mappedTables;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="ms_TA")
public class TA extends User{
    private String avgRating;
}
