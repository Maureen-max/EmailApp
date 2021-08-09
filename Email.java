package com.moh.email.employees;

import java.util.Scanner;

//first started by creating a class email
public class email {

    //set the access modifier to private,so that not everyone can access the info
    //assign all the variables needed
    private String name;
    private String department;
    private String email;
    private int departmentChoice;
    private String password;
    private int defaultPasswordLength = 20;
    private int mailCapacity = 500;
    private String alternativeEmail;
    private String companySuffixName = "university.ac.ke";

    //create a constructor to receive the firstname and the lastname
    //constructor always have class names with no return types

    public email(String name) {
        this.name = name;
        //System.out.println("Email created :" + this.name);

        //call the method asking for the department - return the department after creating a method setDepartment
        this.department = setDepartment();
        System.out.println("School : " + this.department);

        //call the method password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password generated : " + this.password);

        //combine elements to generate email
        email = name.toLowerCase() + "@" + department + companySuffixName;
        System.out.println("Your email is :" + email);

        //get mail capacity
        System.out.println("Mail Capacity : " + mailCapacity + "mb");


    }

    //determine the department
    private String setDepartment() {
        System.out.println("Enter the department for\n1 kabarak \n2 for jkuat\n3 for kenyatta\n4 for kiriri\n0 for none\n" +
                "Enter department Code");

        //generates a platform to input values
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if (departmentChoice == 1) {
            return "kabarak";
        } else if (departmentChoice == 2) {
            return "jkuat";
        } else if (departmentChoice == 3) {
            return "Kenyatta";
         }
        else if (departmentChoice == 4 ){
            return  "Kiriri";
        }
        else {
            return "none";
        }
    }
        //Generate a password
        private String randomPassword(int length){
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$%&*^!";
            char[] password = new char[length];

            for (int i = 0; i < length; i++) {
                int rand = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }
            return new String(password);
        }
        //set mailbox capacity
        //getter methods return values while setter methods update values
        public void setMailCapacity(int capacity) {
            this.mailCapacity = capacity;
        }
        public void setAlternativeEmail(String alternativeEmail){
        this.alternativeEmail = alternativeEmail;
        }
        //set alternative email
        public void getAlternativeEmail(String alternativeEmail){
        this.alternativeEmail = alternativeEmail ;
        }
        public int getMailCapacity(){
        return mailCapacity;
        }
        //change password
         public String getPassword(){
        return password;
         }
         public String showInfo(){
        return "Display name : " + name + "\n" +
                "School Email : " + email + "\n" +
                "Alternative Email :" + alternativeEmail + " \n" +
                "MailBox capacity :" + mailCapacity;

}
    }
