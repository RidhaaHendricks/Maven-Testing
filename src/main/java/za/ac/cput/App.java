package za.ac.cput;

/**
 * Hello world!
 *
 */
public class App 
{
    // TO TEST OBJECT EQUALITY
    public String compareWords(String str1, String str2){
        if (str1.equals(str2)){
            return "True";
        } else {
            return "False";
        }
    }

    // TO TEST OBJECT IDENTITY
    public String compareIden(String str1, String str2){
        if (str1 == str2){
            return "True";
        } else {
            return "False";
        }
    }
}
