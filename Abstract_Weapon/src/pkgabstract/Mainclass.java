/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author ngend
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Weapon weapon = new Knife();//object sub class memiliki suatu kesamaan dengan parentclasss
  

    Weapon knife = new Knife();//membuat object knife baru
    Weapon gun = new Gun(10);//membuat object gun dengan mempunyai peluru 10

    knife.attack();
    gun.attack();
    gun.attack();
    // masing masing object memanggil method
    
    Knife knife2 = new Knife();//membuat object knife ke dua
    Weapon gun2 = new Gun(10);//membuat object gun kedua dengan peluru yang sana

    knife2.attack();
    gun2.attack();
    gun2.attack();
    //masing-masing object memanggil method
    }
    
}
