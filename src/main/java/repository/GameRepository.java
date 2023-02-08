package repository;

public class GameRepository {
    private static int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        GameRepository.number = number;
    }
}
