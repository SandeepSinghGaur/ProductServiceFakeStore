package com.sandeep.productservice.inheritanceDemo.mappedTables;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="ms_student")
public class Student extends User{
    private Float psp;
    private String batchName;
}
