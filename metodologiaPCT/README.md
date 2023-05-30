  # Zaion Felippe Gomes Arruda
  
  ## Introdução
  
  Olá, seja bem vindo! Sou o Zaion Felippe, estudante de Banco de dados pela FATEC Prof. Jessen Vidal. 
  
  Tenho 19 anos e trabalho como Assistente de Projetos e Logística. <br/>
  
  <img src="https://avatars.githubusercontent.com/u/81268185?v=4" height="150" width="150"/>
  
  ### Meus principais conhecimentos
  
  ### Python
  
  Python é a linguagem de programação que eu mais tenho conhecimento, fiz vários projetos utilizando alguns frameworks como o Flask, Django, Pandas entre outros.
  Atualmente trabalho com essa linguagem e com isso tenho uma segurança para desenvolver soluções e inovações.
  
  ### VBA 
  
  VBA foi a primeira linguagem que estudei, ainda antes da graduação. Mesmo nunca tendo atuado profissionalmente com VBA, realizei diversos projetos pessoais
  e isso me ajudou na minha carreira pessoal. É uma linguagem que me sinto confortavél em desenvolver qualquer coisa
  
  <details>
  
  <summary>Projeto 1</summary>
  
  # Projeto 1: 1º Semestre de 2021
  
  ### Parceiro Acadêmico
  FATEC São José dos Campos - Prof. Jessen Vidal
  
  ### Descrição do Projeto
  
Este projeto tem como objetivo criar um assistente virtual financeiro para ajudar pessoas a gerenciar melhor suas finanças pessoais. O assistente virtual será capaz de se comunicar com o usuário por meio de comandos de voz ou texto, e terá acesso a informações financeiras do usuário, como contas bancárias, cartões de crédito e investimentos.
  
  ### Tecnologias adotadas na solução
  ### <img src="https://github.com/devicons/devicon/blob/master/icons/python/python-original.svg" width="40" height="40"/> Python 
  Neste projeto de assistente virtual financeiro, a tecnologia Python foi utilizada como linguagem de programação para a criação do software. Python é uma linguagem de programação de alto nível, com sintaxe simples e de fácil leitura, que é amplamente utilizada no desenvolvimento de soluções tecnológicas. É uma escolha popular para desenvolvimento de assistentes virtuais, pois tem uma grande variedade de bibliotecas disponíveis para processamento de linguagem natural, reconhecimento de voz, acesso a APIs de serviços financeiros, dentre outras funcionalidades.
  
  ### Contribuições Pessoais
  
Minhas contribuições para este projeto pode ajudar os usuários a tomar decisões informadas sobre finanças pessoais e investimentos, tornando esses assuntos mais acessíveis e compreensíveis para todos.

<details>
	
<summary>Descobrindo seu perfil</summary>

```py

def perfil():
    result = 0
    sai_som('Você já fez sua reserva de emergência? ')
    p1 = str(input('')).upper()

    sai_som('Aceitaria riscos para maximizar ganhos? ')
    p2 = str(input('')).upper()

    sai_som('Tem a meta de guardar dinheiro para um futuro a longo prazo, como aposentadoria? ')
    p3 = str(input('')).upper()

    sai_som('Você tem experiência ou formação no mercado financeiro? ')
    p4 = str(input('')).upper()

    sai_som('Você já investe ou investiu nos últimos meses? ')
    p5 = str(input('')).upper()

    sai_som('Você conseguiria destinar de 10% a 15% do seu salario a investimentos? ')
    p6 = str(input('')).upper()
	
    #bloco de condição -> atribuir link do código completo
	
    if result <8:
        sai_som(f'Você é um investidor Iniciante pois sua pontuação foi de {result} pontos!')
    if result >= 8 and result <10:
        sai_som(f'Você é um investidor Pleno pois sua pontuação foi de {result} pontos!')
    if result >= 10:
        sai_som(f'Você é um investidor Experiente pois sua pontuação foi de {result} pontos!')

 ```
 
Esse é um código consiste em uma função chamada perfil(). Ela tem como objetivo realizar uma espécie de "questionário" para determinar o perfil do investidor, a partir de algumas perguntas relacionadas ao comportamento financeiro e ao conhecimento em investimentos.
As perguntas são feitas por meio de uma mensagem sonora, seguida de uma pergunta apresentada na tela, onde o usuário deve responder digitando "sim" ou "não". As respostas são armazenadas em variáveis, que são avaliadas em um bloco de decisão condicional.
Cada resposta "sim" adiciona 2 pontos à pontuação total, enquanto cada resposta "não" adiciona apenas 1 ponto. Depois de avaliar todas as respostas, o código determina o perfil do investidor com base na pontuação total.
Se a pontuação for menor que 8, o investidor é classificado como "Iniciante". Se a pontuação estiver entre 8 e 9, o investidor é classificado como "Pleno". Se a pontuação for maior ou igual a 10, o investidor é classificado como "Experiente".
        
