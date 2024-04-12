package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.util.ArrayList;
@Getter
@Setter
@Entity


public class Expense extends BaseModel {
    @ManyToMany
    private ArrayList<User> users=new ArrayList<User>();
    //n to m // 1 user can have many expenses // 1 expense can belong to many users
    private String description;
    private double totalAmountOwed;
    @OneToMany(mappedBy = "expense")
    private ArrayList<UserExpense> paid=new ArrayList<>();
    //1 to n// a user expense can be of only one type
    // one expense need to be paid by multiple users
    @OneToMany(mappedBy = "expense")
    private ArrayList<UserExpense> owed=new ArrayList<>();// 1 to n
    @Enumerated // to show it is an attribute from enum class that needs to be added in database
    private ExpenseStatus expenseStatus;

}
