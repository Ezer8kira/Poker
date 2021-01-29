/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import Entities.Card;
import Entities.Player;
import Entities.Priority;
import Entities.Table;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import poker.DigitalClock.Clock;

/**
 * FXML Controller class
 *
 * @author Raed
 */
public class TableController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    VBox history, chat;
    @FXML
    Pane clockpane;
    @FXML
    Button fold_button, check_call_button, raise_button, quit_button;
    @FXML
    TextField betfield, chatfield;
    @FXML
    Label chatname;
    @FXML
    Label pot, bet1, bet2, bet3, bet4, bet5, bet6, bet7, bet8, bet9;
    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, name9;
    @FXML
    ImageView button1, button2, button3, button4, button5, button6, button7, button8, button9;
    @FXML
    Label bankroll1, bankroll2, bankroll3, bankroll4, bankroll5, bankroll6, bankroll7, bankroll8, bankroll9;
    @FXML
    ImageView flop1, flop2, flop3, flop4, flop5;
    @FXML
    ImageView card11, card12, card21, card22, card31, card32, card41, card42, card51, card52, card61, card62, card71, card72, card81, card82, card91, card92;
    @FXML
    Slider betslider;
    @FXML
    ScrollPane history_scroll_pane, chat_scroll_pane;
    @FXML
    Tab tabhistory;
    Table table;
    List<Label> names;
    List<Label> bets;
    List<Label> bankrolls;
    List<ImageView> buttons;
    List<ImageView> cards1;
    List<ImageView> cards2;
    List<ImageView> flops;
    List<Integer> startingbankrolls;
    List<String> compo;
    boolean back = true;
    Clock clock;
    Timeline t;
    KeyFrame key;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        compo = new ArrayList<>();
        names = new ArrayList<>();
        bets = new ArrayList<>();
        startingbankrolls = new ArrayList<>();
        bankrolls = new ArrayList<>();
        buttons = new ArrayList<>();
        cards1 = new ArrayList<>();
        cards2 = new ArrayList<>();
        flops = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);
        names.add(name6);
        names.add(name7);
        names.add(name8);
        names.add(name9);
        bets.add(bet1);
        bets.add(bet2);
        bets.add(bet3);
        bets.add(bet4);
        bets.add(bet5);
        bets.add(bet6);
        bets.add(bet7);
        bets.add(bet8);
        bets.add(bet9);
        bankrolls.add(bankroll1);
        bankrolls.add(bankroll2);
        bankrolls.add(bankroll3);
        bankrolls.add(bankroll4);
        bankrolls.add(bankroll5);
        bankrolls.add(bankroll6);
        bankrolls.add(bankroll7);
        bankrolls.add(bankroll8);
        bankrolls.add(bankroll9);
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        cards1.add(card11);
        cards1.add(card21);
        cards1.add(card31);
        cards1.add(card41);
        cards1.add(card51);
        cards1.add(card61);
        cards1.add(card71);
        cards1.add(card81);
        cards1.add(card91);
        cards2.add(card12);
        cards2.add(card22);
        cards2.add(card32);
        cards2.add(card42);
        cards2.add(card52);
        cards2.add(card62);
        cards2.add(card72);
        cards2.add(card82);
        cards2.add(card92);
        flops.add(flop1);
        flops.add(flop2);
        flops.add(flop3);
        flops.add(flop4);
        flops.add(flop5);
        clock = new Clock(Color.RED, Color.TRANSPARENT);
        clock.setLayoutX(0);
        clock.setLayoutY(0);
        clock.getTransforms().add(new Scale(0.2f, 0.2f, 0, 0));
        clockpane.getChildren().add(clock);
        t = new Timeline();
        key = new KeyFrame(Duration.millis(1000));
        t.getKeyFrames().add(key);
//        Player player1 = new Player("email", "password", "player1", 1000);
//        Player player2 = new Player("email", "password", "player2", 2000);
//        Player player3 = new Player("email", "password", "player3", 3000);
//        Player player4 = new Player("email", "password", "player4", 4000);
//        Player player5 = new Player("email", "password", "player5", 5000);
//        Player player6 = new Player("email", "password", "player6", 6000);
//        Player player7 = new Player("email", "password", "player7", 7000);
//        Player player8 = new Player("email", "password", "player8", 8000);
//        Player player9 = new Player("email", "password", "player9", 9000);
        Player player1 = new Player("email", "password", "Player1", 10000);
        Player player2 = new Player("email", "password", "Player2", 10000);
        Player player3 = new Player("email", "password", "Player3", 10000);
       Player player4 = new Player("email", "password", "Player4", 10000);
        List<Player> players = new ArrayList();
        tabhistory.setOnSelectionChanged(new EventHandler<Event>() {
            @Override
            public void handle(Event arg0) {
                history_scroll_pane.setVvalue(1.0);
            }
        });
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
//        players.add(player4);
//        players.add(player5);
//        players.add(player6);
//        players.add(player7);
//        players.add(player8);
//        players.add(player9);
        table = new Table(players, 200, 100, 0);
        table.initHand();
        //tessting on player9
