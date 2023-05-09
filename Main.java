import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-Vindos ao RPG game!");

        Jogador player = new Jogador("Player", 100, 10);

        ArrayList<Monster> monsters ;