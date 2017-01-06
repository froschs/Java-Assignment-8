/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnddiceroller;

/**
 * Interface to pass down roll and getValue methods to descendants
 * @author Seth Frosch
 */
public interface Die {
    public int roll();
    public int getValue();
}