//        List<Card> xxxx = new ArrayList<>();
//        xxxx.add(new Card(14, "hearts"));
//        xxxx.add(new Card(2, "clubs"));
//        table.getPlayers().get(8).setCards(xxxx);
//        
        initgraphique();
    }

    public void quit() {
        if (table.getPlayers().size() > 1) {
            table.getPlayers().get(table.getCurrentPosition()).setBankroll(0);
            fold();
        }
    }

    public void initgraphique() {
        back = true;
        chatname.setText(table.getPlayers().get(table.getCurrentPosition()).getName() + ":");
        compo.clear();
        startingbankrolls.clear();
        for (int i = 0; i < 9; i++) {
            buttons.get(i).setVisible(false);
            bankrolls.get(i).setText("");
            names.get(i).setText("Empty Seat");
            cards1.get(i).setVisible(false);
            cards2.get(i).setVisible(false);
            bets.get(i).setText("");
            bets.get(i).setVisible(true);
            compo.add("");
        }
        for (int xx = 0; xx < 5; xx++) {
            flops.get(xx).setVisible(false);
        }
        if (table.getPlayers().size() > 1) {
            for (int i = 0; i < table.getPlayers().size(); i++) {
                names.get(i).setText(table.getPlayers().get(i).getName());
                startingbankrolls.add(table.getPlayers().get(i).getBankroll());
                bankrolls.get(i).setText(table.getPlayers().get(i).getBankroll() + "");
                bets.get(i).setText(table.getBets().get(i) + "");

                cards1.get(i).setVisible(true);
                cards2.get(i).setVisible(true);
                cards1.get(i).setStyle("-fx-focus-color: #FF9E00;\n"
                        + "    -fx-faint-focus-color: transparent;\n"
                        + "    -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);\n"
                        + "    -fx-background-color: white;\n"
                        + "    -fx-background-radius: 0.0;");
                cards2.get(i).setStyle("-fx-focus-color: #FF9E00;\n"
                        + "    -fx-faint-focus-color: transparent;\n"
                        + "    -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);\n"
                        + "    -fx-background-color: white;\n"
                        + "    -fx-background-radius: 0.0;");
//                cards1.get(i).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getPlayers().get(i).getCards().get(0).getPicture()).toString()));
//                cards2.get(i).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getPlayers().get(i).getCards().get(1).getPicture()).toString()));
                cards1.get(i).setImage(new Image(this.getClass().getResource("/images/cards/back.png").toString()));
                cards2.get(i).setImage(new Image(this.getClass().getResource("/images/cards/back.png").toString()));

                if (i == table.getButton()) {
                    buttons.get(i).setVisible(true);
                    buttons.get(i).setImage(new Image(this.getClass().getResource("/images/buttons/dealer.png").toString()));
                } else if (i == table.getLittle()) {
                    if (table.getPlayers().size() == 2) {
                        buttons.get(i).setVisible(false);
                    } else {
                        buttons.get(i).setVisible(true);
                        buttons.get(i).setImage(new Image(this.getClass().getResource("/images/buttons/small-blind.png").toString()));
                    }

                } else if (i == table.getBig()) {
                    if (table.getPlayers().size() == 2) {
                        buttons.get(i).setVisible(false);
                    } else {
                        buttons.get(i).setVisible(true);
                        buttons.get(i).setImage(new Image(this.getClass().getResource("/images/buttons/big-blind.png").toString()));
                    }

                }
            }
            //coloring current player
            names.get(table.getCurrentPosition()).setTextFill(Color.web("red"));
            pot.setText("Pot: " + table.getPot());
            history.getChildren().add(new Label("Turn of Player : " + table.getPlayers().get(table.getCurrentPosition()).getName()));
            history.getChildren().add(new Label("Enter Your Bet :"));
            betslider.valueProperty().addListener((e, v1, v2) -> {
                betfield.setText(v2.intValue() + "");
            });
            fold_button.setDisable(false);
            check_call_button.setDisable(false);
            raise_button.setDisable(false);
            betslider.setDisable(false);
            betfield.setDisable(false);
            //init slider
            betslider();
            //timer
            t.setOnFinished(e -> {
                clock.refreshClocks();
                clock.time--;
                if (clock.time == -1) {
                    t.stop();
                    fold();
                } else {
                    t.play();
                }

            });
            t.play();
        } else {
            names.get(0).setText(table.getPlayers().get(0).getName());
            startingbankrolls.add(table.getPlayers().get(0).getBankroll());
            bankrolls.get(0).setText(table.getPlayers().get(0).getBankroll() + "");
            bets.get(0).setText("");
            fold_button.setDisable(true);
            check_call_button.setDisable(true);
            raise_button.setDisable(true);
            betslider.setDisable(true);
            betfield.setDisable(true);
            Stage dialogStage = new Stage();
            dialogStage.initModality(Modality.APPLICATION_MODAL);
            dialogStage.setScene(new Scene(VBoxBuilder.create().
                    children(new Text("Player " + table.getPlayers().get(0).getName() + " has won the table !!"), new Button("Return to Lobey")).
                    alignment(Pos.CENTER).padding(new Insets(5)).build()));
            dialogStage.setResizable(false);
            dialogStage.show();
        }
    }

    public void nextposition() {
        do {
            if (table.getCurrentPosition() == table.getPlayers().size() - 1) {
                table.setCurrentPosition(0);
            } else {
                table.setCurrentPosition(table.getCurrentPosition() + 1);
            }
        } while (!table.getPlayers().get(table.getCurrentPosition()).isIngame() || table.getPlayers().get(table.getCurrentPosition()).isAllin());
    }

    public void nextpositiongraph() {
        t.stop();
        clock.time = 30;
        back = true;
        for (Player p : table.getPlayers()) {
            cards1.get(p.getPosition()).setImage(new Image(this.getClass().getResource("/images/cards/back.png").toString()));
            cards2.get(p.getPosition()).setImage(new Image(this.getClass().getResource("/images/cards/back.png").toString()));
        }
        chatname.setText(table.getPlayers().get(table.getCurrentPosition()).getName() + ":");
        //coloring next player
        names.get(table.getCurrentPosition()).setTextFill(Color.web("red"));
        //Message next turn     
        history.getChildren().add(new Label("Turn of Player : " + table.getPlayers().get(table.getCurrentPosition()).getName()));
        history.getChildren().add(new Label("Enter Your Bet :"));
        //timer 30 sec
        //timer

        //Editing buttons
        if ((table.getPlayers().get(table.getCurrentPosition()).getBankroll() + table.getBets().get(table.getCurrentPosition())) <= table.getCall()) {
            check_call_button.setText("Call ALL IN");
            raise_button.setDisable(true);
            betslider.setDisable(true);
            betfield.setDisable(true);
            t.setOnFinished(e -> {
                clock.refreshClocks();
                clock.time--;
                if (clock.time == -1) {
                    t.stop();
                    fold();
                } else {
                    t.play();
                }

            });
            t.play();
        } else if (table.getBets().get(table.getCurrentPosition()) == table.getCall()) {
            check_call_button.setText("Check");
            raise_button.setDisable(false);
            betslider.setDisable(false);
            betfield.setDisable(false);
            t.setOnFinished(e -> {
                clock.refreshClocks();
                clock.time--;
                if (clock.time == -1) {
                    t.stop();
                    check_call();
                } else {
                    t.play();
                }

            });
            t.play();
        } else {
            check_call_button.setText("Call");
            raise_button.setDisable(false);
            betslider.setDisable(false);
            betfield.setDisable(false);
            t.setOnFinished(e -> {
                clock.refreshClocks();
                clock.time--;
                if (clock.time == -1) {
                    t.stop();
                    fold();
                } else {
                    t.play();
                }

            });
            t.play();
        }
        if (table.getPlayers().get(table.getCurrentPosition()).getBankroll() <= table.getBigblind()) {
            raise_button.setText("Raise ALL IN");
            raise_button.setDisable(false);
            betslider.setDisable(true);
            betfield.setDisable(true);
        } else {
            raise_button.setText("Raise");
            raise_button.setDisable(false);
            betslider.setDisable(false);
            betfield.setDisable(false);
        }
    }

    public void fold() {
        //Folding
        boolean transition = false;
        boolean handover = false;
        table.getPlayers().get(table.getCurrentPosition()).setIngame(false);
        table.getBets().set(table.getCurrentPosition(), 0);
        table.getTotalbets().set(table.getCurrentPosition(), 0);
        history.getChildren().add(new Label("Player " + table.getPlayers().get(table.getCurrentPosition()).getName() + " Folded"));
        table.setNumberPlayers(table.getNumberPlayers() - 1);
        //hiding cards
        cards1.get(table.getCurrentPosition()).setVisible(false);
        cards2.get(table.getCurrentPosition()).setVisible(false);
        //hiding bets
        bets.get(table.getCurrentPosition()).setVisible(false);
        //coloring current player to white
        names.get(table.getCurrentPosition()).setTextFill(Color.web("white"));
        //case last position and fold
        if (table.getCurrentPosition() == table.getFinalPosition()) {
            if (table.getPhase() == 0) {
                if (table.ingameallin() <= 1) {
                    history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));
                    table.flop();
                    table.turn();
                    table.turn();
                    for (int xx = 0; xx < 5; xx++) {
                        flops.get(xx).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(xx).getPicture()).toString()));
                        flops.get(xx).setVisible(true);
                    }
                    table.setPhase(3);
                    winner();
                    transition = true;
                    handover = true;

                } else {
                    history.getChildren().add(new Label("GO TO FLOP"));
                    table.flop();
                    for (int i = 0; i < 3; i++) {
                        flops.get(i).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(i).getPicture()).toString()));
                        flops.get(i).setVisible(true);
                    }
                    for (Player p : table.getPlayers()) {
                        table.getBets().set(p.getPosition(), 0);
                        bets.get(p.getPosition()).setText(0 + "");
                    }
                    table.setCall(0);
                    table.setPhase(1);
                    transition = true;
                }
            } else if (table.getPhase() == 1) {
                if (table.ingameallin() == 0) {
                    history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));

                    table.turn();
                    table.turn();
                    for (int xx = 3; xx < 5; xx++) {
                        flops.get(xx).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(xx).getPicture()).toString()));
                        flops.get(xx).setVisible(true);
                    }
                    table.setPhase(3);
                    winner();
                    transition = true;
                    handover = true;
                } else {
                    history.getChildren().add(new Label("GO TO Turn"));
                    table.turn();
                    flops.get(3).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(3).getPicture()).toString()));
                    flops.get(3).setVisible(true);
                    for (Player p : table.getPlayers()) {
                        table.getBets().set(p.getPosition(), 0);
                        bets.get(p.getPosition()).setText(0 + "");
                    }
                    table.setCall(0);
                    table.setPhase(2);
                    transition = true;
                }
            } else if (table.getPhase() == 2) {
                if (table.ingameallin() == 0) {
                    history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));
                    table.turn();
                    flops.get(4).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(4).getPicture()).toString()));
                    flops.get(4).setVisible(true);
                    table.setPhase(3);
                    winner();
                    transition = true;
                    handover = true;
                } else {
                    history.getChildren().add(new Label("GO TO River"));
                    table.turn();
                    flops.get(4).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(4).getPicture()).toString()));
                    flops.get(4).setVisible(true);
                    for (Player p : table.getPlayers()) {
                        table.getBets().set(p.getPosition(), 0);
                        bets.get(p.getPosition()).setText(0 + "");
                    }
                    table.setCall(0);
                    table.setPhase(3);
                    transition = true;
                }
            } else if (table.getPhase() == 3) {
                winner();
                transition = true;
                handover = true;
            }
        }
        //Next position
        if (!transition) {
            nextposition();
        }
        if (!handover) {
            //init slider for next player
            betslider();
            //if last one to fold than next guy (current position) wins.
            if (table.getNumberPlayers() == 1) {
                history.getChildren().add(new Label("Player " + table.getPlayers().get(table.getCurrentPosition()).getName() + " Won " + table.getPot()));
                table.getPlayers().get(table.getCurrentPosition()).setBankroll(table.getPlayers().get(table.getCurrentPosition()).getBankroll() + table.getPot());
                bankrolls.get(table.getCurrentPosition()).setText(table.getPlayers().get(table.getCurrentPosition()).getBankroll() + "");

                table.setPot(0);
                pot.setText("Pot: 0");
                fold_button.setDisable(true);
                check_call_button.setDisable(true);
                raise_button.setDisable(true);
                betslider.setDisable(true);
                betfield.setDisable(true);

                bets.get(table.getCurrentPosition()).setVisible(false);

                this.t.stop();
                clock.time = 30;

                Timeline t = new Timeline();
                KeyFrame key = new KeyFrame(Duration.millis(5000));
                t.getKeyFrames().add(key);
                t.setOnFinished(e -> {
                    table.initHand();
                    initgraphique();
                });
                t.play();

            } else {
                nextpositiongraph();
            }
        } else {
            history.getChildren().add(new Label("Hand is over , going next hand"));
        }
        history_scroll_pane.setVvalue(1.0f);
    }

    public void check_call() {
        boolean transition = false;
        boolean handover = false;
        if (table.getCall() - table.getBets().get(table.getCurrentPosition()) >= table.getPlayers().get(table.getCurrentPosition()).getBankroll()) {
            history.getChildren().add(new Label("Player " + table.getPlayers().get(table.getCurrentPosition()).getName() + " is ALL IN  with " + (table.getBets().get(table.getCurrentPosition()) + table.getPlayers().get(table.getCurrentPosition()).getBankroll())));
            history.getChildren().add(new Label("SIDE POT"));
            //updating pot
            table.setPot(table.getPot() + table.getPlayers().get(table.getCurrentPosition()).getBankroll());
            //going all in
            table.getBets().set(table.getCurrentPosition(), table.getBets().get(table.getCurrentPosition()) + table.getPlayers().get(table.getCurrentPosition()).getBankroll());
            table.getTotalbets().set(table.getCurrentPosition(), table.getTotalbets().get(table.getCurrentPosition()) + table.getPlayers().get(table.getCurrentPosition()).getBankroll());
            //updating player bankroll
            table.getPlayers().get(table.getCurrentPosition()).setBankroll(0);
            //editing bets number
            bets.get(table.getCurrentPosition()).setText(table.getBets().get(table.getCurrentPosition()) + "");
            //editing pot
            pot.setText("Pot: " + table.getPot());
            //editing bankroll
            bankrolls.get(table.getCurrentPosition()).setText(table.getPlayers().get(table.getCurrentPosition()).getBankroll() + "");
            //coloring previous player white
            names.get(table.getCurrentPosition()).setTextFill(Color.web("white"));
            table.getPlayers().get(table.getCurrentPosition()).setAllin(true);
        } else {
            if ((table.getCall() - table.getBets().get(table.getCurrentPosition())) == 0) {
                history.getChildren().add(new Label("Player " + table.getPlayers().get(table.getCurrentPosition()).getName() + " Checked "));
            } else {
                history.getChildren().add(new Label("Player " + table.getPlayers().get(table.getCurrentPosition()).getName() + " Called " + table.getCall()));
            }
            table.getPlayers().get(table.getCurrentPosition()).setBankroll(table.getPlayers().get(table.getCurrentPosition()).getBankroll() - (table.getCall() - table.getBets().get(table.getCurrentPosition())));
            table.setPot(table.getPot() + (table.getCall() - table.getBets().get(table.getCurrentPosition())));
            table.getBets().set(table.getCurrentPosition(), table.getCall());
            table.getTotalbets().set(table.getCurrentPosition(), (table.getTotalbets().get(table.getCurrentPosition()) + table.getCall()));
            //editing bets number
            bets.get(table.getCurrentPosition()).setText(table.getBets().get(table.getCurrentPosition()) + "");
            //editing pot
            pot.setText("Pot: " + table.getPot());
            //editing bankroll
            bankrolls.get(table.getCurrentPosition()).setText(table.getPlayers().get(table.getCurrentPosition()).getBankroll() + "");
            //coloring previous player white
            names.get(table.getCurrentPosition()).setTextFill(Color.web("white"));
        }
        if (table.getCurrentPosition() == table.getFinalPosition()) {
            if (table.getPhase() == 0) {
                if (table.ingameallin() <= 1) {

                    history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));
                    table.flop();
                    table.turn();
                    table.turn();
                    for (int xx = 0; xx < 5; xx++) {
                        flops.get(xx).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(xx).getPicture()).toString()));
                        flops.get(xx).setVisible(true);
                    }
                    table.setPhase(3);
                    winner();
                    transition = true;
                    handover = true;
                } else {
                    history.getChildren().add(new Label("GO TO FLOP"));
                    table.flop();
                    for (int i = 0; i < 3; i++) {
                        flops.get(i).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(i).getPicture()).toString()));
                        flops.get(i).setVisible(true);
                    }
                    for (Player p : table.getPlayers()) {
                        table.getBets().set(p.getPosition(), 0);
                        bets.get(p.getPosition()).setText(0 + "");
                    }
                    table.setCall(0);
                    table.setPhase(1);
                    transition = true;
                }
            } else if (table.getPhase() == 1) {
                if (table.ingameallin() <= 1) {
                    history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));

                    table.turn();
                    table.turn();
                    for (int xx = 3; xx < 5; xx++) {
                        flops.get(xx).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(xx).getPicture()).toString()));
                        flops.get(xx).setVisible(true);
                    }
                    table.setPhase(3);
                    winner();
                    transition = true;
                    handover = true;
                } else {
                    history.getChildren().add(new Label("GO TO Turn"));
                    table.turn();
                    flops.get(3).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(3).getPicture()).toString()));
                    flops.get(3).setVisible(true);
                    for (Player p : table.getPlayers()) {
                        table.getBets().set(p.getPosition(), 0);
                        bets.get(p.getPosition()).setText(0 + "");
                    }
                    table.setCall(0);
                    table.setPhase(2);
                    transition = true;
                }
            } else if (table.getPhase() == 2) {
                if (table.ingameallin() <= 1) {
                    history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));
                    table.turn();
                    flops.get(4).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(4).getPicture()).toString()));
                    flops.get(4).setVisible(true);
                    table.setPhase(3);
                    winner();
                    transition = true;
                    handover = true;
                } else {
                    history.getChildren().add(new Label("GO TO River"));
                    table.turn();
                    flops.get(4).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(4).getPicture()).toString()));
                    flops.get(4).setVisible(true);
                    for (Player p : table.getPlayers()) {
                        table.getBets().set(p.getPosition(), 0);
                        bets.get(p.getPosition()).setText(0 + "");
                    }
                    table.setCall(0);
                    table.setPhase(3);
                    transition = true;
                }
            } else if (table.getPhase() == 3) {
                winner();
                transition = true;
                handover = true;
            }
        }
        //Next position
        if (!transition) {
            nextposition();
        }

        if (!handover) {
            //init slider for next player
            betslider();
            nextpositiongraph();
        } else {
            history.getChildren().add(new Label("Hand is over , going next hand"));
        }
        history_scroll_pane.setVvalue(1.0f);
    }

    public void raise() {
        boolean transition = false;
        boolean handover = false;
        int x = Integer.parseInt(betfield.getText());
        if ((x <= table.getPlayers().get(table.getCurrentPosition()).getBankroll() && ((x + table.getBets().get(table.getCurrentPosition())) >= (table.getCall() + table.getBigblind()))) || table.getPlayers().get(table.getCurrentPosition()).getBankroll() <= table.getBigblind()) {
            // all in less big blind ( (table.getPlayers().get(table.getCurrentPosition()).getBankroll() + table.getBets().get(table.getCurrentPosition()) - table.getCall()) < table.getBigblind())
            if (x == table.getPlayers().get(table.getCurrentPosition()).getBankroll() || table.getPlayers().get(table.getCurrentPosition()).getBankroll() <= table.getBigblind()) {
                //updating pot
                table.setPot(table.getPot() + table.getPlayers().get(table.getCurrentPosition()).getBankroll());
                //going all in
                table.getBets().set(table.getCurrentPosition(), table.getBets().get(table.getCurrentPosition()) + table.getPlayers().get(table.getCurrentPosition()).getBankroll());
                table.getTotalbets().set(table.getCurrentPosition(), table.getTotalbets().get(table.getCurrentPosition()) + table.getPlayers().get(table.getCurrentPosition()).getBankroll());

                //updating player bankroll
                table.getPlayers().get(table.getCurrentPosition()).setBankroll(0);
                history.getChildren().add(new Label("Player " + table.getPlayers().get(table.getCurrentPosition()).getName() + " is ALL IN  with " + (table.getBets().get(table.getCurrentPosition()) + table.getPlayers().get(table.getCurrentPosition()).getBankroll())));
                table.getPlayers().get(table.getCurrentPosition()).setAllin(true);
            } else {
                history.getChildren().add(new Label("Player " + table.getPlayers().get(table.getCurrentPosition()).getName() + " Raised to " + (table.getBets().get(table.getCurrentPosition()) + x)));
                table.getPlayers().get(table.getCurrentPosition()).setBankroll(table.getPlayers().get(table.getCurrentPosition()).getBankroll() - x);
                table.setPot(table.getPot() + x);
                table.getBets().set(table.getCurrentPosition(), table.getBets().get(table.getCurrentPosition()) + x);
                table.getTotalbets().set(table.getCurrentPosition(), table.getTotalbets().get(table.getCurrentPosition()) + x);
            }
            table.setCall(table.getBets().get(table.getCurrentPosition()));
            if (table.ingameallin() > 1) {
                int i = 1;
                if (table.getCurrentPosition() == 0) {
                    table.setFinalPosition(table.getPlayers().size() - 1);
                } else {
                    table.setFinalPosition(table.getCurrentPosition() - 1);
                }
                while (!table.getPlayers().get(table.getFinalPosition()).isIngame() || table.getPlayers().get(table.getFinalPosition()).isAllin()) {

                    if (table.getCurrentPosition() == 0) {
                        table.setFinalPosition(table.getPlayers().size() - i);
                    } else {
                        if (table.getFinalPosition() == 0) {
                            table.setFinalPosition(table.getPlayers().size() - 1);
                        } else {
                            table.setFinalPosition(table.getFinalPosition() - 1);
                        }
                    }
                    i++;
                }
            }
            //editing bets number
            bets.get(table.getCurrentPosition()).setText(table.getBets().get(table.getCurrentPosition()) + "");
            //editing pot
            pot.setText("Pot: " + table.getPot());
            //editing bankroll
            bankrolls.get(table.getCurrentPosition()).setText(table.getPlayers().get(table.getCurrentPosition()).getBankroll() + "");
            //coloring previous player white
            names.get(table.getCurrentPosition()).setTextFill(Color.web("white"));

            if (table.getCurrentPosition() == table.getFinalPosition()) {
                if (table.getPhase() == 0) {
                    if (table.ingameallin() <= 1) {
                        history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));
                        table.flop();
                        table.turn();
                        table.turn();
                        for (int xx = 0; xx < 5; xx++) {
                            flops.get(xx).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(xx).getPicture()).toString()));
                            flops.get(xx).setVisible(true);
                        }
                        table.setPhase(3);
                        winner();
                        transition = true;
                        handover = true;
                    } else {
                        history.getChildren().add(new Label("GO TO FLOP"));
                        table.flop();
                        for (int i = 0; i < 3; i++) {
                            flops.get(i).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(i).getPicture()).toString()));
                            flops.get(i).setVisible(true);
                        }
                        for (Player p : table.getPlayers()) {
                            table.getBets().set(p.getPosition(), 0);
                            bets.get(p.getPosition()).setText(0 + "");
                        }
                        table.setCall(0);
                        table.setPhase(1);
                        transition = true;
                    }
                } else if (table.getPhase() == 1) {
                    if (table.ingameallin() <= 1) {
                        history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));

                        table.turn();
                        table.turn();
                        for (int xx = 3; xx < 5; xx++) {
                            flops.get(xx).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(xx).getPicture()).toString()));
                            flops.get(xx).setVisible(true);
                        }
                        table.setPhase(3);
                        winner();
                        transition = true;
                        handover = true;
                    } else {
                        history.getChildren().add(new Label("GO TO Turn"));
                        table.turn();
                        flops.get(3).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(3).getPicture()).toString()));
                        flops.get(3).setVisible(true);
                        for (Player p : table.getPlayers()) {
                            table.getBets().set(p.getPosition(), 0);
                            bets.get(p.getPosition()).setText(0 + "");
                        }
                        table.setCall(0);
                        table.setPhase(2);
                        transition = true;
                    }
                } else if (table.getPhase() == 2) {
                    if (table.ingameallin() <= 1) {
                        history.getChildren().add(new Label("Everyone ALl in so showing rest of cards"));
                        table.turn();
                        flops.get(4).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(4).getPicture()).toString()));
                        flops.get(4).setVisible(true);
                        table.setPhase(3);
                        winner();
                        transition = true;
                        handover = true;
                    } else {
                        history.getChildren().add(new Label("GO TO River"));
                        table.turn();
                        flops.get(4).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(4).getPicture()).toString()));
                        flops.get(4).setVisible(true);
                        for (Player p : table.getPlayers()) {
                            table.getBets().set(p.getPosition(), 0);
                            bets.get(p.getPosition()).setText(0 + "");
                        }
                        table.setCall(0);
                        table.setPhase(3);
                        transition = true;
                    }
                } else if (table.getPhase() == 3) {
                    winner();
                    transition = true;
                    handover = true;
                }
            }
            //Next position
            if (!transition) {
                nextposition();
            }

            if (!handover) {
                //init slider for next player
                betslider();
                nextpositiongraph();
            } else {
                history.getChildren().add(new Label("Hand is over , going next hand"));
            }
        }
        history_scroll_pane.setVvalue(1.0f);
    }

    public void winner() {
        List<Integer> totalbetscopy = new ArrayList();
        for (Integer copyvalue : table.getTotalbets()) {
            totalbetscopy.add(copyvalue);
        }
        //testing winner
//        List<Card> yyyy = new ArrayList<>();
//        yyyy.add(new Card(10, "hearts"));
//        yyyy.add(new Card(11, "hearts"));
//        yyyy.add(new Card(12, "hearts"));
//        yyyy.add(new Card(13, "hearts"));
//        yyyy.add(new Card(14, "hearts"));
//        table.setBoard(yyyy);
        for (int i = 0; i < 5; i++) {
            flops.get(i).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getBoard().get(i).getPicture()).toString()));
        }
        int i = 0;
        for (Player p : table.getPlayers()) {
            if (p.isIngame()) {
                //creating 
                List<Card> hand = new ArrayList();
                hand.addAll(table.getBoard());
                hand.addAll(p.getCards());
                hand.sort(new Card());
                //testing straight flush
                int sf = straightFlush(hand);
                //reseting 
                hand.clear();
                hand.addAll(table.getBoard());
                hand.addAll(p.getCards());
                hand.sort(new Card());
                //testing quads
                int qds = quads(hand);
                //testing full house
                List<Integer> fh = fullhouse(hand);
                //testing flush
                int fl = flush(hand, p.getCards(), table.getBoard());
                //resetting
                hand.clear();
                hand.addAll(table.getBoard());
                hand.addAll(p.getCards());
                hand.sort(new Card());
                //testing straight
                int str = straight(hand);
                //resetting
                hand.clear();
                hand.addAll(table.getBoard());
                hand.addAll(p.getCards());
                hand.sort(new Card());
                //testing triple
                List<Integer> trip = triple(hand);
                //resetting
                hand.clear();
                hand.addAll(table.getBoard());
                hand.addAll(p.getCards());
                hand.sort(new Card());
                //testing two pairs
                List<Integer> two = twopairs(hand);
                //resetting
                hand.clear();
                hand.addAll(table.getBoard());
                hand.addAll(p.getCards());
                hand.sort(new Card());
                //testing one pair
                List<Integer> one = onepair(hand);
                //resetting
                hand.clear();
                hand.addAll(table.getBoard());
                hand.addAll(p.getCards());
                hand.sort(new Card());
                //testing high
                List<Integer> high = high(hand);
                //resetting
                hand.clear();
                hand.addAll(table.getBoard());
                hand.addAll(p.getCards());
                hand.sort(new Card());
                if (sf >= 5) {
                    table.getPriorities().set(i, 9);
                    table.getKickers1().set(i, sf);
                    if (sf == 14) {
                        history.getChildren().add(new Label("Player " + p.getName() + " Have a Royal Flush !!!!!!!!!!!"));
                        compo.set(p.getPosition(), " with Royal Flush !!!!!!!!!!!");
                    } else {
                        history.getChildren().add(new Label("Player " + p.getName() + " Have Straight Flush With Kicker " + sf));
                        compo.set(p.getPosition(), " with Straight Flush to " + sf);
                    }
                } else if (qds >= 2) {
                    table.getPriorities().set(i, 8);
                    table.getKickers1().set(i, qds);
                    history.getChildren().add(new Label("Player " + p.getName() + " Have Quads of " + qds));
                    compo.set(p.getPosition(), " with Quads of " + qds);
                } else if (fh.get(0) >= 2) {
                    table.getPriorities().set(i, 7);
                    table.getKickers1().set(i, fh.get(0));
                    table.getKickers2().set(i, fh.get(1));
                    history.getChildren().add(new Label("Player " + p.getName() + " Have full house of " + fh.get(0) + " Full of " + fh.get(1)));
                    compo.set(p.getPosition(), " with Full House of " + fh.get(0) + " Full of " + fh.get(1));
                } else if (fl >= 2) {
                    table.getPriorities().set(i, 6);
                    table.getKickers1().set(i, fl);
                    history.getChildren().add(new Label("Player " + p.getName() + " Have Flush with Kicker " + fl));
                    compo.set(p.getPosition(), " with Flush to " + fl);
                } else if (str >= 5) {
                    table.getPriorities().set(i, 5);
                    table.getKickers1().set(i, str);
                    history.getChildren().add(new Label("Player " + p.getName() + " Have Straight with Kicker " + str));
                    compo.set(p.getPosition(), " with Straight to " + str);
                } else if (trip.get(0) >= 2) {
                    table.getPriorities().set(i, 4);
                    table.getKickers1().set(i, trip.get(0));
                    table.getKickers2().set(i, trip.get(1));
                    table.getKickers3().set(i, trip.get(2));
                    history.getChildren().add(new Label("Player " + p.getName() + " Have Triple " + trip.get(0) + " with kicker " + trip.get(1) + " and kicker " + trip.get(2)));
                    compo.set(p.getPosition(), " with Triple " + trip.get(0));
                } else if (two.get(0) >= 2) {
                    table.getPriorities().set(i, 3);
                    table.getKickers1().set(i, two.get(0));
                    table.getKickers2().set(i, two.get(1));
                    table.getKickers3().set(i, two.get(2));
                    history.getChildren().add(new Label("Player " + p.getName() + " Have two pairs " + two.get(0) + " and " + two.get(1) + " with kicker " + two.get(2)));
                    compo.set(p.getPosition(), " with Two pairs of " + two.get(0) + " and " + two.get(1));
                } else if (one.get(0) >= 2) {
                    table.getPriorities().set(i, 2);
                    table.getKickers1().set(i, one.get(0));
                    table.getKickers2().set(i, one.get(1));
                    table.getKickers3().set(i, one.get(2));
                    table.getKickers4().set(i, one.get(3));
                    history.getChildren().add(new Label("Player " + p.getName() + " Have one pair of " + one.get(0) + " with kicker " + one.get(1) + " " + one.get(2) + " " + one.get(3)));
                    compo.set(p.getPosition(), " with one pair of " + one.get(0));
                } else {
                    table.getPriorities().set(i, 1);
                    table.getKickers1().set(i, high.get(0));
                    table.getKickers2().set(i, high.get(1));
                    table.getKickers3().set(i, high.get(2));
                    table.getKickers4().set(i, high.get(3));
                    table.getKickers5().set(i, high.get(4));
                    history.getChildren().add(new Label("Player " + p.getName() + " Have high of " + high.get(0) + " with kicker " + high.get(1) + " " + high.get(2) + " " + high.get(3) + " " + high.get(4)));
                    compo.set(p.getPosition(), " with " + high.get(0) + " high");
                }

            }
            i++;
        }
        //ordering winners by ranks
        i = 0;
        for (Player p : table.getPlayers()) {
            table.getRanks().add(new Priority(p, table.getPriorities().get(i), table.getKickers1().get(i), table.getKickers2().get(i), table.getKickers3().get(i), table.getKickers4().get(i), table.getKickers5().get(i)));
            i++;
        }
        table.getRanks().sort(new Priority());
        i = 1;
        for (Priority p : table.getRanks()) {
            p.setRank(i);
            i++;
        }
        for (Priority p : table.getRanks()) {
            for (Priority p2 : table.getRanks()) {
                if (p.compare(p, p2) == 0) {
                    p2.setRank(p.getRank());
                }
            }
        }
