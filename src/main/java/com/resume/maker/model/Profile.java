package com.resume.maker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Clob;

@Entity
@Table(name="profile")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profile {

    @Id
    @Column(name="id")
    private int id;


    @Column(name="profile",length = 10000)
    private String profile;
}
