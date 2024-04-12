package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class UserExpense extends BaseModel {
    //private float paid;
    //private float owed;
    @ManyToOne
    private User user;// m to 1
    @ManyToOne
    @JoinColumn(name= "expense_id")
    private Expense expense;// n to 1
    //UserExpense has expense attribute
    //Expense class has userExpense attribute.
    // therefore a foreign key is necessary
    //and the foreign key is on the n cardinality side
    @Enumerated
    private ExpenseType expenseType;
    private float amount;

    /*
    // code for enum class
    public void setEnum(String type){
        if(type.equals("Paid")){
            expenseType=ExpenseType.Paid;
        }
        else{
            expenseType=ExpenseType.Owed;
        }
    }*/

}
