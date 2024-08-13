package projetopoo;

import java.util.Random;

public class Musico extends Pessoa implements Artista{
    //ATRIBUTOS
    String estilos[];
    
    //CONSTRUTOR
    public Musico(String nome, int idade, String sexo, String estilos[]) {
        super(nome, idade, sexo);
        this.estilos = estilos;
    }
    
    //GETTERS E SETTERS
    public String[] getEstilos() {
        return estilos;
    }

    public void setEstilos(String[] estilos) {
        this.estilos = estilos;
    }
    
    
    //METODOS ABSTRATOS
    @Override
    public void status() {
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Estilos: "+String.join(", ", this.getEstilos()));
    }
    
    @Override
    public void apresentar() {
        Random random = new Random();
        int randomMusica = random.nextInt(this.estilos.length);
        System.out.println(this.getNome()+" esta tocando "+ this.estilos[randomMusica]);
    }
    
}
