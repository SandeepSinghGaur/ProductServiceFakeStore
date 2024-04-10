package com.sandeep.productservice.inheritanceDemo.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_student")
public class Student extends User {
    private Float psp;
    private String batchName;
}
