/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elagazas;

/**
 *
 * @author pette
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int szam = 5;
        
        if (szam >= 0){
            System.out.println("A szám pozitív.");
        }
        else{
            System.out.println("A szám negatív");
        }
        boolean feltetel = (szam >= 0);
        if (feltetel){
            System.out.println("A szám pozitív");
        }
        else{
            System.out.println("A szám pozitív");
        }
        
        System.out.println("Kérek egy számot");
        Scanner be = new Scanner(System.in);
        int a = be.nextInt();
        System.out.println("Kérek egy másik számot");
        int b = be.nextInt();
        if(a < b){
            System.out.printf("A %d nagyobb, mint %d", b,a);
        }
        else{
            System.out.printf("A %d nagyobb, mint %d",a ,b);
            
        }
    }
    
}
