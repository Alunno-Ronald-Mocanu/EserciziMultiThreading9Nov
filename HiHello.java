/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziomlutithreadingmocanu1;

/**
 *
 * @author mocanu.ronald
 */
public class HiHello {

    Hello p1;
    Hi p2;

    HiHello() {
        p1 = new Hello();
        p2 = new Hi();
    }

    public void Avvio() {
        p1.start();
        p2.start();
    }

}
