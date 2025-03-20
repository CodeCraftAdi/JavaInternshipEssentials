//Task2 : Take user's name having two words  as input having first letters as lowercase respectively and convert into Uppercase
//e.g Enter "deepak panwar" and output should  be "Deepak Panwar"

import java.util.Scanner;

public class ToUpperCase
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");

        String str = sc.nextLine();

        String [] str1 =str.split(" ");
        System.out.print ("Output is :  "+ " ");
        for(String s : str1)
        {
            // System.out.print( s.substring(0,1).toUpperCase().concat(s.substring(1)).concat(" "));
            System.out.print(s.substring(0, 1).toUpperCase()+s.substring(1) + " ");
        }
        sc.close(); 
    }
}
