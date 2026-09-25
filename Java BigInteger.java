import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two huge numbers as strings or directly as BigIntegers
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        
        // Perform addition and multiplication
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        
        // Output the results
        System.out.println(sum);
        System.out.println(product);
        
        scanner.close();
    }
}
