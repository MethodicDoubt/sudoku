package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.sudoku9x9.InputSudoku9x9;

import java.util.Scanner;

public class Controler9x9 {

    private Sudoku9x9Modele modele;
    private Sudoku9x9Vue vue;

    public Controler9x9(Sudoku9x9Modele modele, Sudoku9x9Vue vue) {

        this.modele = modele;
        this.vue = vue;

    }


    public InputSudoku9x9 saisieUser(){

        Scanner input = new Scanner(System.in); //Création du scanner

        System.out.println("Entrez un chiffre dans la grille sous la forme de : valeur.ligne.colonne");

        String userEntry = input.nextLine(); //Récupération de l'entrée de l'utilsateur et stockage dans un objet string (objet pour pouvoir effectuer des méthodes de la classe String sur l'entrée)

        return new InputSudoku9x9(userEntry); //Création de l'objet inputSudoku4X4 qui test les valeurs entrées de sorte qu'elles soient conformes

    }


    public void inputControl(){

        InputSudoku9x9 testInput = saisieUser();

        while (!testInput.isOut()){

            if (testInput.isValid()){

                modele.setValue(testInput.getValue(), testInput.getLine(), testInput.getCol());
                vue.afficherGrille(modele);

            }else {

                System.out.println("Valeurs non conformes, entrez de nouvelles valeurs");

            }

            testInput = saisieUser();

        }

    }


    public static void main(String[] args) {

        Controler9x9 controler1 = new Controler9x9(new Sudoku9x9Modele(), new Sudoku9x9Vue());

        controler1.inputControl();

    }

}

//InputControl :  - Affiche le sudoku
// - Demande une entrée
// - Il crée un inputSudoku4X4
// - Si le inputSudoku4X4 IsValid -> on boucle (q fait parti du valide -> out à vrai -> arrêt boucle)
// - Si il est pas valide, on redemande une nouvelle valeur
