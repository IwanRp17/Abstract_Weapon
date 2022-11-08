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
public class Knife extends Weapon {
  public String knifeEdge;

  @Override
  public void attack() {
    System.out.println("Menyayat dan menusuk musuh");
    System.out.println("Senjata");
  }
}