</details>

<details>

<summary>Buscando código de ação</summary>

  ```py
	def codigo():
	    sai_som('De qual empresa deseja saber o código de ação? ')
	    cod_acao = str(input('')).upper()

	    #Imprimi o valor e printa o código de ação
	    if cod_acao == ('NETFLIX'):
		sai_som('O código de ação dessa empresa é: NFLX34')

	    elif cod_acao == ('ITAU'):
		sai_som('O código de ação dessa empresa é: ITUB3F')

	    elif cod_acao == ('VALE'):
		sai_som('O código de ação dessa empresa é: VALE5')

	    elif cod_acao == ('PETROBRAS'):
		sai_som('O código de ação dessa empresa é: PETR4F')

	    elif cod_acao == ('FACEBOOK'):
		sai_som('O código de ação dessa empresa é: FB')
	
  ```
  
Este código contém uma função chamada codigo(), que solicita ao usuário o nome da empresa da qual ele deseja obter o código de ação. Em seguida, é feita uma verificação condicional para determinar qual é a empresa selecionada e, em seguida, é exibido o código de ação correspondente.
Cada if é verificado em ordem e, se uma correspondência for encontrada, o código correspondente é exibido e nenhum outro if será verificado.
É importante notar que o código pressupõe que o usuário digitará o nome da empresa corretamente, sem erros de digitação ou grafia. Se o usuário digitar o nome da empresa de maneira diferente do que foi previsto, o código não será capaz de reconhecer e retornar o código de ação correto.

</details>

<details>

<summary>Notícias</summary>

```py

from config import sai_som
import requests
from bs4 import BeautifulSoup
#Site utilizado: https://www.infomoney.com.br/ (Podendo haver expansão)
response = requests.get('https://www.infomoney.com.br/')
conteudo = response.content
site = BeautifulSoup(conteudo, 'html.parser')

#Html da notícia
noticias = site.find('div', attrs={'class': 'col-12 col-lg-6'})
noticias2 = site.find('div', attrs={'class': 'col-12 col-lg-6 px-0 px-lg-3 mb-3 mb-lg-0'})

def informacoes():
    #Notícia 1:
    atributo1 = noticias.find('div', attrs={'class': 'row m-0 border-t-mobile py-3 py-lg-0 pb-lg-3'})
    titulo1 = atributo1.find('span', attrs={'class': 'hl-title hl-title-4'})
    resposta1 = titulo1.text
    sai_som(resposta1)
    print()

     #Notícia 2
    atributo2 = noticias.find('div', attrs={'class': 'row m-0 py-3 border-t'})
    titulo2 = atributo2.find('span', attrs={'class': 'hl-title hl-title-4'})
    resposta2 = titulo2.text
    sai_som(resposta2 )
    print()
    
   #Mais notícias -> atribuir link do código completo

```

Esse código é responsável por extrair notícias do site InfoMoney e reproduzir em voz alta utilizando a função sai_som que está definida no arquivo config.py.
O código utiliza a biblioteca requests para fazer uma requisição ao site e obter o seu conteúdo, que é armazenado na variável conteudo. Em seguida, utiliza a biblioteca BeautifulSoup para "parsear" o conteúdo HTML e extrair as informações desejadas.
As notícias são representadas no código pelos atributos noticias e noticias2, que correspondem aos dois blocos de notícias que aparecem na página inicial do InfoMoney. Para cada notícia, o código utiliza o método find do objeto BeautifulSoup para encontrar o elemento HTML que contém o título da notícia, e em seguida extrai o texto do título usando o atributo text.
O código então chama a função sai_som para reproduzir o título da notícia em voz alta, e em seguida imprime uma linha vazia. O processo é repetido para as quatro notícias que o código está configurado para extrair.

</details>
  
## Aprendizados Efetivos HS
- Introdução às APIs: 	
	
	Definição de API (Interface de Programação de Aplicativos)
	Importância das APIs para a construção de software e aplicações
	Facilidade de integração entre diferentes sistemas e plataformas

- Desenvolvimento em Python com APIs:
	
	Utilização de bibliotecas Python, como requests e urllib
	Requisições HTTP às APIs e processamento de respostas
	Extração de informações relevantes dos dados retornados pelas APIs
	
- Exemplos de APIs na web:
	
	APIs de serviços financeiros para acessar cotações de ações e índices
	APIs de serviços de redes sociais para interagir com plataformas sociais
	Outras APIs disponíveis para integração com diferentes serviços

