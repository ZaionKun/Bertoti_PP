  # Zaion Felippe Gomes Arruda
  
  ## Introdução
  
  Olá, seja bem vindo! Sou o Zaion Felippe, estudante de Banco de dados pela FATEC Prof. Jessen Vidal. 
  
  Tenho 20 anos e trabalho como Assistente de Projetos e Logística. <br/>
  
  <img src="https://avatars.githubusercontent.com/u/81268185?v=4" height="150" width="150"/>

  ---
  
  ### Meus principais conhecimentos :bar_chart:
  
  ### <code>Python</code>
  
  Python é a linguagem de programação que eu tenho mais conhecimento. Fiz vários projetos utilizando alguns frameworks 
  como o Flask e Django; e diversos RPAs entre outras aplicações.
  Atualmente trabalho com essa linguagem, portanto, tenho uma segurança para desenvolver soluções e inovações.
  
  ### <code>VBA</code>
  
  VBA foi a primeira linguagem que estudei, mesmo antes de iniciar o cusro de banco de dados. Mesmo nunca tendo atuado 	 
  profissionalmente com VBA, realizei diversos projetos pessoais os quais me ajudaram na minha carreira pessoal. É uma 
  linguagem que me sinto confortavél em desenvolver RPA (Robotic Process Automation) entre outros temas.

  ### <code>SQL</code>
  
  O SQL sempre desempenhou um papel fundamental em meus projetos, sendo uma ferramenta que integrei desde projetos pessoais até ambientes profissionais. Durante meu 
  período na faculdade, tive a oportunidade de aprofundar meus conhecimentos e aprimorar minhas habilidades em SQL. Esta experiência acadêmica não apenas solidificou 
  minha 
  compreensão dos fundamentos, mas também me permitiu explorar técnicas avançadas para otimizar e aprimorar meus bancos de dados, bem como refinar minhas consultas. Como  
  resultado, adquiri a capacidade de criar soluções mais eficientes e robustas, garantindo um desempenho superior em meus projetos, tanto pessoais quanto profissionais.

  ### <code>NOSql</code>
 Durante minha experiência acadêmica na faculdade, tive meu primeiro contato com bancos de dados NoSQL. Ao longo desse período, adquiri conhecimentos sólidos que me 
 capacitaram a desenvolver e implementar bancos de dados não relacionais de forma eficaz. Estou apto a aplicar soluções NoSQL em situações específicas, atendendo às 
 necessidades do projeto de forma personalizada.

 ### <code>Metodologia Ágil (Scrum)</code>
 Durante o período na faculdade, aprendi e dediquei-me ao desenvolvimento em Scrum, aplicando essa metodologia em todos os projetos 
 acadêmicos. Essa experiência não apenas consolidou minha compreensão teórica do Scrum, mas também me forneceu habilidades práticas valiosas. Ao ingressar no cenário 
 profissional, consegui aplicar essas habilidades de forma eficaz. A experiência adquirida durante os projetos acadêmicos serviu como uma base sólida para minha carreira, 
 permitindo-me utilizar o Scrum de maneira prática e bem-sucedida em contextos profissionais, indo além do ambiente acadêmico.


 ### <code>DevOps</code>
 Durante minha jornada acadêmica, dediquei-me ao estudo e à aplicação prática de práticas DevOps. Esta experiência acadêmica serviu como um campo de 
 testes valioso, permitindo-me aprofundar meus conhecimentos em integração contínua e automações de processos de desenvolvimento. Após ingressar na minha 
 carreira profissional, pude aplicar essas habilidades de DevOps em ambientes do mundo real. Gerenciei com sucesso pipelines de CI/CD, implementei técnicas eficazes de 
 automação e colaborei estreitamente com equipes de desenvolvimento e operações para melhorar a eficiência operacional. A sólida base que construí durante meus projetos 
 acadêmicos não apenas fortaleceu minha compreensão do DevOps, mas também me permitiu implementar práticas eficazes em cenários profissionais, contribuindo 
 significativamente para o sucesso dos projetos e processos de entrega
 
 ---
  <details>
  
  <summary>Projeto 1</summary>
  
  # Projeto 1: 1º Semestre de 2021
  
  ### Parceiro Acadêmico
  FATEC São José dos Campos - Prof. Jessen Vidal
  
  ### Descrição do Projeto
  
Este projeto tem como objetivo criar um assistente virtual financeiro para ajudar pessoas a gerenciar melhor suas finanças pessoais. O assistente virtual foi capaz de se comunicar com o usuário por meio de comandos de voz ou texto, com acesso a informações financeiras do usuário, como contas bancárias, cartões de crédito e investimentos.
  
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

### Hard Skills
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

### Soft Skills

- Autonomia:
	Neste primeiro projeto eu estava iniciando meus estudos com programação, 
então tive que aprender a pesquisar sobre as tecnologias e logicas que iria aplicar;

