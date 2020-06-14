/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acku.ibg3;

/**
 *
 * @author Uma
 */
public class Ibg3 {
     private String main;
    private String noodles;

    @Override
    public String toString() {
        return "Ibg3{" + "main=" + main + ", noodles=" + noodles + '}';
    }
    
    

    public Ibg3() {
    }

    public Ibg3(String main, String noodles) {
        this.main = main;
        this.noodles = noodles;
    }
    
    

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getNoodles() {
        return noodles;
    }

    public void setNoodles(String noodles) {
        this.noodles = noodles;
    }
    
    
}
