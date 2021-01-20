package com.kuzmin.security.authenticationserver.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
public class User {
    @Id
    private String username;
    private String password;
}
