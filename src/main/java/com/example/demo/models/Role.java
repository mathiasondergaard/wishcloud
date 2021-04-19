package com.example.demo.models;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Role {

    @Id
    @SequenceGenerator(name = "role_id_seq", sequenceName = "role_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id_seq")
    @Column(name = "role_id")
    private long id;

    @Column(name = "role")
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
