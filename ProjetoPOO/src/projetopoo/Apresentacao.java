package projetopoo;

public class Apresentacao implements Show{
    //ATRIBUTOS
    private String local;
    private Plateia plateia;
    private int espectadores;
    
    //CONSTRUTOR
    public Apresentacao(String local, Plateia plateia, int espectadores) {
        this.local = local;
        this.plateia = plateia;
        this.espectadores = espectadores;
    }
    
    //GETTERS E SETTERS
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Plateia getPlateia() {
        return plateia;
    }

    public void setPlateia(Plateia plateia) {
        this.plateia = plateia;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }
    
    //METODOS ABSTRATOS
    @Override
    public void status() {
        System.out.println("Local: "+this.getLocal());
        System.out.println("Plateia: "+this.getPlateia().getTipo());
        System.out.println("Espectadores: "+this.getEspectadores());
    }
    
    @Override
    public void iniciar(Comediante artista) {
        this.status();
        artista.apresentar();
        this.encerrar(artista);
    }
    
    @Override
    public void encerrar(Comediante artista) {
        this.getPlateia().reagir(artista);
    }
    
    @Override
    public void iniciar(Musico artista) {
        this.status();
        artista.apresentar();
        this.encerrar(artista);
    }
    
    @Override
    public void encerrar(Musico artista) {
        System.out.println("O show acabou.");
    }
}
