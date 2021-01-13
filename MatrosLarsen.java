package com.company;

public class MatrosLarsen extends Men {
    public MatrosLarsen(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Матрос Ларсен";
    }

    public void SeeLine(String firstsee, String ahead, String line){
        System.out.println(firstsee+ahead+line+this.toString());
    }

    public void Scream(String vse, String rush, String illum) {
        System.out.println(this.toString() + " так завопил, что "+vse+rush+illum);
    }

    public void FirstToSee() {
        System.out.println(this.toString() + " первым увидел убчатую линию таинственных кратеров и вершин");
    }
}