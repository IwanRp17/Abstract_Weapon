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
public class Gun extends Weapon {
  public int bullets;

  public Gun(int bullets) {
    this.bullets = bullets;// memasukkan nilai peluru
  }

  @Override
  public void attack() {
    if (bullets > 0) {//jika peluru lebih dari 0 maka dapat menembakkan
      bullets--;
      System.out.println("Menembakkan peluru");
      System.out.println("Sisa peluru: " + bullets);
      if (bullets == 9)
        System.out.println("Senjata");
    } else {
      System.out.println("Peluru habis");
    }
  }
}