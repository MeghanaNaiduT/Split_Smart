package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // it is an entity
public class User extends BaseModel{
    private String name;
    private String password;
    private String email;
    private String phoneNo;
}
