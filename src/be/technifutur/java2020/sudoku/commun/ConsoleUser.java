package be.technifutur.java2020.sudoku.commun;

import be.technifutur.java2020.sudoku.sudoku4x4.codeCommun.User;

import java.util.Scanner;

public class ConsoleUser implements User {
    private Scanner scan = new Scanner(System.in);
    @Override
    public String getString() {
        return scan.nextLine();
    }
}