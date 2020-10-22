package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.Sudoku;

import java.awt.*;

public class Sudoku4x4Vue {

    Sudoku4x4Modele modele;
    private String grilleVide = "" +
            "+-----+-----+\n" +
            "| . . | . . |\n" +
            "| . . | . . |\n" +
            "+-----+-----+\n" +
            "| . . | . . |\n" +
            "| . . | . . |\n" +
            "+-----+-----+\n";

    public Sudoku4x4Vue(){

        grilleVide = grilleVide.replace(".", "%s");

    }


    public void setModele(Sudoku4x4Modele modele) {

        this.modele = modele;

    }

    public void afficherGrilleVIde(){

        internalAfficheGrille(new Sudoku4x4Modele());

    }

    public void afficherGrille(Sudoku4x4Modele modele){

        internalAfficheGrille(modele);

    }

    private void internalAfficheGrille(Sudoku4x4Modele modele) {

        Character[] tabValue = new Character[4*4];

        for (int line = 0; line < 4; line++) {

            for (int column = 0; column < 4; column++) {

                char value = modele.getValue(line, column);

                if(value == 0){

                    tabValue[line * 4 + column] = '.';

                }else {

                    tabValue[line * 4 + column] = value;

                }

            }

        }

        System.out.printf(this.grilleVide, tabValue);

    }

    public static void main(String[] args) {

        Sudoku4x4Vue vue = new Sudoku4x4Vue();
        Sudoku4x4Modele modele = new Sudoku4x4Modele();

        vue.setModele(modele);

        modele.setValue('2', 1, 1);
        // vue.afficherGrilleVIde();
        vue.afficherGrille(modele);

    }

}
