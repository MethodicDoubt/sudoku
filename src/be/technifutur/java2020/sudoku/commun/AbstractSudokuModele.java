package be.technifutur.java2020.sudoku.commun;

import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9Modele;

public abstract class AbstractSudokuModele {

    public static final char EMPTY = 0;

    private char[][] grille;

    protected AbstractSudokuModele(int nbLigne, int nbColone) {

        grille = new char[nbLigne][nbColone];

    }

    public void setValue (char value, int line, int column) {

        grille[line-1][column-1] = value;

    }

    public char getValue(int line, int column){

        return grille[line][column];

    }

    public void removeValue(int line, int column) {

        if(isPositionValid(line, column)) {

            grille[line][column] = EMPTY;

        }

    }

    public static void main(String[] args) {

        Sudoku9x9Modele model = new Sudoku9x9Modele();

        model.setValue('4',1 ,1);
        char val = model.getValue(1, 1);

        System.out.println(val);

    }

}


}
