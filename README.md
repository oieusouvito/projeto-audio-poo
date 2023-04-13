# Projeto de exemplo de classe de áudio
Este é um projeto simples que contém algumas classes que representam tipos diferentes de arquivos de áudio e uma classe que os gerencia. O objetivo é demonstrar a implementação de algumas funcionalidades comuns, como contagem de reproduções, curtidas e classificação.

# Classe Audio
A classe Audio representa um arquivo de áudio genérico e contém as seguintes propriedades:

* titulo: o título do arquivo de áudio.
* totalDeReproducoes: a quantidade de vezes que o arquivo de áudio foi reproduzido.
* totalDeCurtidas: a quantidade de curtidas que o arquivo de áudio recebeu.
* classificacao: a classificação do arquivo de áudio.
A classe também contém dois métodos, curtir() e reproduzir(), que incrementam as propriedades totalDeCurtidas e totalDeReproducoes, respectivamente.

# Classe Podcast
A classe Podcast é uma subclasse de Audio e representa um arquivo de áudio que é um podcast. Ela adiciona as seguintes propriedades:

* host: o nome do host do podcast.
* descricao: uma descrição do podcast.
* A classe também sobrescreve o método getClassificacao() para fornecer uma classificação com base na quantidade de curtidas que o podcast recebeu.

# Classe Musica
A classe Musica é uma subclasse de Audio e representa um arquivo de áudio que é uma música. Ela adiciona as seguintes propriedades:

* album: o nome do álbum em que a música está.
* artista: o nome do artista que toca a música.
* genero: o gênero da música.
A classe também sobrescreve o método getClassificacao() para fornecer uma classificação com base na quantidade de curtidas que a música recebeu.

# Classe MinhasPreferidas
A classe MinhasPreferidas gerencia uma lista de arquivos de áudio e os classifica com base em sua classificação. Ela contém um único método, inclui(), que recebe um arquivo de áudio e imprime uma mensagem de acordo com sua classificação.

# Classe Principal
A classe Principal contém o método main() e demonstra o uso das classes anteriores. Ela cria uma instância de Musica e uma instância de Podcast, reproduz e curte cada uma várias vezes e, em seguida, as adiciona à instância de MinhasPreferidas. Por fim, ela imprime algumas informações sobre cada arquivo de áudio e as classifica usando a instância de MinhasPreferidas.
