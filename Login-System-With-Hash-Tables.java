import java.util.*;
import java.util.Enumeration;
import java.util.Scanner;
// Java program to demonstrate
// clear() method
  
import java.nio.*;

public class Main {
    public static void main(String[] args) {
      
      Hashtable<String, String> Accounts = new Hashtable<>();
      Accounts.put("hs5924414@gmail.com", "(Password);");
      Accounts.put("mrw58901878@gmail.com", "getch();");
      Accounts.put("codeonlinesource@gmail.com", "#include<iostream>");
      Accounts.put("hs1361237@gmail.com", "#includesss");
      
      
      Scanner inp = new Scanner(System.in);  
      
      
      String email="hs5924414@gmail.com", pass="(Password);"; // Sir bas Buffering Issue Arraha He...
      
      // -> that's why email-pass Hard-Code Hen, But Logic Complete He.. :D I Hope You Like It :)
      
      // System.out.println("Your Email: ");
      // String givenEmail = inp.next(); 
      
      // System.out.println("Your Pass: ");
      // String givenPass = inp.next();
      
      Enumeration<String> e = Accounts.keys(); 
      
      
      boolean isExist=false; 
      while(e.hasMoreElements()){
        String dbEmail = e.nextElement();
        String dbPassword = Accounts.get(dbEmail);
        
        if(!dbEmail.equals(email) )
          continue;
        isExist = true;
        
          if(!dbPassword.equals(pass)){
            System.out.println('\''+dbEmail+'\''+": Incorrect Passoword For " );
            break;
          }
          System.out.println("Welcome!\n"+'\''+dbEmail +"\': Successfully, Login :)");
      }
      if(!isExist) System.out.println('\''+email +'\''+", Account Doesn't Exist");
  }
}