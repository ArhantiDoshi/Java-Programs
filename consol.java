import java.io.Console; 
class consol
{   
 public static void main(String args[])
     {   
  Console c=System.console();   
System.out.println("Enter password: ");   
char[ ] ch=c.readPassword();   
String pass=String.valueOf(ch);
System.out.println("Password is: "+pass);  

}   
} 