import java.util.*;
import java.lang.*;
import java.io.*;

class num
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // Read number of test cases

        while (t-- > 0)
        {
            int n = sc.nextInt();  // Read number of elements

            String[] s = new String[n];  // Array to store input strings
            String[] r = new String[n];  // Array to store the result as strings

            for (int i = 0; i < n; i++)
            {
                s[i] = sc.next();  // Read input string (either "0" or "1")
                
                // If the string is "0", store "1" in result array, else store "0"
                if (s[i].equals("0"))
                {
                    r[i] = "1";
                }
                else
                {
                    r[i] = "0";
                }
            }

            // Print the result array
            for (int i = 0; i < n; i++)
            {
                System.out.print(r[i]);
            }
            System.out.println();  // Print a new line after each test case result
        }

        sc.close();  // Close the scanner to release resources
    }
}