- Benefícios da integração com serviços externos:
	
	Desenvolvimento de soluções tecnológicas complexas de maneira simplificada
	Acesso a informações atualizadas e relevantes de serviços externos
	Incorporação de dados de serviços externos para fornecer recomendações personalizadas

- A importância do conhecimento em Python e APIs:
	
	Habilidade valiosa para qualquer desenvolvedor
	Combinação poderosa para o desenvolvimento de soluções eficientes e inovadoras

</details>

<details>

<summary>Projeto 2</summary>

  # Projeto 2: 2º Semestre de 2021
  
  ### Parceiro Acadêmico
  Necto Systems
  
   ### Descrição do Projeto
 A aplicação em questão tem como objetivo principal coletar métricas de um ou mais Sistemas Gerenciadores de Banco de Dados remotos, em intervalos regulares de tempo. Essas métricas incluem informações relevantes para o gerenciamento e manutenção desses sistemas, como por exemplo, uso de CPU, uso de memória, número de conexões, tempo de resposta, entre outras.

Ao coletar essas informações de forma periódica, a aplicação permite que o usuário tenha acesso a uma série histórica de dados, que pode ser utilizada para identificar padrões de uso, detectar problemas e avaliar o desempenho dos SGBDs ao longo do tempo. Com base nessas informações, o usuário poderá tomar decisões quanto à necessidade de manutenções, balanceamento e aumento de capacidade, bem como melhorias na infraestrutura (servidores), de forma a garantir a disponibilidade e a eficiência dos sistemas gerenciados pelo SGBD.

### Tecnologias adotadas na solução
### <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg" width="40" height="40"/> Java  
	
Java é uma linguagem de programação amplamente utilizada no desenvolvimento de aplicativos corporativos. Uma das suas principais vantagens é a portabilidade, ou seja, o código escrito em Java pode ser executado em diferentes plataformas sem a necessidade de adaptações significativas.

Na aplicação em questão, a escolha da linguagem Java pode ter sido motivada por várias razões. Uma delas é a sua ampla disponibilidade de bibliotecas e frameworks para o desenvolvimento de aplicativos de coleta de dados e análise de métricas, o que pode ter acelerado o processo de desenvolvimento da aplicação.
 
### <img src="https://github.com/devicons/devicon/blob/master/icons/postgresql/postgresql-original.svg" width="40" height="40"/> PostgreSQL
	
a tecnologia PostgreSQL foi utilizada como o sistema gerenciador de banco de dados para armazenar e gerenciar as métricas coletadas pelos servidores remotos. O PostgreSQL é uma opção popular e avançada de sistema de gerenciamento de banco de dados relacional de código aberto, que oferece recursos avançados, incluindo suporte a SQL avançado, extensibilidade, replicação, transações e integridade referencial.

 ### Contribuições Pessoais
Responsável por desenvolver consultas SQL que permitiu a exibir algumas métricas do banco de dados na aplicação. Esses itens foi identificado como um dos principais items do projeto, ou seja, uma necessidade importante a ser atendida para a efetividade da ferramenta.

Por meio de sua consultas, os usuários da aplicação puderam obter informações precisas sobre as  tabelas individualmente, permitindo uma melhor gestão do espaço em disco utilizado pelo sistema de gerenciamento de banco de dados.

<details>

<summary>Consulta para retornar o tamanhao do banco de dados</summary>
	
```Java

	public static void ExibirSelectTamanhoBanco(Connection con) {
		String sql = "SELECT pg_database.datname, pg_size_pretty(pg_database_size(pg_database.datname)) AS size FROM pg_database;";
		
		try {
			PreparedStatement pesquisa = con.prepareStatement(sql);
			ResultSet result = pesquisa.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString("datname") + " " + result.getString("size"));
			}
		}
		catch(Exception e) {
			
		}
	}
	
```
	
Esse código é outro método que também recebe como parâmetro uma conexão com um banco de dados PostgreSQL e exibe o tamanho do banco de dados em que a conexão está estabelecida, juntamente com o nome do banco.
Para isso, ele executa uma consulta SQL que seleciona o nome de cada banco de dados no servidor PostgreSQL e o tamanho de cada banco de dados em bytes. A função "pg_size_pretty" é usada para converter o tamanho em bytes para um formato mais legível, como KB, MB ou GB.
Em seguida, o código executa a consulta usando a conexão fornecida como parâmetro e itera sobre o resultado para exibir o nome e o tamanho de cada banco de dados em um formato legível. Ele imprime uma linha para cada banco de dados, contendo o nome do banco de dados e seu tamanho.
	
