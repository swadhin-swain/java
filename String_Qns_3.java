/*write a java program to fill in aletter template which looks like below
"dear <|name>|, thanks a lot"
replace <|name|> with any real name.
 */
public class String_Qns_3 {
    public static void main(String[] args) {
        String letter="Dear <|name|>, thanks a lot.";
       System.out.println(  letter.replace("<|name|>","Abhijit"));
    }
}
