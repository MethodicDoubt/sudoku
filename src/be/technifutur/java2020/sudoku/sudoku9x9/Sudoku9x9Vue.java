package be.technifutur.java2020.sudoku.sudoku9x9;

public class Sudoku9x9Vue {

    Sudoku9x9Modele modele;
    private String grilleVide = "" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" ;

    public Sudoku9x9Vue(){

        grilleVide = grilleVide.replace(".", "%s");

    }


    public void setModele(Sudoku9x9Modele modele) {

        this.modele = modele;

    }

    public void afficherGrilleVIde(){

        internalAfficheGrille(new Sudoku9x9Modele());

    }

    public void afficherGrille(Sudoku9x9Modele modele){

        internalAfficheGrille(modele);

    }

    private void internalAfficheGrille(Sudoku9x9Modele modele) {

        Character[] tabValue = new Character[9*9];

        for (int line = 0; line < 9; line++) {

            for (int column = 0; column < 9; column++) {

                char value = modele.getValue(line, column);

                if(value == 0){

                    tabValue[line * 9 + column] = '.';

                }else {

                    tabValue[line * 9 + column] = value;

                }

            }

        }

        System.out.printf(this.grilleVide, tabValue);

    }

    public static void main(String[] args) {

        Sudoku9x9Vue vue = new Sudoku9x9Vue();
        Sudoku9x9Modele modele = new Sudoku9x9Modele();

        vue.setModele(modele);

        modele.setValue('2', 1, 1);
        // vue.afficherGrilleVIde();
        vue.afficherGrille(modele);

    }

}
