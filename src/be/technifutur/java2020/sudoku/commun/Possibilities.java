package be.technifutur.java2020.sudoku.commun;

public class Possibilities {

    private int data;

    Possibilities (int data) {

        this.data = data;

    }

    public boolean add (int val){

        boolean change = false;

        if (!contains(val)){

            this.data = data | (1 << val-1);

            change = true;

        }else {

            change = false;

        }

        return change;

    }

    public boolean remove (int val){

        boolean change = false;

        if (contains(val)){

            this.data = data & (~(1 << val-1));

            change = true;

        }else {

            change = false;

        }

        return change;

    }

    public boolean contains (int val){

        boolean contient = false;

        if (data >> val-1 == 0){

            contient = false;

        }else {

            contient = true;

        }

        return contient;

    }

    public int size (){

        int taille;

        taille = Integer.bitCount(data);

        return taille;

    }

    public static void main(String[] args) {



    }

}
