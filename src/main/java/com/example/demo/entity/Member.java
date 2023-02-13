package com.example.demo.entity;

import lombok.Data; 

@Data
public class Member {
    
    private Long id;

    private String username;
    private String password;

    private String emp_no;
    private String name;
    private String email;
}