//        //testing
//        table.getTotalbets().set(0, 800);
//        table.getTotalbets().set(1, 800);
//        table.getTotalbets().set(2, 400);
//        table.getTotalbets().set(3, 800);
//        table.getTotalbets().set(4, 700);
//        table.getTotalbets().set(5, 500);
//        table.getTotalbets().set(6, 600);
//        table.getTotalbets().set(7, 300);
//        table.getTotalbets().set(8, 200);
        //====
        int largest = 0;
        int secondlargest = 0;
        do {
            largest = 0;
            secondlargest = 0;
            for (int bet : table.getTotalbets()) {
                if (bet > largest) {
                    secondlargest = largest;
                    largest = bet;
                }
                if ((bet < largest) && (bet > secondlargest)) {
                    secondlargest = bet;
                }

            }
            if (largest == secondlargest) {
                secondlargest = 0;
            }
            List<Priority> temp = new ArrayList();
            for (int j = 0; j < table.getTotalbets().size(); j++) {
                if (table.getTotalbets().get(j) == largest) {
                    for (Priority r : table.getRanks()) {
                        if (r.getPlayer().getPosition() == j) {
                            temp.add(r);
                            break;
                        }
                    }
                }
            }
            int minrank = 10;
            for (Priority r : temp) {
                if (r.getRank() < minrank) {
                    minrank = r.getRank();
                }
            }
            int n = 0;
            int loot = 0;
            for (Priority r : temp) {
                if (r.getRank() == minrank) {
                    n++;
                }
                loot = loot + (largest - secondlargest);
                table.getTotalbets().set(r.getPlayer().getPosition(), secondlargest);
                table.setPot(table.getPot() - (largest - secondlargest));
            }
            largest = secondlargest;
            for (Priority r : temp) {
                if (r.getRank() == minrank) {
                    r.getPlayer().setBankroll(r.getPlayer().getBankroll() + Math.round(loot / n));
                    if (largest == 0) {
                        r.getPlayer().setBankroll(r.getPlayer().getBankroll() + Math.round(table.getPot() / n));
                    }
                }
            }
        } while (largest != 0);
        history.getChildren().add(new Label(""));
        for (int a = 0; a < table.getPlayers().size(); a++) {
            if (startingbankrolls.get(a) < table.getPlayers().get(a).getBankroll()) {
                if (table.getPlayers().get(a).getPosition() == table.getBig()) {
                    history.getChildren().add(new Label("Player " + table.getPlayers().get(a).getName() + " Won " + (table.getPlayers().get(a).getBankroll() - startingbankrolls.get(a) + totalbetscopy.get(a) - table.getBigblind()) + compo.get(a)));
                } else if (table.getPlayers().get(a).getPosition() == table.getLittle()) {
                    history.getChildren().add(new Label("Player " + table.getPlayers().get(a).getName() + " Won " + (table.getPlayers().get(a).getBankroll() - startingbankrolls.get(a) + totalbetscopy.get(a) - table.getSmallblind()) + compo.get(a)));

                } else {
                    history.getChildren().add(new Label("Player " + table.getPlayers().get(a).getName() + " Won " + (table.getPlayers().get(a).getBankroll() - startingbankrolls.get(a) + totalbetscopy.get(a)) + compo.get(a)));

                }
                cards1.get(a).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getPlayers().get(a).getCards().get(0).getPicture()).toString()));
                cards2.get(a).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getPlayers().get(a).getCards().get(1).getPicture()).toString()));

            }
        }
        for (Player p : table.getPlayers()) {
            bankrolls.get(p.getPosition()).setText(p.getBankroll() + "");
        }
        fold_button.setDisable(true);
        check_call_button.setDisable(true);
        raise_button.setDisable(true);
        betslider.setDisable(true);
        betfield.setDisable(true);
        //
        this.t.stop();
        clock.time = 30;

        Timeline t = new Timeline();
        KeyFrame key = new KeyFrame(Duration.millis(5000));
        t.getKeyFrames().add(key);
        t.setOnFinished(e -> {
            table.initHand();
            initgraphique();
        });
        t.play();
    }

    public int straightFlush(List<Card> hand) {
        int D = 0;
        int H = 0;
        int S = 0;
        int C = 0;
        //check if flush
        for (Card card : hand) {
            switch (card.getSuit()) {
                case "hearts":
                    H++;
                    break;
                case "diamonds":
                    D++;
                    break;
                case "clubs":
                    C++;
                    break;
                case "spades":
                    S++;
                    break;
            }
        }
        if (H >= 5) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getSuit() != "hearts") {
                    hand.remove(i);
                    i--;
                }
            }
        } else if (D >= 5) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getSuit() != "diamonds") {
                    hand.remove(i);
                    i--;
                }
            }
        } else if (C >= 5) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getSuit() != "clubs") {
                    hand.remove(i);
                    i--;
                }
            }
        } else if (S >= 5) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getSuit() != "spades") {
                    hand.remove(i);
                    i--;
                }
            }
        } else {
            return -1;
        }
        //adding ace value 1 to the end of list
        int x = hand.size();
        for (int i = 0; i < x; i++) {
            if (hand.get(i).getNumber() == 14) {
                hand.add(new Card(1, hand.get(i).getSuit()));
            }
        }
        //sorting after adition
        hand.sort(new Card());
        //check if straight
        int j = 1;
        int i = hand.size() - 1;
        int kicker = hand.get(hand.size() - 1).getNumber();
        while (i > 0 && j < 5) {
            if ((hand.get(i).getNumber() - hand.get(i - 1).getNumber()) == 1) {
                j++;
            } else if ((hand.get(i).getNumber() - hand.get(i - 1).getNumber()) == 0) {

            } else {
                j = 1;
                kicker = hand.get(i - 1).getNumber();
            }
            i--;
        }
        if (j != 5) {
            kicker = -1;
        }
        return kicker;
    }

    public int quads(List<Card> hand) {
        for (Card card : hand) {
            int j = 0;
            for (Card x : hand) {
                if (x.getNumber() == card.getNumber()) {
                    j++;
                }
                if (j == 4) {
                    return card.getNumber();
                }
            }
        }
        return -1;
    }

    public List<Integer> fullhouse(List<Card> hand) {
        List<Integer> fh = new ArrayList();
        int triple = 0;
        int pair = 0;
        for (Card card : hand) {
            int j = 0;
            for (Card x : hand) {
                if (x.getNumber() == card.getNumber()) {
                    j++;
                }
                if (j == 3) {
                    triple = x.getNumber();
                    j = 0;
                }
            }
        }
        for (Card card : hand) {
            int j = 0;
            for (Card x : hand) {
                if ((x.getNumber() == card.getNumber()) && (x.getNumber() != triple)) {
                    j++;
                }
                if (j == 2 && (x.getNumber() != triple)) {
                    pair = x.getNumber();
                    j = 0;
                }
            }
        }
        if (triple >= 3 && pair >= 2) {
            fh.add(triple);
            fh.add(pair);
            return fh;
        }
        fh.add(-1);
        fh.add(-1);
        return fh;
    }

    public int flush(List<Card> hand, List<Card> cards, List<Card> board) {
        int D = 0;
        int H = 0;
        int S = 0;
        int C = 0;
        int BD = 0;
        int BH = 0;
        int BS = 0;
        int BC = 0;
        int kicker = 0;
        cards.sort(new Card());
        board.sort(new Card());
        for (Card card : hand) {
            switch (card.getSuit()) {
                case "hearts":
                    H++;
                    break;
                case "diamonds":
                    D++;
                    break;
                case "clubs":
                    C++;
                    break;
                case "spades":
                    S++;
                    break;
            }
        }
        for (Card card : board) {
            switch (card.getSuit()) {
                case "hearts":
                    BH++;
                    break;
                case "diamonds":
                    BD++;
                    break;
                case "clubs":
                    BC++;
                    break;
                case "spades":
                    BS++;
                    break;
            }
        }
        if (H >= 5) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getSuit() != "hearts") {
                    hand.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < cards.size(); i++) {
                if (cards.get(i).getSuit() == "hearts") {
                    kicker = cards.get(i).getNumber();
                }
            }

            if (kicker < board.get(0).getNumber() && (BH == board.size())) {

                kicker = board.get(0).getNumber();

            }
            return kicker;
        } else if (D >= 5) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getSuit() != "diamonds") {
                    hand.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < cards.size(); i++) {
                if (cards.get(i).getSuit() == "diamonds") {
                    kicker = cards.get(i).getNumber();
                }
            }
            if (kicker < board.get(0).getNumber() && (BD == board.size())) {
                kicker = board.get(0).getNumber();
            }
            return kicker;
        } else if (C >= 5) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getSuit() != "clubs") {
                    hand.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < cards.size(); i++) {
                if (cards.get(i).getSuit() == "clubs") {
                    kicker = cards.get(i).getNumber();
                }
            }
            if (kicker < board.get(0).getNumber() && (BC == board.size())) {
                kicker = board.get(0).getNumber();
            }
            return kicker;
        } else if (S >= 5) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getSuit() != "spades") {
                    hand.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < cards.size(); i++) {
                if (cards.get(i).getSuit() == "spades") {
                    kicker = cards.get(i).getNumber();
                }
            }
            if (kicker < board.get(0).getNumber() && (BS == board.size())) {
                kicker = board.get(0).getNumber();
            }
            return kicker;
        }
        return -1;
    }

    public int straight(List<Card> hand) {
        //adding ace value 1 to the end of list
        int x = hand.size();
        for (int i = 0; i < x; i++) {
            if (hand.get(i).getNumber() == 14) {
                hand.add(new Card(1, hand.get(i).getSuit()));
            }
        }
        //sorting after adition
        hand.sort(new Card());
        //check if straight
        int j = 1;
        int i = hand.size() - 1;
        int kicker = hand.get(hand.size() - 1).getNumber();
        while (i > 0 && j < 5) {
            if ((hand.get(i).getNumber() - hand.get(i - 1).getNumber()) == 1) {
                j++;
            } else if ((hand.get(i).getNumber() - hand.get(i - 1).getNumber()) == 0) {
            } else {
                j = 1;
                kicker = hand.get(i - 1).getNumber();
            }
            i--;
        }
        if (j != 5) {
            kicker = -1;
        }
        return kicker;
    }

    public List<Integer> triple(List<Card> hand) {
        List<Integer> kickers = new ArrayList<>();
        int trip = 0;
        int kicker = 0;
        int kicker2 = 0;
        for (Card card : hand) {
            int j = 0;
            for (Card x : hand) {
                if (x.getNumber() == card.getNumber()) {
                    j++;
                }
                if (j == 3) {
                    trip = x.getNumber();
                    j = 0;
                }
            }
        }
        if (trip >= 2) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getNumber() == trip) {
                    hand.remove(i);
                    i--;
                }
            }
            kicker = hand.get(hand.size() - 1).getNumber();
            kicker2 = hand.get(hand.size() - 2).getNumber();
            kickers.add(trip);
            kickers.add(kicker);
            kickers.add(kicker2);
            return kickers;
        }
        kickers.add(-1);
        kickers.add(-1);
        kickers.add(-1);
        return kickers;
    }

    public List<Integer> twopairs(List<Card> hand) {
        List<Integer> kickers = new ArrayList<>();
        int highpair = 0;
        int lowpair = 0;
        int kicker = 0;
        for (Card card : hand) {
            int j = 0;
            for (Card x : hand) {
                if (x.getNumber() == card.getNumber()) {
                    j++;
                }
                if (j == 2) {
                    highpair = x.getNumber();
                    j = 0;
                }
            }
        }
        if (highpair >= 2) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getNumber() == highpair) {
                    hand.remove(i);
                    i--;
                }
            }
        }
        for (Card card : hand) {
            int j = 0;
            for (Card x : hand) {
                if (x.getNumber() == card.getNumber()) {
                    j++;
                }
                if (j == 2) {
                    lowpair = x.getNumber();
                    j = 0;
                }
            }
        }
        if (lowpair >= 2) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getNumber() == lowpair) {
                    hand.remove(i);
                    i--;
                }
            }
            kicker = hand.get(hand.size() - 1).getNumber();
            kickers.add(highpair);
            kickers.add(lowpair);
            kickers.add(kicker);
            return kickers;
        }
        kickers.add(-1);
        kickers.add(-1);
        kickers.add(-1);
        return kickers;
    }

    public List<Integer> onepair(List<Card> hand) {
        List<Integer> kickers = new ArrayList<>();
        int pair = 0;
        int kicker = 0;
        int kicker2 = 0;
        int kicker3 = 0;
        for (Card card : hand) {
            int j = 0;
            for (Card x : hand) {
                if (x.getNumber() == card.getNumber()) {
                    j++;
                }
                if (j == 2) {
                    pair = x.getNumber();
                    j = 0;
                }
            }
        }
        if (pair >= 2) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getNumber() == pair) {
                    hand.remove(i);
                    i--;
                }
            }
            kicker = hand.get(hand.size() - 1).getNumber();
            kicker2 = hand.get(hand.size() - 2).getNumber();
            kicker3 = hand.get(hand.size() - 3).getNumber();
            kickers.add(pair);
            kickers.add(kicker);
            kickers.add(kicker2);
            kickers.add(kicker3);
            return kickers;
        }
        kickers.add(-1);
        kickers.add(-1);
        kickers.add(-1);
        kickers.add(-1);
        return kickers;
    }

    public List<Integer> high(List<Card> hand) {
        List<Integer> kickers = new ArrayList();
        kickers.add(hand.get(hand.size() - 1).getNumber());
        kickers.add(hand.get(hand.size() - 2).getNumber());
        kickers.add(hand.get(hand.size() - 3).getNumber());
        kickers.add(hand.get(hand.size() - 4).getNumber());
        kickers.add(hand.get(hand.size() - 5).getNumber());
        return kickers;
    }

    public void betslider() {
        if (table.getPlayers().get(table.getCurrentPosition()).getBankroll() == 0) {
            betslider.setDisable(true);
            betfield.setDisable(true);
        } else {
            betslider.setDisable(false);
            betfield.setDisable(false);
            betslider.setMajorTickUnit(Math.round(table.getPlayers().get(table.getCurrentPosition()).getBankroll() / 5));
            betslider.setMinorTickCount(Math.round(table.getBigblind()));
            betslider.setMin(table.getCall() - table.getBets().get(table.getCurrentPosition()) + table.getBigblind());
            betslider.setMax(table.getPlayers().get(table.getCurrentPosition()).getBankroll());
            betfield.setText(Math.round(betslider.getValue()) + "");
            betslider.setValue(Math.round(betslider.getMin()));
        }
    }

    public void betfield() {
        try {
            if (Integer.parseInt(betfield.getText()) > betslider.getMax()) {
                betslider.setValue(Math.round(betslider.getMax()));
                betfield.setText(Math.round(betslider.getMax()) + "");
            } else if ((Integer.parseInt(betfield.getText()) < betslider.getMin())) {
                betslider.setValue(Math.round(betslider.getMin()));
                betfield.setText(Math.round(betslider.getMin()) + "");
            } else {
                betslider.setValue(Integer.parseInt(betfield.getText()));
            }
        } catch (Exception ex) {
            history.getChildren().add(new Label("Please Enter a Valid Bet"));
        }
    }

    public void chating() {
        int spaces = 0;
        for (int i = 0; i < chatfield.getText().length(); i++) {
            if (chatfield.getText().charAt(i) == ' ') {
                spaces++;
            }
        }
        if (!chatfield.getText().isEmpty() && spaces != chatfield.getText().length()) {
            chat.getChildren().add(new Label(table.getPlayers().get(table.getCurrentPosition()).getName() + ": " + chatfield.getText()));
        }
        chatfield.setText("");

    }

    public void showmycards(Event e) {
        if (e.getSource().equals(cards1.get(table.getCurrentPosition())) || e.getSource().equals(cards2.get(table.getCurrentPosition()))) {
            if (back) {
                cards1.get(table.getCurrentPosition()).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getPlayers().get(table.getCurrentPosition()).getCards().get(0).getPicture()).toString()));
                cards2.get(table.getCurrentPosition()).setImage(new Image(this.getClass().getResource("/images/cards/" + table.getPlayers().get(table.getCurrentPosition()).getCards().get(1).getPicture()).toString()));
                back = false;
            } else {
                cards1.get(table.getCurrentPosition()).setImage(new Image(this.getClass().getResource("/images/cards/back.png").toString()));
                cards2.get(table.getCurrentPosition()).setImage(new Image(this.getClass().getResource("/images/cards/back.png").toString()));
                back = true;
            }
        }
    }

    public void zoommycards(Event e) {
        if (e.getSource().equals(cards1.get(table.getCurrentPosition())) || e.getSource().equals(cards2.get(table.getCurrentPosition()))) {
            if (!back) {
//                Stage dialogStage = new Stage();
//                dialogStage.initModality(Modality.WINDOW_MODAL);
//                dialogStage.setScene(new Scene(VBoxBuilder.create().
//                        children(new Text("Player " + table.getPlayers().get(0).getName() + " has won the table !!"), new Button("Return to Lobey")).
//                        alignment(Pos.CENTER).padding(new Insets(5)).build()));
//                dialogStage.setResizable(false);
//                dialogStage.show();
            }
        }
    }

    public void unzoommycards(Event e) {

    }

}