- Comunicação:
	Para entender e realizar o projeto, tive de tirar muitas dúvidas com os 
professores e discutir ideias com meus colegas.

---

</details>

<details>


<summary>Projeto 2</summary>

  # Projeto 2: 2º Semestre de 2021
  
  ### Parceiro Acadêmico
  Necto Systems
  
   ### Descrição do Projeto
 A aplicação em questão tem como objetivo principal coletar métricas de um ou mais Sistemas Gerenciadores de Banco de Dados remotos, em intervalos regulares de tempo. Essas métricas incluem informações relevantes para o gerenciamento e manutenção desses sistemas, como por exemplo, uso de CPU, uso de memória, número de conexões, tempo de resposta, entre outras.

Ao coletar essas informações de forma periódica, a aplicação permite que o usuário tenha acesso a uma série histórica de dados, que pode ser utilizada para identificar padrões de uso, detectar problemas e avaliar o desempenho dos SGBDs ao longo do tempo. Com base nessas informações, o usuário é capaz de tomar decisões quanto à necessidade de manutenções, balanceamento e aumento de capacidade, bem como melhorias na infraestrutura (servidores), de forma a garantir a disponibilidade e a eficiência dos sistemas gerenciados pelo SGBD.

### Tecnologias adotadas na solução
### <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg" width="40" height="40"/> Java  
	
Java é uma linguagem de programação amplamente utilizada no desenvolvimento de aplicativos corporativos. Uma das suas principais vantagens é a portabilidade, ou seja, o código escrito em Java pode ser executado em diferentes plataformas sem a necessidade de adaptações significativas.

Na aplicação em questão, a escolha da linguagem Java foi motivada por várias razões. Uma delas é a sua ampla disponibilidade de bibliotecas e frameworks para o desenvolvimento de aplicativos de coleta de dados e análise de métricas, o que pode ter acelerado o processo de desenvolvimento da aplicação.
 
### <img src="https://github.com/devicons/devicon/blob/master/icons/postgresql/postgresql-original.svg" width="40" height="40"/> PostgreSQL
	
A tecnologia PostgreSQL foi utilizada como o sistema gerenciador de banco de dados para armazenar e gerenciar as métricas coletadas pelos servidores remotos. O PostgreSQL é uma opção popular e avançada de sistema de gerenciamento de banco de dados relacional de código aberto, que oferece recursos avançados, incluindo suporte a SQL avançado, extensibilidade, replicação, transações e integridade referencial.

 ### Contribuições Pessoais
Responsável por desenvolver consultas SQL que permitiram exibir algumas métricas do banco de dados na aplicação. Esses itens foram identificados como um dos principais items do projeto, ou seja, uma necessidade importante a ser atendida para a efetividade da ferramenta.

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

### Hard Skills

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
	Contribuí para a geração de informações valiosas que auxiliaram os usuários na análise e tomadas de decisões.
	Essas experiências e habilidades foram aplicadas ao longo do projeto, contribuindo para o desenvolvimento da aplicação e agregando valor ao produto final.

### Soft Skills

- Trabalho em equipe:

  	Revisei o código de meus colegas e os ajudei a realizar suas tarefas;

 - Gestão de tempo:

	Para realizar as tasks definidas;


 ---
 
</details>

<details>


<summary>Projeto 3</summary>

  # Projeto 3: 3º Semestre de 2022
  
  ### Parceiro Acadêmico
  MidAll LTDA
  
  ### Descrição do Projeto
  
  O projeto consiste na criação de  um mini motor de regras com uma interface onde as regras das promoções possam ser cadastradas e aplicadas no momento que os itens forem para o     
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

### Hard Skills
 Neste projeto aprendi a trabalhar com Angular, consultando a documentação oficial da tecnologia consegui desenvolver o front-end do projeto. Com isso consegui           distinguir a velocidade de profundidade e velocidade em diferentes métodos de pesquisa e estudo. Diversos tutoriais estão disponíveis ensinando a realizar grande   partes das etapas de projetos deste tipo, e estes conteúdos possuem sua importância. Entretanto, a consulta na documentação das tecnologias, se mostrou muito mais   completa, rápida e confiável do que qualquer fonte terceira. Experiência e aprendizado valiosos até hoje.
 Aprendi mais sobre arquitetura de software. Foi a primeira vez em que trabalhei de fato com uma aplicação frontend separada dos serviços chamados de "backend".     Por conta desta experiência, fui inserido a um novo nível de exigência para a contrução de um sistema web, tendo que me preocupar com o formato e conteúdo           específico das requisições possíveis de entrada no serviço desenvolvido.

  - Criação de API que se provê serviços e se comunica com outros aplicações: sei fazer com autonomia

  - Desenvolvimento de scripts em Angular: sei fazer com autonomia

### Soft Skills

- Comunicação:

	Realizamos reuniões regulares para debater o andamento das tarefas definidas;