</details>
	
<details>
	
<summary>Integração JOptionPane no projeto</summary>

```java

public class TelaRegister extends JFrame {

	public TelaRegister() {
		// Configurações da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 500);
		
		// Painel principal
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Painel secundário
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 11, 360, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		// Labels e campos de texto
		JLabel lblNewLabel = new JLabel("PORTA:");
		// ...
		txfPor = new JTextField();
		// ...
		
		// Ícone
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaRegister.class.getResource("/img/necto.png")));
		lblNewLabel_1.setBounds(10, 282, 340, 146);
		panel.add(lblNewLabel_1);
		
		// Botão de submit
		JButton btnSub = new JButton("SUBMIT");
		// ...
	}
}

	
```
A classe TelaRegister define o conteúdo e o comportamento da janela de registro.	
O código define uma janela de registro com campos de entrada para informações de conexão (porta, banco de dados, usuário e senha) e um botão "SUBMIT" para enviar essas informações e iniciar uma conexão. Se a conexão for bem-sucedida, uma nova janela chamada Principal é aberta.
	
</details>
	
<details>

<summary>Configurando opções de métricas</summary>

```java

public class Principal extends JFrame {
    private JPanel contentPane;

    public Principal(LoginModel login) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 582, 424);
        
        // Criação da barra de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        // Menu "Métricas"
        JMenu mnMetricas = new JMenu("Métricas");
        menuBar.add(mnMetricas);
        
        // Item de menu "Tamanho dos Bancos"
        JMenuItem mntmTamanhoBancos = new JMenuItem("Tamanho dos Bancos");
        // ...
        mnMetricas.add(mntmTamanhoBancos);
        
        // Item de menu "Tamanho Tabelas"
        JMenuItem mntmTamanhoTabelas = new JMenuItem("Tamanho Tabelas");
        // ...
        mnMetricas.add(mntmTamanhoTabelas);
        
        // Item de menu "Instruções Chamadas Mais de 1000x"
        JMenuItem mntmInstrucoes1000x = new JMenuItem("Instruções Chamadas Mais de 1000x");
        // ...
        mnMetricas.add(mntmInstrucoes1000x);
        
        // Item de menu "Instruções Mais Demoradas"
        JMenuItem mntmInstrucoesMaisDemoradas = new JMenuItem("Instruções Mais Demoradas");
        // ...
        mnMetricas.add(mntmInstrucoesMaisDemoradas);
        
        // Item de menu "Instruções Mais Demoradas Em Média"
        JMenuItem mntmInstrucoesMaisDemoradasMedia = new JMenuItem("Instruções Mais Demoradas Em Média");
        // ...
        mnMetricas.add(mntmInstrucoesMaisDemoradasMedia);
        
        // Menu "Sair"
        JMenu mnSair = new JMenu("Sair");
        menuBar.add(mnSair);
        
        // Item de menu "Sair"
        JMenuItem mntmSair = new JMenuItem("Sair");
        // ...
        mnSair.add(mntmSair);
        
        // Painel de conteúdo
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
    }
}

	
```
	
A classe Principal representa a janela principal da aplicação, que possui um menu de métricas relacionadas ao banco de dados. O menu é composto por várias opções, como "Tamanho dos Bancos", "Tamanho Tabelas", "Instruções Chamadas Mais de 1000x", "Instruções Mais Demoradas" e "Instruções Mais Demoradas Em Média". Cada opção do menu é associada a um evento de clique que abre uma nova janela correspondente à métrica selecionada.
Quando uma opção de métrica é selecionada, a janela principal é fechada e substituída pela janela da métrica selecionada. Essa abordagem permite que o usuário navegue entre as diferentes métricas disponíveis na aplicação, cada uma com sua própria janela e funcionalidades específicas.
Essa estrutura de menu fornece uma maneira intuitiva para os usuários interagirem com as métricas do banco de dados, facilitando a análise e visualização dos dados relevantes.
	
</details>

## Aprendizados Efetivos HS

- Utilização de um Sistema de Gerenciamento de Banco de Dados (SGBD):
	
	Aprendi a utilizar um SGBD para coletar, armazenar e manipular informações.
	Tornei-me familiarizado com as funcionalidades oferecidas pelo SGBD.
	
- Manipulação de dados em ambiente de banco de dados:

	Desenvolvi habilidades na criação de consultas SQL para extrair informações específicas do banco de dados.
	Utilizei outros comandos, além de consultas, para manipular e transformar os dados conforme necessário.

- Conhecimento em ferramentas de gerenciamento de banco de dados:
	
	Adquiri experiência no uso de ferramentas de gerenciamento de banco de dados, como o PostgreSQL.
	Aprendi a utilizar essas ferramentas de forma efetiva para administrar e configurar o banco de dados.

