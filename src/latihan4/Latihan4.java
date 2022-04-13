/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author LENOVO
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println("Ganjil & Genap Dengan Array");
        System.out.println("===============================");
        System.out.print("Genap:");
        for (int v = 0; v < 20; v++) {
            if (angka[v]%2==0) {
                System.out.print(angka[v] + " ");

            }
        }
        System.out.print("\nGanjil:");
        for (int w = 0; w < 20; w++) {
            if (angka[w]%2!=0) {
                System.out.print(angka[w] + " ");
            }

        }
        System.out.println("");
        System.out.println("===============================");
    }
    
}
