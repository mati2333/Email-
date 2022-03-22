package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departament;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLenght = 10;
    private String alternateEmail;
    private String companySuffix = "anycompany.com";
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: "+this.firstName+" "+this.lastName);
        this.departament = setDepartament();

        this.password = randomPassword(defaultPasswordLenght);

        email = firstName.toLowerCase() + "."+lastName.toLowerCase()+"0"+"."+ companySuffix;

    }

    private String setDepartament(){
        System.out.println("New worker: "+firstName+"Department codes\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1)
        {
            return "sales";
        } else if (depChoice == 2)
        {
            return "dev";
        } else if (depChoice == 3)
        {
            return "acct";
        } else {
            return " ";
        }


    }

    private String randomPassword(int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ1234567890!@#$%^&*";
        char[] password = new char[lenght];
        for (int i=0; i<lenght; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    public void setAlternateEmail(String  altEmail)
    {
        this.alternateEmail = altEmail;
    }
    public void changePassword(String password)
    {
        this.password = password;
    }


    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){ return password;}


    public String showInfo()
    {
        return "DISPLAY NAME: "+ firstName + " " + lastName+
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPCITY: "+mailboxCapacity + "ab";
    }
}
