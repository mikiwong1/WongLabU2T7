import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        // length
        int length1 = str1.length();
        System.out.println("String length: " + length1);
        //substring
        int half1 = length1 / 2;
        System.out.println(str1.substring(0, half1));
        System.out.println(str1.substring(half1));

        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        int length2 = str2.length();
        if (length1 > length2) {
            System.out.println(str1 + " is longer");
        }
        if (length2 > length1) {
            System.out.println(str2 + " is longer");
        }
        if (length1 == length2) {
            System.out.println("Both strings have the same length");
        }
        //compareTo
        if (str1.compareTo(str2) > 0) {
            System.out.println(str1 + " is first alphabetically");
        }
        if(str2.compareTo(str1) > 0){
            System.out.println(str2 + " is first alphabetically");
        }
        //equals
        if(str1.equals(str2)){
            System.out.println("Both strings have the exact same characters");
        }
        //indexOf
        int index = str2.indexOf(str1);
       if(index == -1){
           System.out.println(str2 + " is NOT found in " + str1);
       } else {
           System.out.println(str2 + " is found in " + str1 + " at index " + index);
       }
    }
}