- Desenvolvimento de consultas e rotinas:
	
	Contribuí para o desenvolvimento da aplicação criando consultas SQL e rotinas que permitiram a coleta de métricas importantes.
	Utilizei consultas SQL para obter informações relevantes, como o tamanho das tabelas e do banco de dados.

- Geração de séries históricas e métricas:
	
	Utilizei as habilidades em manipulação de dados e consultas SQL para gerar séries históricas e métricas relevantes para os usuários da aplicação.
	Contribuí para a geração de informações valiosas que auxiliaram os usuários na análise e tomada de decisões.
	Essas experiências e habilidades foram aplicadas ao longo do projeto, contribuindo para o desenvolvimento da aplicação e agregando valor ao produto final.
	
</details>

<details>

<summary>Projeto 3</summary>

  # Projeto 3: 3º Semestre de 2022
  
  ### Parceiro Acadêmico
  MidAll LTDA
  
  ### Descrição do Projeto
  
  A ideia é criar um mini motor de regras com uma interface onde as regras das promoções possam ser cadastradas e aplicadas no momento que os itens forem para o     
  carrinho de compras. Alguns exemplos de mecânicas: compre 2 produtos e tenha 10% de desconto. Na compra de 2 produtos, ganhe mais 1. Na compra de 3 produtos, 
  ganhe 50% de desconto no item de menor valor.
  
  ### Tecnologias adotadas na solução
  
  ### <img src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original.svg" width="40" height="40"/> Spring boot
  O funcionamento do e-commerce foi construído utilizando o Spring Boot.
  O Spring Boot é um framework Java open source que tem como objetivo facilitar esse processo em aplicações Java. Consequentemente, ele traz mais agilidade para o 
  processo de desenvolvimento, uma vez que devs conseguem reduzir o tempo gasto com as configurações iniciais.
  
  ### <img src="https://github.com/devicons/devicon/blob/master/icons/angularjs/angularjs-original.svg" width="40" height="40"/> Angular
  Para visualização da aplicação foi utilizado Angular.
  Angular é uma plataforma e framework para construção da interface de aplicações usando HTML, CSS e, principalmente, JavaScript, criada pelos desenvolvedores da 
  Google. Ele possui alguns elementos básicos que tornam essa construção interessante.
  
  ### <img src="https://github.com/devicons/devicon/blob/master/icons/sqlite/sqlite-original.svg" width="40" height="40"/> SQLite
  Para persistências dos dados foi utilizado o SQLite.
  SQLite é uma biblioteca em linguagem C que implementa um banco de dados SQL embutido. Programas que usam a biblioteca SQLite podem ter acesso a banco de dados SQL 
  sem executar um processo SGBD separado
  
  ### Contribuições Pessoais 
  
  Responsável por realizar integração do back-end com o front-end, enviando e recebendo requisções entre eles e criando as telas para melhor UX do cliente. 
  
<details>

<summary>Observable</summary>

  ```js

  export class ProductsService {

  constructor(private http : HttpClient) { }

  insert( product : Product) : Observable<Product>{
    let obj = {
      "discount" : product.discount,
      "name" : product.name,
      "price" : product.price,
      "description" : product.description,
      "categories" : [
          {
              "id": product.categories
          }
      ]

    }
    return this.http.post<Product>('http://localhost:8080/products', obj)

  }
  }

  ```
	
Por padrão do Angular, utilizei o Observable para lidar com a variedade de operações assíncronas, como solicitações e respostas AJAX, no contexto da comunicação HTTP. Para isso, fiz uso do módulo HttpClient fornecido pelo Angular.
No construtor da classe ProductsService, injetei a dependência do HttpClient, permitindo assim que eu utilizasse os métodos disponíveis para realizar requisições HTTP. O método insert foi criado para inserir um novo cadastro de produto no sistema.
Ao utilizar o Observable<Product> como tipo de retorno do método insert, estou indicando que a chamada para o servidor retornará um fluxo de dados assíncrono, representando o resultado da operação de inserção. Isso é especialmente útil quando lidamos com operações que podem levar algum tempo para serem concluídas, como as requisições HTTP.
Dentro do método insert, criei um objeto obj que contém as propriedades do produto a ser cadastrado, como desconto, nome, preço, descrição e categoria. Em seguida, utilizei o método http.post<Product>('http://localhost:8080/products', obj) do HttpClient para enviar uma requisição HTTP POST para o endpoint http://localhost:8080/products, passando o objeto obj como carga útil (payload) da requisição.
O Observable<Product> retornado pela chamada ao http.post permite que o código que consome esse método se inscreva (subscribe) no fluxo de dados assíncrono resultante. Dessa forma, é possível aguardar a resposta do servidor e realizar ações apropriadas, como tratar a resposta recebida, exibir mensagens ao usuário ou atualizar o estado da aplicação.
Ao utilizar o Observable, estamos adotando uma abordagem reativa para lidar com operações assíncronas. Isso nos permite trabalhar de forma mais eficiente e concisa, evitando bloqueios e tornando o código mais fácil de entender e dar manutenção.
	
