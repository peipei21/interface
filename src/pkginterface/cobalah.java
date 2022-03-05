/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author asus
 */
public class cobalah {
    public static void main(String[] args) {
        Line cobalah=new Line(2.5,3,4,5);
        Line pertama=new Line(3,4,5,6);
        cobalah.getLength();
        cobalah.isGreater(cobalah, pertama);
        System.out.println(cobalah.isGreater(cobalah, pertama));
    }
}
