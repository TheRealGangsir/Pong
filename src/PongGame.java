/**
 * Created on 11/17/2016, 2:17 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project Pong
 */

public class PongGame {
    public static final int PLAYING = 0, PLAYER1_WINS = 1, PLAYER2_WINS = 2;
    Paddle p1, p2;
    Ball ball;
    int status, player1Score, player2Score;

    public PongGame() {
    }

    void update() {

    }

    int status() {
        return 0;
    }

    public Paddle getP1() {
        return p1;
    }

    public Paddle getP2() {
        return p2;
    }

    public Ball getBall() {
        return ball;
    }

    void moveBall(double distance) {

    }

    int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    boolean hitTopWall() {
        return false;
    }

    boolean hitBottomWall() {
        return false;
    }

    boolean hitLeftPaddle() {
        return false;
    }

    boolean hitRightPaddle() {
        return false;
    }

    void reset() {

    }

}