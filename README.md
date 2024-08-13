# ProjetoPOO
- TSI-3AN -

Nome: Carlos Eduardo Ivankio Franco
Projeto: Começou como um projeto envolvendo o tema "piadas" para aula de POO, no entanto para atender os requisitos pedidos foi expandido para um projeto de criação de shows, podendo ser ou um standUp ou um show de música.

* Os arquivos criados estão em ProjetoPOO/src/projetopoo
* O arquivo "main" que executa é ProjetoPOO.java

1. Classes e Objetos

Temos as classes:
- Apresentacao na qual é definido o local da apresentação, a plateia e a quantidade de espectadores como atributos, os metodos especiais, contrutor, getters e setters, um metodo de status para mostrar os valores de seus atributos, um metodo de iniciar para realizar o show e um metodo de encerrar para mostrar o encerramento do show.
- Comediante, tem como atributos um array de strings que armazena as piadas desse comediante, o atributos ofensiva e adulto para classificar o tipo de piada que esse comediante conta e o atributo piadas como um array de objetos da classe Piadas para puxar todas piadas que foram registradas, tem seus metodos especiais e de status, bem como um metodo apresentar, que faz com que o comediante realize a apresentação.
- Musico, apenas possui o atributo de estilos, que armazena os estilos musicais que o musico toca, e seus metodos seguem o mesmo príncipio do comediante, metodos especiais, metodo de status e um metodos para se apresentar.
- Piada, seus atributos são, piada que guarda a piada em si, tamanho que categoriza como piada curta, media ou longa, categoria que armazena a categoria da piada, ofensiva e adulto são atributos do tipo booleano para definir o tipo de publico que será adequado a piada e contada é um atributo para saber se essa piada ja foi ou não contada.
- Plateia, possui os atributos de tipo, para qual tipo de plateia é, por exemplo:"Familia, Amigos, Cologa de Trabalho", idade para definir qual a idade media dessa plateia e um atributo booleano chamado religioso para saber se a plateia é religiosa ou não.
- Pessoa é a classe abstrata usada para que as classes de Musico e Comediante possam herdar seus atributos e metodos, os atributos são nome, idade e sexo, e os metodos envelhecer e morrer.

Objetos: A fim de testes foram criados dois objetos da classes Piada, Comediante, Musico e Plateia e um objeto para a apresentação, temos..
- Piadas, uma de humor negro ofensiva para que o público religioso não aprove e uma que é um trocadilho podendo ser contada a qualquer um.
- Comediantes, João que conta qualquer piada, nesse caso contará a de humor negro, e Natali que não conta piadas adultas nem ofensivas, que contara o trocadilho.
- Musicos, Geremias que toca Rock ou Metal, e Iris que toca Jazz ou Pagode
- Plateias, temos os Bebados que aceitam piadas adultas e ofensivas(qualquer piada no caso), e os Cristaos com idade de 30 anos que não aprovam piadas ofensivas.
- Apresentação, aqui se define onde sera a apresentação, quem sera a plateia e qual sera a quantidade de espectadores.

2. Encapsulamento

Todos atributos são privados e podem apenas ser acessados usando metodos públicos, sejam esses principalmente os getters e setters.

3. Herança

As classes Musico e Comediante extendem Pesssoa, ou seja, herdam seus atributos e metodos, de forma onde se entenda que ambos "Musicos" ou "Comediantes" são "Pessoas" e compartilham suas caracteristicas, todos por exemplo tem um nome e idade.

4. Polimorfismo

Ambos Comediante e Musico usam a interface de artista, porém quando se chama o metodo de apresentar ele usa sobrescrita para que se adpte a qual tipo de artista está usando, o metodo pode servir para fazer um standUP ou um show de música dependendo de qual classe o chame.

5. Sobrecarga e Sobrescrita de Métodos

A classe de apresentação usa sobrecarga para que o mesmo metodo iniciar e encerrar funcione de forma diferente dependendo se quem se apresentou foi um comediante ou um musico, o metodo baseado no comediante é mais elaborado e esboça a reação da plateia baseado em seu gosto e no que foi apresentado, já o metodo quando passado um musico apenas executa o show dele.

6. Classes Abstratas e Interfaces

Todas as classes receberam uma interface baseada em suas peculiaridades e especificando metodos que as classes deveriam implementear.
Foi criada a classe abstrada de Pessoa apenas para que possam ser geradas subclasses herdando seus atributos e metodos, a classe abstrata em si não pode ser instancida.

7. Coleções

A classe Comediante fez uso da coleção de arrays para idenficar dentro um array de piadas quais se encaixavam com o genero do comediante, assim montando seu repertório.

8. Manipulação de Arquivos

9. Exceções

Não devidamente implentado, no máximo pode ser visto no método morrer da classe abstrata Pessoa, o qual não foi implementado.