</details>


<details>

<summary>Tela de listagem de produtos</summary>

 <img src="https://github.com/ZaionKun/Bertoti_PP/blob/main/metodologiaPCT/img/list_products.png" width="600" height="300"/>
 
Com a finalidade de agilizar o gerenciamento dos produtos no sistema, implementei uma tela de listagem que possibilita a adição de promoções, a edição e exclusão dos produtos cadastrados. Essa tela apresenta uma visualização organizada e intuitiva dos produtos, permitindo ao usuário acessar facilmente as funcionalidades de edição e exclusão de cada produto.
Ao adicionar uma promoção a um produto, o usuário pode especificar um desconto a ser aplicado ao preço original. Isso permite a criação de ofertas especiais e a atualização do valor do produto de forma dinâmica.
A funcionalidade de edição dos produtos cadastrados permite ao usuário atualizar informações como nome, preço, descrição e categoria do produto. Isso oferece flexibilidade para ajustar os detalhes dos produtos de acordo com as necessidades do negócio.
Além disso, a opção de exclusão dos produtos cadastrados proporciona uma forma prática de remover itens que não são mais necessários no sistema, mantendo o banco de dados organizado e atualizado.
Essa tela de listagem, com suas funcionalidades de adição de promoções, edição e exclusão de produtos, contribui para uma gestão eficiente e facilita o processo de manutenção do catálogo de produtos no sistema.
	
</details>

<details>

<summary>Tela de promoção</summary>

 <img src="https://github.com/ZaionKun/Bertoti_PP/blob/main/metodologiaPCT/img/promotion.png" width="600" height="300"/>
 
Tendo os produtos cadastrados no sistema, foi necessário implementar a opção de inserir promoções neles, oferecendo diferentes tipos de descontos e ofertas especiais. Essa funcionalidade permite que o usuário aplique promoções de forma flexível e personalizada aos produtos, proporcionando benefícios aos clientes e impulsionando as vendas.
Ao acessar a opção de inserir uma promoção, o usuário pode selecionar entre diversos tipos de descontos, como desconto percentual, desconto em valor fixo ou promoções especiais, como "Leve 2, Pague 1" ou "Desconto progressivo". Essa variedade de opções permite ao usuário criar promoções atrativas e adaptadas às estratégias de marketing da empresa.
Ao selecionar um tipo de promoção, o usuário pode definir os parâmetros correspondentes, como a porcentagem de desconto, o valor fixo do desconto ou as condições especiais da promoção. Essas informações são então aplicadas aos produtos selecionados, atualizando seus preços e refletindo as promoções no sistema.
A inclusão de opções de promoções no sistema proporciona uma maior flexibilidade e controle sobre as estratégias de vendas da empresa. Permite a criação de campanhas promocionais mais eficientes, capazes de atrair e fidelizar clientes, além de impulsionar o volume de vendas dos produtos. Essa funcionalidade contribui para o sucesso e a competitividade do negócio, ao proporcionar ações promocionais personalizadas e impactantes.

</details>

<details>

<summary>Tela de carrinho de compras</summary>

 <img src="https://github.com/ZaionKun/Bertoti_PP/blob/main/metodologiaPCT/img/carrinho%20de%20compras.png" width="600" height="300"/>
 
Desenvolvi uma tela dedicada ao carrinho de compras do usuário, onde são exibidos os produtos registrados juntamente com suas respectivas promoções. Essa tela foi projetada com o objetivo de proporcionar uma experiência de compra aprimorada, facilitando a visualização e o gerenciamento dos produtos selecionados pelo usuário.
Durante o processo de desenvolvimento, foram necessárias pesquisas e consultas à documentação oficial do Angular, a fim de obter informações e orientações sobre as melhores práticas e recursos disponíveis. Essa pesquisa permitiu a implementação eficiente das funcionalidades necessárias, seguindo as etapas explicadas nos capítulos anteriores do projeto.
Após algumas semanas de trabalho, a implementação da tela do carrinho de compras foi concluída com sucesso. A tela foi cuidadosamente projetada para exibir de forma clara e organizada os produtos selecionados pelo usuário, juntamente com as promoções aplicáveis a cada um deles. Isso permite que o usuário tenha uma visão completa dos produtos em seu carrinho, incluindo informações sobre preços, descontos e qualquer outra promoção especial disponível.
A tela do carrinho de compras visa melhorar a experiência de compra do usuário, oferecendo uma interface intuitiva e funcionalidades úteis, como a possibilidade de atualizar quantidades, remover produtos do carrinho e visualizar o valor total a ser pago. Com essa implementação, espera-se que o processo de compra seja mais eficiente e agradável para o usuário, contribuindo para o sucesso da plataforma de e-commerce.

