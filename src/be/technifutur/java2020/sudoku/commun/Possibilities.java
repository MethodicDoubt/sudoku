package be.technifutur.java2020.sudoku.commun;

public class Possibilities {

    private int data;

    Possibilities (int data) {

        this.data = data;

    }

    public boolean add (int val){

        boolean change = false;

        if (Integer.toBinaryString(data).charAt(val) == '0'){

            this.data = data | (1 << val);

            return change = true;

        }else {

            return change = false;

        }

    }

    public boolean remove (int val){

        boolean change = false;
        String dataBinary = Integer.toBinaryString(data);

        if (dataBinary.charAt(val) == '1'){

            this.data = data & (~(1 << val-1));

            return change = true;

        }else {

            return change = false;

        }

    }

    public boolean contains (int val){

        boolean contient = false;

        if (data >> val == 0){

            return contient = false;

        }else {

            return contient = true;

        }

    }

    public int size (){

        int taille;

        taille = Integer.bitCount(data);

        return taille;

    }

    public static void main(String[] args) {



    }

}