- Gestão de tempo:

	Para realizar as tasks definidas;

---

</details>
 
<details>


<summary>Projeto 4</summary>

  # Projeto 4: 4º Semestre de 2022
  
 ### Parceiro Acadêmico
  Subiter
  
 ### Descrição do Projeto
 
 O projeto teve como desafio a sincronização dos dados administrativos, financeiros e operacionais referentes aos serviços prestados pela empresa. A falta de organização dos    	dados acarreta lentidão para atender chamados, e confusão na interpretação dos indicadores comerciais e financeiros.

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

### Hard Skills
	
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

### Soft Skills

- Proatividade:

  	Realizei algumas tarefas que ainda não tinham sido determinadas para um membro específico do grupo;
 
 - Trabalho em equipe:

   	Compartilhei com o grupo os conhecimentos que aprendi durante as pesquisas para facilitar o desenvolvimento;


---

</details>

<details>

<summary>Projeto 5</summary>

  # Projeto 5: 5º Semestre de 2023
  
 ### Parceiro Acadêmico
  MidAll LTDA
  
 ### Descrição do Projeto
 
Este projeto consiste na automatização a jornada de download de arquivos, armazenados em uma plataforma de vídeo, transferindo-os para a nuvem, através do desenvolvimento de uma aplicação como serviço, contando apenas com um menu de configuração para o usuário, que terá os parâmetros necessários para o processo de download do serviço automaticamente , gerando alertas em caso de erro no processamento. Salve os metadados do arquivo para construir um dashboard para monitorar a execução do serviço e posteriormente analisar resultados e indicadores.


### Tecnologias adotadas na solução

### <img src="https://github.com/devicons/devicon/blob/master/icons/microsoftsqlserver/microsoftsqlserver-plain.svg" width="40" height="40"/> Microsoft SQL Server

O SQL Server é um software de gerenciamento de banco de dados relacional que permite que os usuários armazenem, acessem e manipulem dados de forma eficiente. Ele usa a linguagem SQL (Structured Query Language) para executar operações de banco de dados, como consultas, inserções, atualizações e exclusões.

### <img src="https://github.com/devicons/devicon/blob/master/icons/python/python-original.svg" width="40" height="40"/> Python

 Python é uma linguagem de programação amplamente usada em aplicações da Web, desenvolvimento de software, ciência de dados e machine learning (ML).

### <img src="https://github.com/devicons/devicon/blob/master/icons/vuejs/vuejs-original.svg" width="40" height="40"/> VueJs

Vue.js é um framework JavaScript flexível e reativo que ajuda os desenvolvedores a construir interfaces de usuário escaláveis e reutilizáveis, tornando o desenvolvimento de aplicativos mais eficiente e intuitivo.

### Contribuições Pessoais 

Fui encarregado a de definir e estruturar a arquitetura do projeto, responsável por escolher as tecnologias e bibliotecas mais adequadas para enfrentar os desafios específicos do projeto. Além disso, lidei com questões relacionadas a práticas DevOps para assegurar a mais alta qualidade do projeto, implementando processos e ferramentas que garantam a eficiência operacional, colaboração contínua e entrega confiável do produto final.

<details>

<summary>Arquitetura do projeto</summary>

Para mais detalhes da arquitetura, acesse o link abaixo:

### Back-end
#### 🔗 [Flowchart Miro Link](https://miro.com/app/board/uXjVMCTZABU=/)

<h1 align="center"> <img src = "https://github.com/TechNinjass/midall-parent/blob/main/docs/Images/backend-miro.png" /></h1>

### Front-end
#### 🔗 [Flowchart Miro Link](https://miro.com/app/board/uXjVMCVa9pE=/)

<h1 align="center"> <img src = "https://github.com/TechNinjass/midall-parent/blob/main/docs/Images/frontend-miro.png" /></h1>
	
</details>

<details>

<summary>Continuous Integration</summary>

### Back-end
No desenvolvimento do backend, segui uma abordagem cuidadosa para evitar problemas relacionados a versões de bibliotecas e incompatibilidades. Inicialmente, implementei uma metodologia rigorosa para gerenciar as dependências, garantindo que as versões das bibliotecas fossem compatíveis entre si. Estabeleci um padrão consistente para importações de bibliotecas, promovendo uma estrutura organizada e fácil de manter. Além disso, priorizei a execução de testes unitários abrangentes, assegurando que cada componente do código fosse validado quanto à sua funcionalidade, confiabilidade e integridade

<details> 
	
```yml

name: Python application

on:
  push:
    branches:
      - '*'
  pull_request:
    branches:
      - '*'

permissions:
  contents: read

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v3
      - name: Set up Python 3.10
        uses: actions/setup-python@v3
        with:
          python-version: "3.10"
      - name: Install dependencies
        run: |
          python -m pip install --upgrade pip
          if [ -f requirements.txt ]; then pip install -r requirements.txt; fi
      - name: Lint with flake8
        run: |
          flake8 . --count --select=E9,F63,F7,F82 --show-source --statistics
          flake8 . --count --exit-zero --max-complexity=10 --max-line-length=127 --statistics
      - name: Sort imports with isort
        run: |
          isort .
      - name: Test with pytest
        run: |
          pytest
  
```
</details>

