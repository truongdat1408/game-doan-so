package service;

import repository.GameRepository;

import java.util.Random;

public class GameService {
    public int randomNumber() {
        GameRepository gameRepository = new GameRepository();
        Random random = new Random();
        int number = random.nextInt(1001);
        gameRepository.setNumber(number);
        return number;
    }

    public int getNumber() {
        GameRepository gameRepository = new GameRepository();
        return gameRepository.getNumber();
    }

    public String checkNumber(int guessNumber) {
        GameRepository gameRepository = new GameRepository();
        int number = gameRepository.getNumber();
        return number == guessNumber ? "bang" : (number > guessNumber ? "lon" : "nho");
    }
}
