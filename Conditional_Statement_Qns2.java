/*write a program to find out the tybe of website from the URL
.com = commercial website
.org = organization website
.in = indian website
 */
import java.util.Scanner;
public class Conditional_Statement_Qns2 {
  public static void main(String[] args) {
    Scanner p=new Scanner(System.in);
    System.out.println("enter the website:");
    String website=p.next();
    if(website.endsWith(".org")){
    System.out.println("it is an organization website.");
    }
    else if(website.endsWith(".com")){
        System.out.println("it is a commercial website.");
    }
    else if(website.endsWith(".in")){
        System.out.println("it is an indian website.");
    }
    p.close();
  }  
}
