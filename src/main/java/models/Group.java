package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@Entity //table is created in database when group is given as an entity
//@Table(name="UserGroup")// Rename the Table

public class Group extends BaseModel {
    private String groupName;
    private String groupDescription;
    @ManyToMany
    private ArrayList<User> members=new ArrayList<>();// m to n
    @ManyToMany
    private ArrayList<User> admin=new ArrayList<>();// m to n
    @ManyToOne
    private User creator;//  n to 1 // Group's pov
// 1 user can be creator of multiple groups. one group can be created by only one user// from the group pov, it is many to one
}
