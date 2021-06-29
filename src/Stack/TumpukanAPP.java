/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author User
 */
public class TumpukanAPP {
 public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(10);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println(" ");
        long nilai = tumpukan.peek();
        System.out.println("nilai teratas = " + nilai);
        System.out.println("nama saya adalah (Salsa Dwi Nur Hidayah)");
        tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
    }
}