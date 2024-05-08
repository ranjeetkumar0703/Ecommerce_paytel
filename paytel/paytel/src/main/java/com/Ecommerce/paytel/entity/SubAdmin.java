package com.Ecommerce.paytel.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "subadmins")
public class SubAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "mainlink")
    private String mainlink;

    @Column(name = "sublink")
    private String sublink;

    public SubAdmin(String username, String password, String mainlink, String sublink) {
        this.username = username;
        this.password = password;
        this.mainlink = mainlink;
        this.sublink = sublink;
    }
}