</details>
  
## Aprendizados Efetivos HS
  
 Neste projeto aprendi a mexer com Angular, consultando a documentação oficial da tecnologia consegui desenvolver o front-end do projeto. Com isso consegui           distinguir a velocidade de profundidade e velocidade em diferentes métodos de pesquisa e estudo. Diversos tutoriais estão disponíveis ensinando a realizar grande   partes das etapas de projetos deste tipo, e estes conteúdos possuem sua importância. Entretanto, a consulta na documentação das tecnologias se mostrou muito mais   completa, rápida e confiável do que qualquer fonte terceira. Experiência e aprendizado valiosos até hoje.
 Aprendi mais sobre arquitetura de software. Foi a primeira vez em que trabalhei de fato com uma aplicação frontend separada dos serviços chamados de "backend".     Por conta desta experiência, fui inserido a um novo nível de exigência para a contrução de um sistema web, tendo que me preocupar com o formato e conteúdo           específico das requisições possíveis de entrada no serviço desenvolvido.

  - Criação de API que se provê serviços e se comunica com outros aplicações: sei fazer com autonomia

  - Desenvolvimento de scripts em Angular: sei fazer com autonomia 
</details>
 
<details>

<summary>Projeto 4</summary>

  # Projeto 4: 4º Semestre de 2022
  
 ### Parceiro Acadêmico
  Subiter
  
 ### Descrição do Projeto
 
 Temos um desafio de sincronização dos dados administrativos, financeiros e operacionais referentes aos serviços prestados pela empresa. A falta de organização dos    	dados acarreta lentidão para atender chamados, e confusão na interpretação dos indicadores comerciais e financeiros.

### Tecnologias adotadas na solução

### <img src="https://github.com/devicons/devicon/blob/master/icons/oracle/oracle-original.svg" width="40" height="40"/> Oracle cloud

O Oracle Cloud é uma tecnologia de banco de dados em nuvem desenvolvida pela Oracle Corporation, que oferece diversas vantagens para empresas que precisam de alta disponibilidade, escalabilidade e segurança em seus sistemas de gerenciamento de dados.

### <img src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original.svg" width="40" height="40"/> Spring boot

Spring Boot é um framework de código aberto para construção de aplicações em Java. Ele é projetado para simplificar o desenvolvimento de aplicativos com base em Spring Framework, fornecendo um conjunto de recursos e bibliotecas pré-configurados que permitem que os desenvolvedores criem aplicativos com rapidez e facilidade.

### <img src="https://github.com/devicons/devicon/blob/master/icons/vuejs/vuejs-original.svg" width="40" height="40"/> VueJs

Vue.js é um framework JavaScript flexível e reativo que ajuda os desenvolvedores a construir interfaces de usuário escaláveis e reutilizáveis, tornando o desenvolvimento de aplicativos mais eficiente e intuitivo.

### Contribuições Pessoais 

Responsável por criar o template inicial do VueJs com as configurações adequadas para o projeto. Autor das comunicações entre camadas e responsável de realizar algumas funcionalidades para melhorar a UX e dockerizando o front-end.

<details>

<summary>Deploy com Docker </summary>

```yml
FROM node:lts-alpine

RUN npm install -g http-server

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

RUN npm run build

EXPOSE 4200

CMD [ "http-server", "dist" ]	

```
A imagem é baseada na imagem Alpine do Node.js LTS. O arquivo instrui o Docker a instalar o servidor http-server globalmente, definir um diretório de trabalho para a aplicação e copiar os arquivos de configuração do projeto para o contêiner. Em seguida, o Docker instala as dependências do projeto, compila a aplicação e expõe a porta 4200 para permitir conexões de entrada. Finalmente, o Docker define um comando padrão para iniciar o servidor http-server e servir a pasta "dist" na porta 4200 quando o contêiner for iniciado. Este Dockerfile é útil para facilitar o processo de implantação de um projeto Node.js e garantir que a aplicação seja executada de forma consistente em diferentes ambientes.
	
</details>

<details>

<summary>Frontend</summary>

