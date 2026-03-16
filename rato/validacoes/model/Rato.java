package model;

public class Rato {

    private String nome;
    private String especie;
    private String idade;

    public Rato (String nome, String especie, int idade){
      this.nome = nome;
      this.especie = especie;
      this.idade = idade;
    }

    public Rato (){
        this.nome = "Pucca";
        this.especie = "Russo Chinês";
        this.idade = "1"
    }

    public void emitirsom(){
        System.out.printIn(x: "Guincho");
    }
    public String getnome (){
        return nome;
    }

    public String getespecie (){
        return especie;
    }

    public int getidade (){
        return idade;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public void setespecie(String especie){
        this.especie = especie;
    }

    public void setidade(String idade){
        this.idade = idade;
    }

    @Override
    public String ToString(){
        return 
        "Rato [nome =" + nome +
        "especie=" + especie +
        "idade=" + idade + "]";
    }

}

