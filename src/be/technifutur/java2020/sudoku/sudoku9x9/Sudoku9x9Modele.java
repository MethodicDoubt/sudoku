package be.technifutur.java2020.sudoku.sudoku9x9;

public class Sudoku9x9Modele {

    private char[][] grille = new char[9][9];

    public void setValue (char value, int line, int column) {

        grille[line-1][column-1] = value;

    }

    public char getValue(int line, int column){

        return grille[line][column];

    }

    public static void main(String[] args) {

        Sudoku9x9Modele model = new Sudoku9x9Modele();

        model.setValue('4',1 ,1);
        char val = model.getValue(1, 1);

        System.out.println(val);

    }

}
