/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Comparator;

/**
 *
 * @author ezer
 */
public class Card implements Comparator<Card>{

    int Number;
    String Suit;
    String picture;

    public Card(int Number, String Suit) {
        this.Number = Number;
        this.Suit = Suit;
        this.picture = Number + "_of_" + Suit + ".png";
    }

    public Card() {
        
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    
    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getSuit() {
        return Suit;
    }

    public void setSuit(String Suit) {
        this.Suit = Suit;
    }

    @Override
    public String toString() {
        return "Card{" + "Number=" + Number + ", Suit=" + Suit + '}';
    }

    @Override
    public int compare(Card t, Card t1) {
        return (t.getNumber()-t1.getNumber());
    }

}
