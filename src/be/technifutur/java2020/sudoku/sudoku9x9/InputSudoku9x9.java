package be.technifutur.java2020.sudoku.sudoku9x9;

public class InputSudoku9x9 {

    private char value;
    private int line;
    private int col;
    private boolean valid;
    private boolean out; //Caractère de fin de traitement

    public InputSudoku9x9(String input){

        if(input.matches("([1-9]\\.[1-9]\\.[1-9])|(q|Q)")){

            this.valid = true;

            if(input.equalsIgnoreCase("q")){

                this.out = true;

            }else {

                this.value = input.charAt(0);                               //Lecture du caractère en position 0 du string input
                this.line = Character.getNumericValue(input.charAt(2));     //Lecture et transformation en int du caractère en postion 2
                this.col = Character.getNumericValue(input.charAt(4));      //Lecture et transformation en int du cractère en position 4

            }

        }

    }

    public char getValue() {

        return value;

    }

    public int getLine() {

        return line;

    }

    public int getCol() {

        return col;

    }

    public boolean isValid() {

        return valid;

    }

    public boolean isOut() {

        return out;

    }
}

//Si l'entrée est valide