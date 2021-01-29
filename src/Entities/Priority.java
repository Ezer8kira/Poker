/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Comparator;

/**
 *
 * @author Raed
 */
public class Priority implements Comparator<Priority> {

    Player player;
    int priority;
    int kicker1;
    int kicker2;
    int kicker3;
    int kicker4;
    int kicker5;
    int rank;

    public Priority(Player player, int priority, int kicker1, int kicker2, int kicker3, int kicker4, int kicker5) {
        this.player = player;
        this.priority = priority;
        this.kicker1 = kicker1;
        this.kicker2 = kicker2;
        this.kicker3 = kicker3;
        this.kicker4 = kicker4;
        this.kicker5 = kicker5;
    }

    public Priority() {

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getKicker1() {
        return kicker1;
    }

    public void setKicker1(int kicker1) {
        this.kicker1 = kicker1;
    }

    public int getKicker2() {
        return kicker2;
    }

    public void setKicker2(int kicker2) {
        this.kicker2 = kicker2;
    }

    public int getKicker3() {
        return kicker3;
    }

    public void setKicker3(int kicker3) {
        this.kicker3 = kicker3;
    }

    public int getKicker4() {
        return kicker4;
    }

    public void setKicker4(int kicker4) {
        this.kicker4 = kicker4;
    }

    public int getKicker5() {
        return kicker5;
    }

    public void setKicker5(int kicker5) {
        this.kicker5 = kicker5;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compare(Priority t, Priority t1) {
        if (t.getPriority() == t1.getPriority()) {
            if (t.getKicker1() == t1.getKicker1()) {
                if (t.getKicker2() == t1.getKicker2()) {
                    if (t.getKicker3() == t1.getKicker3()) {
                        if (t.getKicker4() == t1.getKicker4()) {
                            if (t.getKicker5() == t1.getKicker5()) {
                                return 0;
                            } else {
                                return t1.getKicker5() - t.getKicker5();
                            }
                        } else {
                            return t1.getKicker4() - t.getKicker4();
                        }
                    } else {
                        return t1.getKicker3() - t.getKicker3();
                    }
                } else {
                    return t1.getKicker2() - t.getKicker2();
                }
            } else {
                return t1.getKicker1() - t.getKicker1();
            }
        } else {
            return t1.getPriority() - t.getPriority();
        }
    }

    @Override
    public String toString() {
        return "Priority{" + "player=" + player.getName() + ", priority=" + priority + ", rank=" + rank + '}';
    }

}
