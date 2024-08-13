package projetopoo;

public class Piada implements Frase
{
    //ATRIBUTOS
    private String piada;
    private String tamanho;
    private String categoria;
    private boolean ofensiva;
    private boolean adulto;
    private boolean contada;

    //CONTRUTOR
    public Piada(String piada, String categoria, boolean ofensiva, boolean adulto) {
        this.setPiada(piada);
        this.categoria = categoria;
        this.ofensiva = ofensiva;
        this.adulto = adulto;
        this.contada = false;
    }
    
    //GETTERS E SETTERS
    public String getPiada() {
        return piada;
    }

    public void setPiada(String piada) {
        this.piada = piada;
        setTamanho();
    }

    public String getTamanho() {
        return tamanho;
    }

    private void setTamanho(){
        if(this.piada.length() <= 200)
        {
            this.tamanho = "Curta";
        }
        else if(this.piada.length() <= 400)
        {
            this.tamanho = "Media";
        }
        else
        {
            this.tamanho = "Longa";
        }
    }

           
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public boolean isContada() {
        return contada;
    }

    public void setContada(boolean contada) {
        this.contada = contada;
    }
    
    //METODOS ABSTRATOS
    @Override
    public void status()
    {
        System.out.println("Piada:\n\n"+this.getPiada());
        System.out.println("\nTamanho: "+this.getTamanho());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Ofensiva: "+this.isOfensiva());
        System.out.println("Adulto: "+this.isAdulto());
        System.out.println("Contada: "+this.isContada());
    }
    
    @Override
    public void contar()
    {
        System.out.println(this.getPiada());
        this.setContada(true);
    }
    
    @Override
    public void contarNova()
    {
        if(this.isContada())
        {
            System.out.println("Essa piada ja foi contada");
        }
        else
        {
            this.contar();
        }
    }
}