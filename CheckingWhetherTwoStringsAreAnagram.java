package ReanneEscotaCheckingehethertwostringareanagram;
import java.util.Arrays;

 public class CheckingWhetherTwoStringsAreAnagram {

  public static void checkIfAnagram(String string1, String string2) {
        
        int lenOfString1 = string1.length();
        int lenOfString2 = string2.length();

        if(lenOfString1 != lenOfString2) {
            System.out.println("The two string are not anagram");
        }

        char[] charArray1 = string1.toUpperCase().toCharArray();
        char[] charArray2 = string2.toUpperCase().toCharArray();
     
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        string1 = String.valueOf(charArray1);
        string2 = String.valueOf(charArray2);

        boolean isAnagram = string1.equalsIgnoreCase(string2);

        if (isAnagram == true) {
            System.out.println("The two strings are anagram");
        } else if (isAnagram == false){
            System.out.println("The two strings are not anagram");
        }

    }
    public static void main(String[] args) {
        

        System.out.print("Enter first string: ");
     
        System.out.print("Enter second string: ");
        
        System.out.println();

       
    }

  }