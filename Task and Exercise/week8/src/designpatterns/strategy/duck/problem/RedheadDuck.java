/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.duck.problem;

/**
 *
 * @author user
 */
public class RedheadDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display() {
        System.out.println("It is a read head duck.");
    }
    public void quack(){
        System.out.println("A duck quacks");
    }
    @Override
    public void fly() {
        System.out.println("A duck flies");
    }
    //many other methods here
}
