import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Controller extends GameObject {
    String display;

    // Giving Controller access to our 'player' models
    Player1 p1;
    Player2 p2;
    // Passing Controller our p1 and p2 Objects
    public Controller(Player1 a, Player2 b){
        display = "rock paper scissors!";
        p1 = a;
        p2 = b;
    }

    public void paint(Graphics2D g){
        g.setColor(Color.WHITE);
        g.setFont(new Font("Impact", Font.BOLD, 48));
        g.drawString(display.toUpperCase(), 400, 600);
        // g.drawImage(p1.rock,p1.x,p1.y,null);
        // g.drawImage(p1.paper,p1.x,p1.y,null);
        // g.drawImage(p1.scissors,p1.x+50,p1.y,null);
    }

    // example
    public void run(){
        while(true) {
            if(p2.choice.equals("null")){
                display = "it is player 1's turn";
                MarioWindow.delay(3000);
                display = "3";
                MarioWindow.delay(1000);
                display = "2";
                MarioWindow.delay(1000);
                display = "1";
                MarioWindow.delay(1000);
                display = "go";
                String ans1 = JOptionPane.showInputDialog("P1: Rock, Paper or Scissors?");
                if(ans1.equals("Rock")){
                    p1.choice = "rock";
                } else if(ans1.equals("Paper")){
                    p1.choice = "paper";
                } else if(ans1.equals("Scissors")){
                    p1.choice = "scissors";
                } else {
                    p1.choice = "null";
                }

                String ans2 = JOptionPane.showInputDialog("P2: Rock, Paper or Scissors?");
                if(ans2.equals("Rock")){
                    p2.choice = "rock";
                } else if(ans2.equals("Paper")){
                    p2.choice = "paper";
                } else if(ans2.equals("Scissors")){
                    p2.choice = "scissors";
                } else {
                    p2.choice = "null";
                }
            }

            // checker
            if(p1.choice.equals("rock") && p2.choice.equals("rock")){
                display = "it's a tie!";
            } else if(p1.choice.equals("rock") && p2.choice.equals("scissors")){
                display = "player 1 wins!";
            } else if(p1.choice.equals("rock") && p2.choice.equals("paper")){
                display = "player 2 wins!";
            } else if(p1.choice.equals("scissors") && p2.choice.equals("rock")){
                display = "player 2 wins!";
            } else if(p1.choice.equals("scissors") && p2.choice.equals("paper")){
                display = "player 1 wins!";
            } else if(p1.choice.equals("scissors") && p2.choice.equals("scissors")){
                display = "it's a tie!";
            } else if(p1.choice.equals("paper") && p2.choice.equals("rock")){
                display = "player 1 wins!";
            } else if(p1.choice.equals("paper") && p2.choice.equals("paper")){
                display = "it's a tie!";
            } else if(p1.choice.equals("paper") && p2.choice.equals("scissors")){
                display = "player 2 wins!";
            }

            MarioWindow.delay(3000);
            String newgame = JOptionPane.showInputDialog("Do you want to play a new game? (y/n)");
            if (newgame.equals("y")){
                p2.choice = "null";
            } else if (newgame.equals("n")){

            } else {

            }
        }
    }
    public void keyPressed(String key){
        System.out.println(key);
        if (key.equals("Q")){
            p1.choice = "rock";
        } else if (key.equals("W")){
            p1.choice = "paper";
        } else if (key.equals("E")){
            p1.choice = "scissors";
        }
    }
}