### Front-end

No frontend, assegurei que todas as bibliotecas fossem instaladas na mesma versão para evitar conflitos e inconsistências. Realizei uma verificação minuciosa das dependências, garantindo que estivessem sincronizadas. Além disso, desenvolvi e executei testes para validar a integridade e o desempenho das funcionalidades implementadas. Essas medidas garantiram não apenas a estabilidade do sistema, mas também uma experiência consistente e sem problemas para os usuários finais. 

<details>

 ```yml
name: Vue.js CI

on:
  push:
    branches:
      - '*'
  pull_request:
    branches:
      - main
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout code
        uses: actions/checkout@v2
      - name: Install dependencies
        run: npm install
      - name: Build
        run: npm run build
      - name: Test
        run: npm run test  
  
```
</details>

</details>

<details>
	
<summary>Serviço de transferência de arquivos</summary>
</br>

No âmbito deste projeto, desenvolvi um serviço altamente eficiente responsável por capturar as configurações pré-definidas ou definidas pelo usuário. Este serviço foi projetado para transferir arquivos de uma nuvem para outra, otimizando o processo ao transformar esses arquivos em bytes antes da transferência. Após a conclusão bem-sucedida da transferência, o serviço automaticamente realiza a exclusão do arquivo na nuvem de origem. Essa solução não apenas garante uma transferência segura e confiável dos dados, mas também otimiza o uso do espaço de armazenamento, proporcionando uma experiência eficaz e sem complicações para o usuário final.
</br>

<details>

```py

class FileModelService:
    def __init__(self):
        self.google_drive = GoogleDrive()
        self.azure = Azure()

    def transfer_files(self):
        container_client = self.azure.connection_azure(use_json=True)
        files_drive = self.google_drive.list_files().get('files')

        if not files_drive:
            print("Nenhum arquivo encontrado no Google Drive.")
            return

        with open(sp.PARAMETERS_TRANSFER) as f:
            params = json.load(f)
        folder_name = params.get('folder_azure')

        for item in files_drive:
            file_name = item.split("(")[0].strip()
            file_id = item.split("(")[1].replace(")", "")
            file_content = self.google_drive.download_file(file_id)

            if not isinstance(file_content, bytes):
                file_content = bytes(str(file_content), 'utf-8')

            transfer = FileTransferModel()
            transfer.name = file_name
            transfer.size = len(file_content)
            transfer.format = file_name.split(".")[-1]
            transfer.date_upload = datetime.now()
            transfer.data_transfer = datetime.now()
            
            blob_path = f"{folder_name}/{file_name}" if folder_name else file_name
            
            if blob_path != None:
                blob_client = container_client.get_blob_client(container='midall', blob=blob_path)
            else:
                blob_client = container_client.get_blob_client(container='midall', blob=file_name)
            try:
                blob_client.upload_blob(file_content, overwrite=True)
                print(f"Arquivo {file_name} transferido com sucesso para o Azure Blob Storage!")
                self.google_drive.remove_files(file_id)
                print(f"Arquivo {file_name} deletado do Google Drive!")
                transfer.status = 'transferido'
                plyer.notification.notify(
                    title='Transferência Concluída',
                    message=f'Arquivo "{file_name}" foi transferido com sucesso para o Azure Blob Storage!',
                    app_name='Midall Transfer',
                    timeout=5
                )
            except AzureError as ex:
                print('Um erro ocorreu durante o upload do arquivo: {}'.format(ex))
                transfer.status = 'erro: {}'.format(str(ex))
                plyer.notification.notify(
                    title='Ocorreu um erro ao transferir',
                    message=f'Arquivo "{file_name}" não foi transferido!',
                    app_name='Midall Transfer',
                    timeout=5
                )
            transfer.save()

            if not isinstance(file_content, bytes):
                file_content = bytes(str(file_content), 'utf-8')

```
</details>

Além disso, implementei um funcionalidade de alertas para fornecer notificações precisas durante todo o processo de transferência de arquivos. Os alertas são acionados quando o arquivo é transferido com sucesso, quando ocorre um erro durante a transferência ou quando o arquivo é deletado na nuvem de origem. Esses alertas são essenciais para manter os usuários informados em tempo real sobre o status das operações, garantindo transparência, confiabilidade e um controle eficaz sobre o fluxo de dados entre as nuvens. Para tudo isso ficar de uma forma légivel e estrutural implementei com o padrão de projeto "observer", Neste trecho, quando a transferência de um arquivo é concluída com sucesso, o código notifica os observadores sobre essa mudança de estado específica (a conclusão bem-sucedida da transferência) usando plyer.notification.notify. Portanto, neste contexto:

O FileModelService atua como o objeto "observado".
O método transfer_files atua como o método que muda o estado do objeto observado.
O plyer.notification.notify atua como o mecanismo de notificação que informa outros objetos (observadores) sobre a mudança de estado.

</br>
</details>

<details>

<summary>Padrões de projetos</summary>
</br>
Para conseguir fazer as transferências dos arquivos, foi necessário abrir conexão com as clouds, com isso segui com "Singleton Pattern". Concentrei a conexão em uma única classe persistente em toda a execução do programa para ambas clouds

</br>

Drive:

<details>
	
```py

class GoogleDrive:
    def __init__(self):
        self.credentials = None

    def get_creds(client_id, client_secret):
        flow = InstalledAppFlow.from_client_config(
            {
                "installed": {
                    "client_id": client_id,
                    "client_secret": client_secret,
                    "redirect_uris": ["urn:ietf:wg:oauth:2.0:oob"],
                    "auth_uri": "https://accounts.google.com/o/oauth2/auth",
                    "token_uri": "https://oauth2.googleapis.com/token",
                    "auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
                }
            },
            scopes=["https://www.googleapis.com/auth/drive"],
        )

        credentials = flow.run_local_server(port=0, access_type='offline', include_granted_scopes=False)

        with open(sp.DRIVE_CREDENTIALS, "w") as token:
            json.dump({
                "token": credentials.token,
                "refresh_token": credentials.refresh_token,
                "token_uri": credentials.token_uri,
                "client_id": credentials.client_id,
                "client_secret": credentials.client_secret,
                "scopes": credentials.scopes,
            }, token)

        credentials = credentials
        return credentials, {"message": "Conexão realizada com sucesso."}

```
</br>
</details>

Azure:

<details>
	
```py

class Azure():
    def __init__(self):
        self.account_name = None
        self.account_key = None
        self.container_name = None

    def connection_azure(self, account_name=None, account_key=None, container_name=None, use_json=True):
        if use_json:
            if os.path.exists(sp.AZURE_CREDENTIALS):
                with open(sp.AZURE_CREDENTIALS, "r") as f:
                    credentials = json.load(f)
                if (account_name is None or account_name == credentials["account_name"]) and \
                (account_key is None or account_key == credentials["account_key"]) and \
                (container_name is None or container_name == credentials["container_name"]):
                    connect_str = f'DefaultEndpointsProtocol=https;AccountName={credentials["account_name"]};AccountKey={credentials["account_key"]};EndpointSuffix=core.windows.net'
                    return BlobServiceClient.from_connection_string(connect_str)

            use_json = False

        if account_name is not None and account_key is not None and container_name is not None:
            credentials = {"account_name": account_name, "account_key": account_key, "container_name": container_name}
            with open(sp.AZURE_CREDENTIALS, "w") as f:
                json.dump(credentials, f)

        connect_str = 'DefaultEndpointsProtocol=https;AccountName={};AccountKey={};EndpointSuffix=core.windows.net'.format(credentials["account_name"], credentials["account_key"])

        blob_service_client = BlobServiceClient.from_connection_string(connect_str)

        return blob_service_client
```
</br>
</details>


</details>
	
## Aprendizados Efetivos HS

### Hard Skills

- DevOps e CI/CD:
aprofundei meus conhecimentos sobre integração e entrega contínuas (CI/CD), implementando práticas colaborativas entre desenvolvimento e operações.

- Teste de Unidades e Garantia de Qualidade:
aprimorei minhas habilidades em teste de unidades, assegurando a funcionalidade e integridade do código.
Compreendi os princípios essenciais da garantia de qualidade, promovendo um produto final confiável e de alta qualidade.

- Documentação e Padronização:
estabeleci padrões consistentes para a documentação de desenvolvimento do projeto, garantindo clareza e coesão nas informações compartilhadas.
Sincronizei versões de bibliotecas para evitar conflitos, mantendo a estabilidade do sistema.

- Manipulação Avançada de Dados:
adquiri habilidades sólidas na transformação de arquivos em bytes, facilitando a transferência segura de dados para outra nuvem de armazenamento.

Estes aprendizados não apenas enriqueceram minha experiência, mas também contribuíram significativamente para a qualidade e o sucesso deste projeto, preparando-me para enfrentar desafios multifacetados no desenvolvimento de software.

### Soft Skills

- Liderança na equipe de back-end:

  	Como era o membro da equipe que mais tinha conhecimentos sobre Python com Flask, os liderei;
   
 - Proatividade:

   	Este projeto foi um pouco maior do que os outros, sendo assim, tomei a frente pra realizar algumas tarefas que ainda não tinham sido determinadas para um membro específico do grupo;

- Trabalho em equipe:

  	Revisei o código de meus colegas e os ajudei a realizar suas tarefas;

