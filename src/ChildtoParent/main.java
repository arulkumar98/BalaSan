package ChildtoParent;

public class main {
    public static void main(String[] args) {

        Child ch = new Child();
        Parent par = ch;
        par.print();

    }
}