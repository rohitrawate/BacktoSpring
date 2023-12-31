package com.web.BacktoSpring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
//@Table(name =  "role_table")
public class Role {

    @Id
    private String name;

    @ManyToMany(mappedBy = "role")
    private List<Member> members;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public List<Member> getMembers(){
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
    public Role( String name)
    {
        this.name = name;
    }
    public Role(){
    }
}
