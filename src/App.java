import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class App {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
       NumberOneCiii();
    }
    //Number 1C(i)
    private static void NumberOneCi(){
        double A;
        System.out.print("Input the value for x: ");
        int x = scn.nextInt();
//        A= (x)^3 + 5(x)^3+ 3((x^2)/7)
        A= (Math.pow(x, 3)) + (5 *Math.pow(x, 3)) + (3*(Math.pow(x, 2)/7)) ;
        System.out.println(A);
        scn.close();
    }
//    Number 1C(ii)
    private static void NumberOneCii(){
        double B;
        System.out.println("What is the value for x: ");
        int x = scn.nextInt();
        System.out.println("What is the value for w: ");
        int w = scn.nextInt();
        B= Math.sqrt(x) + (4*w) + Math.pow(w, x);
        System.out.printf("B: %f\n", B);
        scn.close();
    }
//    Number 1C(iii)
    private static void NumberOneCiii(){
        double C;
        System.out.println("What is the value for x: ");
        int x = scn.nextInt();
        System.out.print("\nWhat is the value for y: ");
        int y = scn.nextInt();
        System.out.print("\nWhat is the value for z: ");
        int z = scn.nextInt();
        C= (Math.sin(y+z)  - Math.cos(y-z)) / Math.tan(x) ;
        System.out.printf("B: %f\n", C);
        scn.close();
    }
}

