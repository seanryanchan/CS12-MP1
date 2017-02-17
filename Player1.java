import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Player1 extends GameObject {
    int x;
    int y;
    Color c;
    String choice;
    BufferedImage rock, paper, scissors;

    public Player1(){
        x = 150; y = 100;
        c = Color.RED;
        choice = "null";
        rock = MarioWindow.getImage("Rock.png");
        paper = MarioWindow.getImage("Paper.png");
        scissors = MarioWindow.getImage("Scissors.png");

    }

    public void paint(Graphics2D g){
        g.setColor(c);
        // Draws an arc: with 50px radius, 50px height, Starting at angle 0, ending at 360.
        // g.fillArc(x,y,50,50,0,360);
        // g.drawImage(rock,x-150,y,null);
        // g.drawImage(paper,x,y,null);
        // g.drawImage(scissors,x+150,y,null);
    }


    public void keyPressed(String key){
        System.out.println(key);
        // if (key.equals("Q")){
        //     direction = "ROCK";
        // } else if (key.equals("W")){
        //     direction = "PAPER";
        // } else if (key.equals("E")){
        //     direction = "SCISSORS";
        // }
    }
}
