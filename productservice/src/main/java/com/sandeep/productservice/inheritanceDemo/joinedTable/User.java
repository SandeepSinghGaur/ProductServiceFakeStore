package com.sandeep.productservice.inheritanceDemo.joinedTable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="jt_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String mobile;
}
