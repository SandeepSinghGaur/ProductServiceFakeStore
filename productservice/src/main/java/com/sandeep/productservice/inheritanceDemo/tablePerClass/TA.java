package com.sandeep.productservice.inheritanceDemo.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_TA")
public class TA extends User {
    private String avgRating;
}
