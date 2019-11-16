/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmultithreadingmocanu2;

/**
 *
 * @author longhitano.stefano
 */
public class CiaoHiHello {

    Say p1;
    Say p2;
    Say p3;

    public CiaoHiHello() {
        p1 = new Say("Ciao");
        p2 = new Say("Hi");
        p3 = new Say("Hello");
    }

    public void Avvio() {
        p1.start();
        p2.start();
        p3.start();
    }
}
