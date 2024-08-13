package projetopoo;

public class ProjetoPOO
{
    public static void main(String[] args)
    {
        Piada piada[] = new Piada[2];
        Comediante comediante[] = new Comediante[2];
        Musico musico[] = new Musico[2];
        Plateia plateia[] = new Plateia[2];
        Apresentacao apresentacao;
        piada[0] = new Piada
        (
                "Sabe por que a torre de pisa eh inclinada?\n...\nPorque ela tem reflexos melhores do que os das torres gemeas.",
                "Humor Negro",
                true,
                false
        );
        piada[1] = new Piada
        (
                "Um bebado eh abordado na rua por uma senhora que segura uma Biblia:\n" +
                "\n" +
                "Senhora: O senhor quer ser testemunha de Jeova?\n" +
                "\n" +
                "Bebado: Por que? Ele esta sendo processado?",
                "Tio",
                false,
                false
        );
        comediante[0] = new Comediante
        (
                "Joao",
                20,
                "Homem",
                new String[]{"Humor Negro","Nerd"},
                true,
                true,
                piada
        );
        comediante[1] = new Comediante
        (
                "Natali",
                20,
                "Mulher",
                new String[]{"Crente","Tio"},
                false,
                false,
                piada
        );
        musico[0] = new Musico
        (
                "Geremias",
                18,
                "Homem",
                new String[]{"Rock","Metal"}
        );
        musico[1] = new Musico
        (
                "Iris",
                35,
                "Mulher",
                new String[]{"Jazz","Pagode"}
        );
        plateia[0] = new Plateia
        (
                "Bebados",
                50,
                false
        );
        plateia[1] = new Plateia
        (
                "Cristaos",
                30,
                true
        );
        apresentacao = new Apresentacao
        (
                "Barzinho",
                plateia[0],
                40
        );
        //apresentacao.iniciar(comediante[1]);
        apresentacao.iniciar(musico[0]);
    }
}