---

</details>

<details>

<summary>Projeto 6</summary>

  # Projeto 6: 6º Semestre de 2023
  
 ### Parceiro Acadêmico
  Visiona
  
 ### Descrição do Projeto
 
A organização reconhece a necessidade crucial de implementar um Sistema de Informação Geográfica (SIG) para otimizar análises e aprimorar os processos internos. Os dados essenciais para esta iniciativa estão disponíveis na esfera pública do ProAgro, um programa do governo federal dedicado ao financiamento agrícola para pequenos e médios produtores brasileiros.
No entanto, enfrentamos desafios significativos que exigem atenção cuidadosa durante a implementação. Um desses desafios é a falta de organização dos dados, o que pode impactar negativamente a eficácia do SIG. Além disso, a presença de informações sensíveis requer uma abordagem de segurança robusta para garantir a confidencialidade e integridade dos dados.
Outro ponto crítico a ser abordado é o volume considerável de dados disponíveis no ProAgro. O excesso de informações pode sobrecarregar o sistema, tornando imperativa a implementação de estratégias eficientes de gerenciamento de dados para garantir a eficácia e a rapidez das análises.
Dessa forma, a implementação bem-sucedida do SIG não apenas implica a integração tecnológica, mas também a resolução desses desafios específicos, garantindo que o sistema seja uma ferramenta eficiente e segura para melhorar a tomada de decisões e a gestão de processos relacionados ao financiamento agrícola.


### Tecnologias adotadas na solução

### <img src="https://github.com/devicons/devicon/blob/master/icons/mysql/mysql-original.svg" width="40" height="40"/> MySql

O MySQL é um sistema de gerenciamento de banco de dados, que utiliza a linguagem SQL como interface.

### <img src="https://github.com/devicons/devicon/blob/master/icons/redis/redis-original.svg" width="40" height="40"/> Redis

Redis é um armazenamento de estrutura de dados em memória, usado como um banco de dados em memória distribuído de chave-valor, cache e agente de mensagens, com durabilidade opcional.

### <img src="https://github.com/devicons/devicon/blob/master/icons/mongodb/mongodb-original.svg" width="40" height="40"/> MongoDB

MongoDB é um software de banco de dados orientado a documentos livre, de código aberto e multiplataforma, escrito na linguagem C++. Classificado como um programa de banco de dados NoSQL, o MongoDB usa documentos semelhantes a JSON com esquemas.

### <img src="https://github.com/devicons/devicon/blob/master/icons/python/python-original.svg" width="40" height="40"/> Python

 Python é uma linguagem de programação amplamente usada em aplicações da Web, desenvolvimento de software, ciência de dados e machine learning (ML).

### <img src="https://github.com/devicons/devicon/blob/master/icons/docker/docker-original.svg" width="40" height="40"/> Docker

Docker é um conjunto de produtos de plataforma como serviço que usam virtualização de nível de sistema operacional para entregar software em pacotes chamados contêineres. Os contêineres são isolados uns dos outros e agrupam seus próprios softwares, bibliotecas e arquivos de configuração.

### <img src="https://github.com/devicons/devicon/blob/master/icons/react/react-original.svg" width="40" height="40"/> ReactJs

O React é uma biblioteca front-end JavaScript de código aberto com foco em criar interfaces de usuário em páginas web.

### Contribuições Pessoais 

Fui encarregado a de definir e estruturar a arquitetura do projeto, responsável por escolher as tecnologias e bibliotecas mais adequadas para enfrentar os desafios específicos do projeto. Além disso, lidei com questões relacionadas a práticas DevOps para assegurar a mais alta qualidade do projeto, implementando processos e ferramentas que garantam a eficiência operacional, colaboração contínua e entrega confiável do produto final.

<details>

<summary>Arquitetura do projeto</summary>

Para mais detalhes da arquitetura, acesse o link abaixo:

### Back-end
#### 🔗 [Flowchart Miro Link](https://miro.com/app/board/uXjVNJ7807c=/)

### NOSql
#### 🔗 [Flowchart Miro Link](https://miro.com/app/board/uXjVMCVa9pE=/)
	
</details>

<details>

<summary>Arquitetura do NOSQL</summary>

### MongoDB

Criei essa estrutura para conseguir suportar as regras da LGPD, dentro das regras utilizamos 3 temas:

<h1 align="center"> <img src = "https://github.com/ZaionKun/Bertoti_PP/blob/main/metodologiaPCT/img/mongodb.jpeg" /></h1>

1) Princípio da Limitação de Armazenamento (Artigo 6º, Inciso V) e Direito de Exclusão (Artigo 18):
Eu assegurei que os dados pessoais são armazenados apenas pelo tempo necessário para atender aos objetivos do projeto. Após essa etapa, procedo com a exclusão adequada. Além disso, implementei medidas de backup para preservar os campos essenciais na tabela.

