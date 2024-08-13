package projetopoo;

public class Plateia implements Publico
{
    //ATRIBUTOS
    private String tipo;
    private int idade;
    private boolean religioso;
    
    //CONSTRUTOS
    public Plateia(String tipo, int idade, boolean religioso) {
        this.tipo = tipo;
        this.idade = idade;
        this.religioso = religioso;
    }
    
    //GETTERS E SETTERS
    public String getTipo() {    
        return tipo;
        
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getIdade() {    
        return idade;
        
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isReligioso() {
        return religioso;
    }

    public void setReligioso(boolean religioso) {    
       this.religioso = religioso;
    }

    //METODOS ABSTRATOS
    @Override
    public void status() {
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Religioso: "+this.isReligioso());
    }

    @Override
    public void reagir(Comediante comediante) {
        if((comediante.isAdulto() && this.getIdade() < 18) || (comediante.isOfensiva() && this.isReligioso()))
        {
            this.vaiar();
        }
        else
        {
            this.aplaudir();
        }
    }

    @Override
    public void vaiar() {
        System.out.println("A plateia esta vaiando o comediante, esse show foi um desastre :(");
    }

    @Override
    public void aplaudir() {
        System.out.println("A plateia esta aplaudindo o comediante, esse show foi um sucesso :)");
    }
} 