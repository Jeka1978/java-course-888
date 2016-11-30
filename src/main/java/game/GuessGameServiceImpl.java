package game;

import java.util.Random;

/**
 * Created by Evegeny on 30/11/2016.
 */
public class GuessGameServiceImpl implements GuessGameService {
    private Player player;
    private Random random = new Random();


    @Override
    public void play(int max) {
        int number2Guess = random.nextInt(max);

    }

    @Override
    public void printBestScore() {

    }
}