2) Política de Privacidade (Artigo 9º da LGPD):
Eu desenvolvi uma política de privacidade que inclui a versão atualizada, permitindo uma fácil compreensão das mudanças ao longo do tempo. Para garantir transparência, criei parâmetros para o momento em que o usuário aceita a política. Na política, detalho de forma clara e específica o motivo pelo qual os dados pessoais estão sendo coletados e como serão utilizados.

3) Compartilhamento dos dados (Artigo 7° da LGPD):
Utilizar os dados exclusivamente para a finalidade para a qual foram destinados. Além disso, estabeleci uma rota específica que permite apenas o compartilhamento necessário, alinhado com os princípios da política de privacidade.

### Redis

Implementei a integração do Redis para otimizar o desempenho do sistema. Agora, antes de realizar consultas ao banco de dados, verificamos se os resultados já estão em cache no Redis. Essa abordagem possibilita um retorno mais eficiente dos dados, agilizando significativamente os processos do sistema. Essa estratégia de caching não apenas melhora a velocidade das consultas, mas também contribui para uma experiência mais ágil e responsiva para os usuários, tornando o sistema mais eficiente e otimizado.

Exemplo da chave que crie para retornar os valores de uma query:

```py
def query_return_land(
        self, lowest_latitude, greatest_latitude, lowest_longitude, greatest_longitude
    ):
        cache_key = f"gleba:{lowest_latitude}:{greatest_latitude}:{lowest_longitude}:{greatest_longitude}"

        try:
            if redis_available:
                cached_data = redis_server.get(cache_key)
                if cached_data:
                    result = cached_data
                    return eval(result)
        except redis.ConnectionError:
            print("Não foi possível conectar ao servidor Redis")
```

Nesse exemplo eu criei uma função para retornar as glebas com base nos parametros passados na própria função, que seria:

lowest_latitude, greatest_latitude, lowest_longitude, greatest_longitude.

Com base nisso, elaborei uma chave incorporando esses parâmetros para consultar o Redis e obter os valores desejados. Além disso, implementei procedimentos adicionais para a aplicação, como a inclusão de uma condição que verifica a existência do cache. Caso o cache não esteja presente, é realizada uma nova consulta ao banco de dados, e os resultados são utilizados para popular um novo cache.

É importante destacar que, em casos em que o Redis não esteja operacional, a lógica foi desenvolvida para recuperar diretamente os dados do banco MySQL, assegurando assim uma abordagem resiliente e eficiente para a aplicação

lógica:

```py
	result = gleba_instance.exec_query(sql)
	try:
	    if redis_available:
		redis_server.set(cache_key, str(result))
	except redis.ConnectionError:
	    print("Não foi possível conectar ao servidor Redis")
	return result
```

</details>

<details>
	
<summary>Message API</summary>
</br>

Desenvolvi uma API dedicada ao envio de e-mails, uma iniciativa inspirada nos requisitos estabelecidos pela Lei Geral de Proteção de Dados (LGPD). A motivação principal foi garantir que os usuários fossem prontamente informados em caso de problemas no sistema, especialmente quando seus dados estivessem em risco. Esta API opera de forma independente do sistema principal e do banco de dados central, proporcionando uma camada adicional de resiliência.

Essa abordagem tem o propósito de assegurar a continuidade da comunicação com os usuários, mesmo em situações adversas. A separação da funcionalidade de envio de e-mails em uma API independente contribui para a operação eficiente e independente, possibilitando uma resposta rápida e eficaz aos incidentes que possam impactar a segurança dos dados.

Exemplo de um envio de teste para a API:

```py
from requests import post

def send_email():
    data = {
            'from_addr': 'zaion.arruda@fatec.sp.gov.br',
            'to_addrs': ['zaion.arruda@fatec.sp.gov.br'],
            'cc_addrs': ['zaion.arruda@fatec.sp.gov.br'],
            'subject': 'Testando',
            'content': 'Conteúdo do teste',

            }

    post('http://localhost:8081/send_email', json=data)

send_email()

```

Com isso criei o servico para disparar os e-mails para os usuários do sistema

```py

class MessageService:
    def __init__(self):
        super().__init__()
        db_instance = conn_mongo_validation()
        self.user_instance = db_instance.users

    def send_email_everyone(self, enabled=False):
        if enabled:
            emails = MessageService.get_emails(self)

            data = {
                "from_addr": "zaion.arruda@fatec.sp.gov.br",
                "to_addrs": emails,
                "cc_addrs": ["zaion.arruda@fatec.sp.gov.br"],
                "subject": "Testando",
                "content": "Conteúdo do teste",
            }

            result = post("http://localhost:5001/send_email", json=data)
            print(emails)
            return result

    def get_emails(self):
        users = self.user_instance.find()
        emails = []
        for _user in users:
            emails.append(_user["email"])

        return emails

```
Message API 

