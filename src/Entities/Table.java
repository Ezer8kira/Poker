/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ezer
 */
public class Table {

    int maxPlayers = 9;
    int minPlayers = 4;
    int numberPlayers;
    int pot;
    int call;
    int button;
    int little;
    int big;
    int phase;
    List<Player> players;
    List<Integer> totalbets;
    List<Integer> priorities;
    List<Integer> kickers1;
    List<Integer> kickers2;
    List<Integer> kickers3;
    List<Integer> kickers4;
    List<Integer> kickers5;
    List<Integer> bets;
    int bigblind;
    int smallblind;
    int ante;
    int currentPosition;
    int finalPosition;
    List<Card> board;
    List<Card> deck;
    List<Priority> ranks;

    public Table(List<Player> players, int bigblind, int smallblind, int ante) {

        this.players = players;
        this.bigblind = bigblind;
        this.smallblind = smallblind;
        this.ante = ante;
        this.call = bigblind;
        this.players = players;
        this.totalbets = new ArrayList<>();
        this.bets = new ArrayList<>();
        this.board = new ArrayList<>();
        this.priorities = new ArrayList<>();
        this.kickers1 = new ArrayList<>();
        this.kickers2 = new ArrayList<>();
        this.kickers3 = new ArrayList<>();
        this.kickers4 = new ArrayList<>();
        this.kickers5 = new ArrayList<>();
        this.ranks = new ArrayList<>();
        for (int i = 0; i < players.size(); i++) {
            bets.add(0);
            totalbets.add(0);
            priorities.add(0);
            kickers1.add(0);
            kickers2.add(0);
            kickers3.add(0);
            kickers4.add(0);
            kickers5.add(0);
        }
        Random r = new Random();
        button = r.nextInt(players.size());

        if (button == this.players.size() - 2) {
            this.little = this.players.size() - 1;
            this.big = 0;

        } else if (button == this.players.size() - 1) {
            this.little = 0;
            this.big = 1;
        } else {
            this.little = button + 1;
            this.big = button + 2;
        }
        this.phase = 0;

    }

    public List<Priority> getRanks() {
        return ranks;
    }

    public void setRanks(List<Priority> ranks) {
        this.ranks = ranks;
    }

    public List<Integer> getTotalbets() {
        return totalbets;
    }

    public void setTotalbets(List<Integer> totalbets) {
        this.totalbets = totalbets;
    }

    public List<Integer> getKickers1() {
        return kickers1;
    }

    public void setKickers1(List<Integer> kickers1) {
        this.kickers1 = kickers1;
    }

    public List<Integer> getKickers2() {
        return kickers2;
    }

    public void setKickers2(List<Integer> kickers2) {
        this.kickers2 = kickers2;
    }

    public List<Integer> getKickers3() {
        return kickers3;
    }

    public void setKickers3(List<Integer> kickers3) {
        this.kickers3 = kickers3;
    }

    public List<Integer> getKickers4() {
        return kickers4;
    }

    public void setKickers4(List<Integer> kickers4) {
        this.kickers4 = kickers4;
    }

    public List<Integer> getKickers5() {
        return kickers5;
    }

    public void setKickers5(List<Integer> kickers5) {
        this.kickers5 = kickers5;
    }

    public List<Integer> getPriorities() {
        return priorities;
    }

