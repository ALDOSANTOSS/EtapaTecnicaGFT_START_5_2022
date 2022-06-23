package Exercicio04;

public class Carro {

    String modelo;
    String marca;

    String tipoCombubtivel;

    Carro(){

    }

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void exebirCarro(){
        System.out.println("Moledo" + this.modelo);
        System.out.println("Marca" + this.marca);
        System.out.println("Combustivel" +this.tipoCombubtivel);


    }
}