<h1 align="center"> <img src = "https://github.com/ZaionKun/Bertoti_PP/blob/main/metodologiaPCT/img/messa_api.jpg" /></h1>

</details>

<details>

<summary>Docker</summary>
</br>

Com a implementação das regras de negócio, identifiquei a necessidade de incorporar o Docker para atender a determinadas exigências e facilitar o desenvolvimento. Em particular, a regra que envolve o envio de e-mails como alerta aos usuários, em conformidade com a LGPD, foi um cenário propício para a criação de um contêiner Docker independente. Essa abordagem permite que a aplicação realize solicitações a uma API dedicada, fornecendo uma solução modular e escalável para o serviço de envio de e-mails, enquanto mantém a independência e a separação de responsabilidades. Dessa forma, a aplicação principal pode fazer requisições a este serviço específico de forma eficiente, sem a necessidade de incorporar diretamente a lógica de envio de e-mails em seu código-base principal

```yml

FROM python:3.10.12-slim-buster

RUN apt-get update && apt-get install -y build-essential

WORKDIR /tech-backend/

COPY . .

RUN pip install --upgrade pip setuptools wheel
RUN pip install -r requirements.txt

WORKDIR /tech-backend/message_api

CMD ["python", "-m", "flask", "run", "--host=0.0.0.0", "--port=5001"]

```

A outra demanda crítica surgiu em relação ao desempenho das consultas, que estava impactando diretamente a performance da aplicação. Para otimizar esse processo, optamos por implementar o Redis e utilizar o cache para armazenar as consultas frequentes. Contudo, deparando-nos com a diversidade de sistemas operacionais dentro do grupo, percebemos que o Redis apresenta um desempenho superior em ambientes Linux.

Como uma solução para garantir a uniformidade e eficiência na equipe, decidi criar um contêiner Docker específico para o banco Redis. Essa abordagem permitiu que os membros do grupo, mesmo aqueles que não utilizam Linux diretamente, pudessem acessar o Redis de maneira simplificada. Utilizando o WSL (Windows Subsystem for Linux), foi possível executar a imagem Docker do Redis de forma transparente, proporcionando uma solução harmoniosa para todos os desenvolvedores, independentemente do sistema operacional que estivessem utilizando.

```yml

tech-redis:
    image: redis
    ports:
      - "6380:6380"
    volumes:
      - redis-data:/data
    command: redis-server --appendonly yes --port 6380

volumes:
  redis-data:

```

</details>

	
## Aprendizados Efetivos HS
	
- Arquitetura de Cache e Desempenho:
Aprimorei minha compreensão sobre bancos de dados em cache, explorando arquiteturas eficazes para melhorar o desempenho de sistemas. Compreendi a importância de estratégias de caching inteligentes para reduzir o tempo de resposta e otimizar o acesso a dados frequentemente utilizados.

- NoSQL e Modelagem Não Relacional:
Aprofundei meus conhecimentos em bancos de dados não relacionais, explorando conceitos fundamentais de NoSQL. Compreendi as nuances da modelagem não relacional, adaptando meu entendimento de esquemas tradicionais para estruturas mais flexíveis, como documentos, grafos ou chave-valor.

- Compreensão da LGPD:
Aprofundei meus conhecimentos na Lei Geral de Proteção de Dados (LGPD), compreendendo as diretrizes e regulamentações para o tratamento e proteção de dados pessoais. Explorei as responsabilidades e obrigações necessárias para garantir a conformidade, minimizando riscos de violações de privacidade.

- Implementação de Termos de Aceite do Usuário:
Desenvolvi expertise na criação e implementação de termos de aceite do usuário, garantindo que as políticas de privacidade e práticas de coleta e tratamento de dados estejam claramente comunicadas. Adotei abordagens transparentes para fornecer aos usuários informações claras sobre como seus dados serão utilizados, fortalecendo a confiança e conformidade com as normativas da LGPD.

- Backups de Versões do Banco de Dados:
Aprimorei minhas práticas em relação aos backups de versões do banco de dados, implementando medidas robustas para proteger as informações armazenadas, alinhando-me aos requisitos da LGPD para preservação da integridade e confidencialidade das informações.

- Atualização Contínua e Conformidade:
Estabeleci uma cultura de atualização contínua em relação às diretrizes da LGPD, ajustando políticas e práticas conforme necessário. Mantive-me informado sobre as melhores práticas emergentes em termos de privacidade de dados, garantindo uma postura proativa na conformidade com regulamentações e na proteção dos dados dos usuários.

Os conhecimentos adquiridos não apenas enriqueceram minha experiência, mas também desempenharam um papel significativo na elevação da qualidade e no sucesso deste projeto. Essas aprendizagens foram fundamentais para me preparar e superar desafios multifacetados no desenvolvimento de software, consolidando uma base sólida de conhecimento que se revelou crucial para o êxito dessa empreitada.

</details>
