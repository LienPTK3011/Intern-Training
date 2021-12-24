/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.Java8;

/**
 *
 * @author Dang
 */
public interface Animal {
    public void Eat();
    public void Breath();
    
    default void Run()
    {
        
    }
}
