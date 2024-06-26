package com.sandeep.productservice.inheritanceDemo.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name="jt_student")
@PrimaryKeyJoinColumn(name="user_id")
public class Student extends User {
    private Float psp;
    private String batchName;
}
