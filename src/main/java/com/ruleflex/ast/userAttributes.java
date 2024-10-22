package com.ruleflex.ast;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

//This class represents the attributes for user input - age, department,
// income, and spend.
// It contains validation annotations to ensure the data meets specific criteria.

public class UserAttributes {
    @Min(value = 0, message = "Age must be a positive number")
    private int age;

    @NotEmpty(message = "Department cannot be empty")
    private String department;

    @Min(value = 0, message = "Income must be a positive number")
    private double income;

    @Min(value = 0, message = "Spend must be a positive number")
    private double spend;


    //Getters and Setters (Retrieve and change the value of private variables
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }


    public double getIncome(){
        return income;
    }
    public void setIncome(Double income){
        this.income = income;
    }


    public double getSpend(){
        return spend;
    }
    public void setSpend(Double spend){
        this.spend = spend;
    }
}
