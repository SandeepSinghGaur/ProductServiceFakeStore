package com.sandeep.productservice.inheritanceDemo.singleTable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="st_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String mobile;
}
