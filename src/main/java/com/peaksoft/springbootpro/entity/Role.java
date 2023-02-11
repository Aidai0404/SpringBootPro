package com.peaksoft.springbootpro.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String roleName;
}
