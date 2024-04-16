package com.pluralsight;

public class Person
{
    //NO PUBLIC CODE ALWAYS PRIVATE!
    private String firstName;
    private String lastName;
    private int age;

    //constructor
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // constructor without limits
    public Person()
    {

    }




    // getters and setters
    // first name
    public String getFirstName ()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        // unless doing . it won't function
        this.firstName = firstName;

    }
    // last name
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    // get age
    public int getAge()
    {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
