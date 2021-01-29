/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezer
 */
public class Player {

    String email;
    String password;
    String name;
    int bankroll;
    int position;
    boolean ingame;
    boolean allin;
    List<Card> cards;

    public Player(String email, String password, String name, int bankroll) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.bankroll = bankroll;
        this.cards = new ArrayList<>();
        this.ingame = true;
        this.allin = false;
    }

    public boolean isIngame() {
        return ingame;
    }

    public boolean isAllin() {
        return allin;
    }

    public void setAllin(boolean allin) {
        this.allin = allin;
    }

    public void setIngame(boolean ingame) {
        this.ingame = ingame;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankroll() {
        return bankroll;
    }

    public void setBankroll(int bankroll) {
        this.bankroll = bankroll;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> Cards) {
        this.cards = Cards;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" + "email=" + email + ", password=" + password + ", name=" + name + ", bankroll=" + bankroll + ", position=" + position + ", ingame=" + ingame + ", cards=" + cards + '}';
    }

}
