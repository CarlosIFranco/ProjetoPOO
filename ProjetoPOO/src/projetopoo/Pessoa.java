package projetopoo;

public abstract class Pessoa implements Humano{
    //ATRIBUTOS
    protected String nome;
    protected int idade;
    protected String sexo;

    //CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //METODOS ABSTRATOS
    @Override
    public void envelhecer() {
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public void morrer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
