import java.awt.*;

public class ME10 {
    public static void main(String args[]){
        MarioWindow w1 = new MarioWindow();
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Controller c = new Controller(p1, p2);
        w1.add(p1);
        w1.add(p2);
        w1.add(c);
        w1.startGame();
    }
}