<img src="https://github.com/ZaionKun/Bertoti_PP/blob/main/metodologiaPCT/img/tela%20login.png" width="400" height="300"/>
	
Para tela de login ficar com esse design, usei o código abaixo:
	
```css

<style scoped>
body {
  margin: 0;
  padding: 0;
  font-family: Arial, Helvetica, sans-serif;
  background: radial-gradient(#e63808, #f3eb00);
  height: 100vh;
  overflow: hidden;
}
.box {
  width: 400px;
  padding: 40px;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background: #fcfcfc;
  text-align: center;
  border-radius: 25px;
}
.box h1 {
  color: white;
  text-transform: uppercase;
  font-weight: 500;
}
.box input[type="text"],
.box input[type="password"] {
  border: 0;
  background: none;
  display: block;
  margin: 20px auto;
  text-align: center;
  border: 2px solid #e63808;
  padding: 14px 10px;
  width: 200px;
  outline: none;
  color: rgb(0, 0, 0);
  border-radius: 24px;
  transition: 0.25s;
}
.box input[type="text"]:focus,
.box input[type="password"]:focus {
  width: 280px;
  border-color: #f3eb00;
}
.box button[type="button"] {
  border: 0;
  background: none;
  display: block;
  margin: 20px auto;
  text-align: center;
  border: 2px solid #f3eb00;
  padding: 14px 40px;
  outline: none;
  color: rgb(3, 3, 3);
  border-radius: 24px;
  transition: 0.25s;
  cursor: pointer;
}
.box button[type="button"]:hover {
  background: #2ecc71;
  border-color: #2ecc71
}
</style>

```
Utilizei css para desevolver as cores da tela e deixando os inputs com movimento ao escrever.
Especificamente, esse código cria uma caixa centralizada na página que contém um título, dois campos de entrada (para texto e senha) e um botão. A caixa tem um fundo branco, bordas vermelhas e um raio de borda arredondado. O gradiente radial de vermelho para amarelo cria um fundo atraente e dinâmico para a página. Quando o usuário clica em um campo de entrada, a borda muda para amarelo para indicar que está ativo. Quando o usuário passa o mouse sobre o botão, a cor de fundo e a cor da borda mudam para verde para indicar que é um botão interativo.

</details>

<details>

<summary>Integração de token Back-End com Front-End</summary>

Foi necessário criar token ao fazer o login para questões de segurança do sistema, no front-end realizei a passagem do token em todas as funções, segue um exemplo abaixo:

```js

export default{
    listar:(token) =>{
        return http.get('/servico', {headers:{Authorization: `Bearer ${token}`}})
    },

    salvar:(servico, token)=>{
        return http.post('/servico', servico, {headers:{Authorization: `Bearer ${token}`}})
    },

    deletar:(id, token)=>{
        return http.delete('/servico/' + id, {headers:{Authorization: `Bearer ${token}`}})
    },

    atualizar:(servico, token)=>{
        return http.put('/servico/' + servico.id , servico, {headers:{Authorization: `Bearer ${token}`}})
    }
}

```
O token é usado para autenticação e autorização, garantindo que apenas usuários autorizados possam criar, atualizar ou excluir serviços.
	
</details>
	
## Aprendizados Efetivos HS
	
- Aprendizado do Vue.js: 
	
	Durante o projeto, foi necessário aprender a trabalhar com o Vue.js, uma tecnologia JavaScript popular para construção de interfaces de usuário.

- Consulta à documentação oficial:
	
	Para aprofundar o conhecimento na tecnologia, foi fundamental consultar a documentação oficial do Vue.js. Isso permitiu compreender melhor as nuances e recursos mais avançados da 	tecnologia.

- Estudo aprofundado: 
	
	A experiência ressaltou a importância de se dedicar a um estudo aprofundado para adquirir um conhecimento mais sólido e consistente. Embora tutoriais possam ser úteis, é necessário ir     	  além e explorar a documentação completa da tecnologia.

- Conhecimento sólido: 
	
	O estudo aprofundado proporcionou um entendimento mais completo do Vue.js, permitindo o desenvolvimento de um projeto mais completo e eficiente.

- Busca constante por conhecimento: 
	
	A experiência destacou a importância de buscar constantemente novos conhecimentos e se manter atualizado em relação às novas tecnologias e tendências de mercado. Isso é essencial para 	se manter relevante e competitivo no campo profissional.

- Habilidades valiosas:
	
	Aprofundar-se na documentação e adquirir um conhecimento mais sólido do Vue.js resultou no desenvolvimento de habilidades valiosas, que podem ser aplicadas em futuros projetos e        
	contribuir para o crescimento profissional.
</details>

