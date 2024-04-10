package com.sandeep.productservice.inheritanceDemo.singleTable;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="st_TA")
public class TA extends User {
    private String avgRating;
}
