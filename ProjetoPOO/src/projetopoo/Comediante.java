package projetopoo;

import java.util.Arrays;
import java.util.Random;

public class Comediante extends Pessoa implements Artista{
    //ATRIBUTOS
    private String repertorio[];
    private boolean ofensiva;
    private boolean adulto;
    private Piada piadas[];
    
    //CONSTRUTOR
    public Comediante(String nome, int idade, String sexo, String repertorio[], boolean ofensiva, boolean adulto, Piada piadas[]) {
        super(nome, idade, sexo);
        this.repertorio = repertorio;
        this.ofensiva = ofensiva;
        this.adulto = adulto;
        this.piadas = piadas;
    }
    
    //GETTERS E SETTERS
    public String[] getRepertorio() {
        return repertorio;
    }

    public void setRepertorio(String repertorio[]) {
        this.repertorio = repertorio;
    }

    public boolean isOfensiva() {
        return ofensiva;
    }

    public void setOfensiva(boolean ofensiva) {
        this.ofensiva = ofensiva;
    }

    public boolean isAdulto() {
        return adulto;
    }

    public void setAdulto(boolean adulto) {
        this.adulto = adulto;
    }
    
    public Piada[] getPiadas() {
        return piadas;
    }

    public void setPiadas(Piada piadas[]) {
        this.piadas = piadas;
    }
    
    //METODOS ABSTRATOS
    @Override
    public void status() {
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Repertorio: "+String.join(", ", this.getRepertorio()));
        System.out.println("Ofensiva: "+this.isOfensiva());
        System.out.println("Adulto: "+this.isAdulto());
    }
    
    @Override
    public void apresentar() {
        Random random = new Random();
        int randomPiada;
        boolean fazParte;
        Piada piada;
        do
        {
            randomPiada = random.nextInt(this.piadas.length);
            piada = piadas[randomPiada];
            final String categoria = piada.getCategoria();
            fazParte = Arrays.stream(this.getRepertorio()).anyMatch(elemento -> elemento.equals(categoria));
        }while(piada.isContada() || !fazParte);
        piada.contar();
    }
}
