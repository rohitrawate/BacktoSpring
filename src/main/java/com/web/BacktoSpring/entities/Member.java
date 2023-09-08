package com.web.BacktoSpring.entities;

import org.hibernate.annotations.*;
import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "member_table")
public class Member {

    @Id
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private  String lastName;

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "MEMBER_ROLES", joinColumns = {
//            @JoinColumn(name = "MEMBER_EMAIL", referencedColumnName = "email")},
//            inverseJoinColumns={
//            @JoinColumn( name = "ROLE_NAME", referencedColumnName =  "name")
//    })


    private String role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String getRole() {
        return role;
    }

//    public List<Role>  getRole() {
//        return role;
//    }
//
//    public void setRole(List<Role> role) {
//        this.role = role;
//    }
    public Member() {
    }
//    public Member(  String firstName, String lastName, String email, String password ) {
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.password = password;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(email, member.email) && Objects.equals(password, member.password) && Objects.equals(firstName, member.firstName) && Objects.equals(lastName, member.lastName) && Objects.equals(role, member.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, firstName, lastName, role);
    }

    public  String toString(){
        return  "Member Entity{ "+ "emai= "+ email + ", firstName= "+ firstName + "lastName= "+ lastName;
    }

}
