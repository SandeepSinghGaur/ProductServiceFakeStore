package com.sandeep.productservice.inheritanceDemo.singleTable;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="st_student")
public class Student extends User {
    private Float psp;
    private String batchName;
}