    public void setPriorities(List<Integer> priorities) {
        this.priorities = priorities;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public List<Integer> getBets() {
        return bets;
    }

    public void setBets(List<Integer> bets) {
        this.bets = bets;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public int getFinalPosition() {
        return finalPosition;
    }

    public void setFinalPosition(int finalPosition) {
        this.finalPosition = finalPosition;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }

    public int getLittle() {
        return little;
    }

    public void setLittle(int little) {
        this.little = little;
    }

    public int getBig() {
        return big;
    }

    public void setBig(int big) {
        this.big = big;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getBigblind() {
        return bigblind;
    }

    public void setBigblind(int bigblind) {
        this.bigblind = bigblind;
    }

    public int getSmallblind() {
        return smallblind;
    }

    public void setSmallblind(int smallblind) {
        this.smallblind = smallblind;
    }

    public int getAnte() {
        return ante;
    }

    public void setAnte(int ante) {
        this.ante = ante;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public List<Card> getBoard() {
        return board;
    }

    public void setBoard(List<Card> board) {
        this.board = board;
    }

    public List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (int i = 2; i < 15; i++) {
            deck.add(new Card(i, "hearts"));
        }
        for (int i = 2; i < 15; i++) {
            deck.add(new Card(i, "spades"));
        }
        for (int i = 2; i < 15; i++) {
            deck.add(new Card(i, "clubs"));
        }
        for (int i = 2; i < 15; i++) {
            deck.add(new Card(i, "diamonds"));
        }

        Collections.shuffle(deck);
        return deck;
    }

    public void initHand() {
        this.deck = createDeck();
        int notplaying = 0;
        boolean biglittleremoved = false;
        for (int i = 0; i < players.size(); i++) {
            if (i == button) {
                break;
            }
            if (players.get(i).getBankroll() == 0) {
                notplaying++;
            }
        }
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getBankroll() == 0 && (i == big || i == little)) {
                biglittleremoved = true;
            }
        }
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getBankroll() == 0) {
                players.remove(i);
                i--;
            }
        }
        if (notplaying != 0 || biglittleremoved) {
            button = button - notplaying;
            if (button == 0) {
                button = players.size() - 1;
            } else {
                button--;
            }
        }
        int j = 0;
        for (Player p : players) {
            p.getCards().clear();
            totalbets.set(p.getPosition(), 0);
            bets.set(p.getPosition(), 0);
            priorities.set(p.getPosition(), 0);
            kickers1.set(p.getPosition(), 0);
            kickers2.set(p.getPosition(), 0);
            kickers3.set(p.getPosition(), 0);
            kickers4.set(p.getPosition(), 0);
            kickers5.set(p.getPosition(), 0);
            p.setPosition(j);
            p.setIngame(true);
            p.setAllin(false);
            j++;
        }
        board.clear();
        ranks.clear();
        pot = 0;
        call = bigblind;
        phase = 0;
        if (button == players.size() - 1) {
            button = 0;
        } else {
            button++;
        }
        if (players.size() > 2) {
            if (button == this.players.size() - 2) {
                this.little = this.players.size() - 1;
                this.big = 0;
                this.currentPosition = 1;

            } else if (button == this.players.size() - 1) {
                this.little = 0;
                this.big = 1;
                this.currentPosition = 2;
            } else {
                this.little = button + 1;
                this.big = button + 2;
                if (button + 3 > players.size() - 1) {
                    this.currentPosition = 0;
                } else {
                    this.currentPosition = button + 3;
                }
            }
            this.finalPosition = big;
            this.numberPlayers = players.size();
            for (Player player : players) {
                if (players.indexOf(player) == little) {
                    player.setBankroll(player.getBankroll() - this.smallblind);
                    bets.set(little, smallblind);
                    this.pot = this.pot + this.bets.get(little);
                } else if (players.indexOf(player) == big) {
                    player.setBankroll(player.getBankroll() - this.bigblind);
                    bets.set(big, bigblind);
                    this.pot = this.pot + this.bets.get(big);
                } else {
                    bets.set(players.indexOf(player), 0);
                }

                player.setBankroll(player.getBankroll() - this.ante);
                this.pot = this.pot + this.ante;
            }
            for (int i = 0; i < 2; i++) {
                players.get(button).getCards().add(deck.get(0));
                deck.remove(0);
                players.get(little).getCards().add(deck.get(0));
                deck.remove(0);
                players.get(big).getCards().add(deck.get(0));
                deck.remove(0);

                for (Player player : players) {
                    if ((players.indexOf(player) != little) && (players.indexOf(player) != button) && (players.indexOf(player) != big)) {
                        player.getCards().add(deck.get(0));
                    }
                    deck.remove(0);
                }

            }
        } else {
            currentPosition = button;
            finalPosition = button + 1;
            if (finalPosition == players.size()) {
                finalPosition = 0;
            }
            this.numberPlayers = players.size();
            for (Player player : players) {
                if (players.indexOf(player) == button) {
                    player.setBankroll(player.getBankroll() - this.smallblind);
                    bets.set(button, smallblind);
                    this.pot = this.pot + this.bets.get(button);
                } else {
                    player.setBankroll(player.getBankroll() - this.bigblind);
                    bets.set(finalPosition, bigblind);
                    this.pot = this.pot + this.bets.get(finalPosition);
                }
                player.setBankroll(player.getBankroll() - this.ante);
                this.pot = this.pot + this.ante;
            }
            for (int i = 0; i < 2; i++) {
                players.get(button).getCards().add(deck.get(0));
                deck.remove(0);
                players.get(finalPosition).getCards().add(deck.get(0));
                deck.remove(0);
            }
        }
    }

    public int ingameallin() {
        int ingames = 0;
        int allins = 0;
        for (Player player : getPlayers()) {
            if (player.isAllin()) {
                allins++;
            }
            if (player.isIngame()) {
                ingames++;
            }
        }
        return ingames - allins;
    }

    public void flop() {
        deck.remove(0);
        board.add(deck.get(0));
        deck.remove(0);
        board.add(deck.get(0));
        deck.remove(0);
        board.add(deck.get(0));
        deck.remove(0);
        if (players.size() > 2) {
            currentPosition = little;
            finalPosition = button;
        } else {
            currentPosition = button;
            finalPosition = button + 1;
            if (finalPosition == players.size()) {
                finalPosition = 0;
            }
        }
        if (ingameallin() > 1) {
            while (!players.get(finalPosition).isIngame() || players.get(finalPosition).isAllin()) {
                if (finalPosition == 0) {
                    finalPosition = players.size() - 1;
                } else {
                    finalPosition--;
                }
            }
            while (!players.get(currentPosition).isIngame() || players.get(currentPosition).isAllin()) {
                if (currentPosition == players.size() - 1) {
                    currentPosition = 0;
                } else {
                    currentPosition++;
                }
            }
        }
    }

    public void turn() {
        deck.remove(0);
        board.add(deck.get(0));
        deck.remove(0);
        if (players.size() > 2) {
            currentPosition = little;
            finalPosition = button;
        } else {
            currentPosition = button;
            finalPosition = button + 1;
            if (finalPosition == players.size()) {
                finalPosition = 0;
            }
        }
        if (ingameallin() > 1) {
            while (!players.get(finalPosition).isIngame() || players.get(finalPosition).isAllin()) {
                if (finalPosition == 0) {
                    finalPosition = players.size() - 1;
                } else {
                    finalPosition--;
                }
            }
            while (!players.get(currentPosition).isIngame() || players.get(currentPosition).isAllin()) {
                if (currentPosition == players.size() - 1) {
                    currentPosition = 0;
                } else {
                    currentPosition++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Table{" + "numberPlayers=" + numberPlayers + ", pot=" + pot + ", button=" + button + ", little=" + little + ", big=" + big + ", players=" + players + ", bigblind=" + bigblind + ", smallblind=" + smallblind + ", ante=" + ante + ", currentPlayer=" + currentPosition + ", board=" + board + '}';
    }

}
