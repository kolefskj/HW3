package HW3;
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        int counter = 0;
        for (int k = 0; k < str.length(); k++)
        {
            if (str.charAt(k) == "e")
            {
                counter++;
            }
        }
        return (counter >= 1 && count <= 3);
    }

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) 
    {
        String temporary = "";
        for (int k = 0; k < n; k++)
        {
            temporary += str;
        }
        return temporary;
    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringZ("zHelloz") -> "zHelloz"
    //stringZ("nozthaznks") -> "nothanks"
    //stringZ("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str, char l)
    {
        int j;
        int count = 0;
        int n = s.length();
        char []t = s.toCharArray();
        for (int k = j = 0; k <n; k++)
        {
            if (t[i] != l)
            {
                t[j++] = t[i];
            }
            else
                count++;
        }
        
        while (count > 0)
        {
            t[j++] = '\0';
            count--;
        }

        System.out.println(t);
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums()
    {
        int input = 0, sum = 0, x = 0;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a number: ");
        while (input != 0);
        {
            input = scan.nextInt();
            sum += input;
            System.out.println("The total so far is " +sum);
            x++;

        } 
        System.out.println("Total is: " +sum);
    }

    public static void main(String[] args) {
        // Add code to help test your methods here
        Loops.loopE("eeeeat");
        Loops.stringTimes("Code", 4);
        Loops.stringZ("nozthanksz", 'z');
        Loops.sums();
    }
    
}