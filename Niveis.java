import java.util.ArrayList;

public class Niveis {
    private final int levelNumber;
    public final ArrayList<Monster> monsters;

    public Niveis(int levelNumber, ArrayList<Monster> monstros) {
        this.levelNumber = levelNumber;
        this.monsters = monstros;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }
}