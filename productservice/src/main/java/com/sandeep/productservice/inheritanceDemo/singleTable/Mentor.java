package com.sandeep.productservice.inheritanceDemo.singleTable;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="st_mentor")
public class Mentor extends User {
    private String avgRating;
}
