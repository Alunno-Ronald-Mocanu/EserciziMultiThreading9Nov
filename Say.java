/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmultithreadingmocanu2;

/**
 *
 * @author mocanu.ronald
 */
public class Say extends Thread {

    String parola;

    Say(String cosaDire) {
        parola = cosaDire;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(parola);
        }
    }
}
