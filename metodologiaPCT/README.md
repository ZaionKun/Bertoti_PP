  # Zaion Felippe Gomes Arruda
  
  ## Introdução
  
  Olá, seja bem vindo! Sou o Zaion Felippe, estudante de Banco de dados pela FATEC Prof. Jessen Vidal. 
  
  Tenho 19 anos e trabalho como Assistente de Projetos e Logística. <br/>
  
  <img src="https://avatars.githubusercontent.com/u/81268185?v=4" height="300" width="250"/>
  
  ### Meus principais conhecimentos
  
  ### Python
  
  Python é a linguagem de programação que eu mais tenho conhecimento, fiz vários projetos utilizando alguns frameworks como o Flask, Django, Pandas entre outros.
  Atualmente trabalho com essa linguagem e com isso tenho uma segurança para desenvolver soluções e inovações.
  
  ### VBA 
  
  VBA foi a primeira linguagem que estudei, ainda antes da graduação. Mesmo nunca tendo atuado profissionalmente com VBA, realizei diversos projetos pessoais
  e isso me ajudou na minha carreira pessoal. É uma linguagem que me sinto confortavél em desenvolver qualquer coisa
  
  # Projeto 1: 1º Semestre de 2021
  
  ### Parceiro Acadêmico
  A definir
  
  ### Descrição do Projeto
  
Este projeto tem como objetivo criar um assistente virtual financeiro para ajudar pessoas a gerenciar melhor suas finanças pessoais. O assistente virtual será capaz de se comunicar com o usuário por meio de comandos de voz ou texto, e terá acesso a informações financeiras do usuário, como contas bancárias, cartões de crédito e investimentos.
  
  ### Tecnologias adotadas na solução
  ### Python
  Neste projeto de assistente virtual financeiro, a tecnologia Python foi utilizada como linguagem de programação para a criação do software. Python é uma linguagem de programação de alto nível, com sintaxe simples e de fácil leitura, que é amplamente utilizada no desenvolvimento de soluções tecnológicas. É uma escolha popular para desenvolvimento de assistentes virtuais, pois tem uma grande variedade de bibliotecas disponíveis para processamento de linguagem natural, reconhecimento de voz, acesso a APIs de serviços financeiros, dentre outras funcionalidades.
  
  ### Contribuições Pessoais
  O método de perfil de investidor é uma técnica usada no mercado financeiro para classificar investidores de acordo com seu apetite ao risco. Para o projeto do assistente virtual financeiro, desenvolvi uma abordagem para determinar o perfil de investidor do usuário com base em perguntas-chave que ajudam a avaliar o grau de aversão ou tolerância ao risco de cada indivíduo.

Essa abordagem foi implementada no código Python do assistente virtual financeiro, permitindo que o sistema avalie as respostas do usuário às perguntas e determine o perfil de investidor correspondente. Com base nessa informação, o assistente virtual pode fornecer sugestões de investimento adequadas ao perfil de risco do usuário e seus objetivos financeiros

<details>
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


    if p1 == 'SIM':
        result +=2
    else:
        result +=1
    if p2 == 'SIM':
        result +=2
    else:
        result +=1
    if p3 == 'SIM':
        result +=2
    else:
        result +=1
    if p4 == 'SIM':
        result +=2
    else:
        result +=1
    if p5 == 'SIM':
        result +=2
    else:
        result +=1
    if p6 == 'SIM':
        result +=2
    else:
        result +=1


    if result <8:
        sai_som(f'Você é um investidor Iniciante pois sua pontuação foi de {result} pontos!')
    if result >= 8 and result <10:
        sai_som(f'Você é um investidor Pleno pois sua pontuação foi de {result} pontos!')
    if result >= 10:
        sai_som(f'Você é um investidor Experiente pois sua pontuação foi de {result} pontos!')
        
</details>

O usuário pode fornecer ao assistente virtual o ticker da empresa desejada e, com base nessas informações, o sistema irá buscar o código de ação correspondente.
Com essa funcionalidade, o usuário pode acessar facilmente informações atualizadas sobre empresas que deseja investir, tornando mais fácil e rápido tomar decisões financeiras informadas.

<details>
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
</details>
  
 ## Aprendizados Efetivos HS
 Eu aprendi a desenvolver em Python utilizando APIs, o que me permitiu criar soluções tecnológicas que interagem com serviços externos de maneira eficiente e confiável. API (Interface de Programação de Aplicativos) é um conjunto de rotinas, protocolos e ferramentas para construir software e aplicações que interagem com outros serviços. É uma maneira eficaz de integrar diferentes sistemas e plataformas, permitindo que desenvolvedores possam construir soluções tecnológicas complexas de maneira mais simples. Durante o meu aprendizado, tive a oportunidade de trabalhar com APIs disponíveis na web, como APIs de serviços financeiros, APIs de serviços de redes sociais, dentre outras. Aprendi a usar bibliotecas Python, como requests e urllib, para fazer requisições HTTP às APIs, processar as respostas e extrair as informações relevantes.Ao trabalhar com APIs em Python, pude desenvolver projetos que se beneficiam da integração com serviços externos, como por exemplo, o assistente virtual financeiro que descrevemos anteriormente. Foi possível acessar informações atualizadas de serviços financeiros, como cotações de ações e índices, e incorporá-las ao sistema do assistente virtual para fornecer recomendações personalizadas ao usuário.
A capacidade de integrar diferentes serviços em uma solução tecnológica é uma habilidade valiosa para qualquer desenvolvedor, e o conhecimento em Python e APIs é uma combinação poderosa para o desenvolvimento de soluções inovadoras e eficientes.

  # Projeto 2: 2º Semestre de 2021
  
  ### Parceiro Acadêmico
  Necto Systems
  
   ### Descrição do Projeto
 A aplicação em questão tem como objetivo principal coletar métricas de um ou mais Sistemas Gerenciadores de Banco de Dados remotos, em intervalos regulares de tempo. Essas métricas incluem informações relevantes para o gerenciamento e manutenção desses sistemas, como por exemplo, uso de CPU, uso de memória, número de conexões, tempo de resposta, entre outras.

Ao coletar essas informações de forma periódica, a aplicação permite que o usuário tenha acesso a uma série histórica de dados, que pode ser utilizada para identificar padrões de uso, detectar problemas e avaliar o desempenho dos SGBDs ao longo do tempo. Com base nessas informações, o usuário poderá tomar decisões quanto à necessidade de manutenções, balanceamento e aumento de capacidade, bem como melhorias na infraestrutura (servidores), de forma a garantir a disponibilidade e a eficiência dos sistemas gerenciados pelo SGBD.

### Tecnologias adotadas na solução
### Java 
Java é uma linguagem de programação amplamente utilizada no desenvolvimento de aplicativos corporativos. Uma das suas principais vantagens é a portabilidade, ou seja, o código escrito em Java pode ser executado em diferentes plataformas sem a necessidade de adaptações significativas.

Na aplicação em questão, a escolha da linguagem Java pode ter sido motivada por várias razões. Uma delas é a sua ampla disponibilidade de bibliotecas e frameworks para o desenvolvimento de aplicativos de coleta de dados e análise de métricas, o que pode ter acelerado o processo de desenvolvimento da aplicação.
 
###PostgreSQL
a tecnologia PostgreSQL foi utilizada como o sistema gerenciador de banco de dados para armazenar e gerenciar as métricas coletadas pelos servidores remotos. O PostgreSQL é uma opção popular e avançada de sistema de gerenciamento de banco de dados relacional de código aberto, que oferece recursos avançados, incluindo suporte a SQL avançado, extensibilidade, replicação, transações e integridade referencial.

 ### Contribuições Pessoais
Responsável por desenvolver consultas SQL que permitiu a exibição do tamanho das tabelas e do banco de dados na aplicação. Esses itens foi identificado como uma das "dores" do projeto, ou seja, uma necessidade importante a ser atendida para a efetividade da ferramenta.

Por meio da sua consulta, os usuários da aplicação puderam obter informações precisas sobre o tamanho de cada tabela individualmente, permitindo uma melhor gestão do espaço em disco utilizado pelo sistema de gerenciamento de banco de dados.

<details>
public static void ExibirTamanhoTabelas(Connection con) {
		String sql = "SELECT esquema, tabela,\r\n"
				+ "       pg_size_pretty(pg_relation_size(esq_tab)) AS tamanho,\r\n"
				+ "       pg_size_pretty(pg_total_relation_size(esq_tab)) AS tamanho_total\r\n"
				+ "  FROM (SELECT tablename AS tabela,\r\n"
				+ "               schemaname AS esquema,\r\n"
				+ "               schemaname||'.'||tablename AS esq_tab\r\n"
				+ "          FROM pg_catalog.pg_tables\r\n"
				+ "         WHERE schemaname NOT\r\n"
				+ "            IN ('pg_catalog', 'information_schema', 'pg_toast') ) AS x\r\n"
				+ " ORDER BY pg_total_relation_size(esq_tab) DESC;";
		
		try {
			PreparedStatement pesquisa = con.prepareStatement(sql);
			ResultSet result = pesquisa.executeQuery();
			
			while(result.next()) {
				System.out.println("==========================================================");
				System.out.println("NOME: " + result.getString("tabela") + "\n");
				System.out.println("TAMANHO: "+result.getString("tamanho") + "\n");
				System.out.println("TAMANHO TOTAL: " + result.getString("tamanho_total")); //Tempo somado de todas as selects
				System.out.println("==========================================================");
			}
		}
		catch(Exception e) {
			
		}
	}
</details>

Consulta para retornar o tamanhao do banco de dados

<details>
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

</details>

## Aprendizados Efetivos HS
Durante o desenvolvimento do projeto, tive a oportunidade de aprender a utilizar um sistema de gerenciamento de banco de dados (SGBDs), a fim de coletar e manipular informações para a geração de séries históricas e métricas importantes para os usuários da aplicação.
Com essa experiência, aprimorei minhas habilidades em manipulação de dados em ambiente de banco de dados, desenvolvendo consultas SQL e outros comandos para obter informações específicas e relevantes. Além disso, também tive a oportunidade de conhecer ferramentas de gerenciamento de banco de dados, como o PostgreSQL, e aprender a utilizá-las de maneira efetiva. Com isso contribui para o desenvolvimento da aplicação, criando consultas e rotinas que permitiram a coleta de métricas importantes, tais como o tamanho das tabelas e do banco de dados
 
  # Projeto 3: 3º Semestre de 2022
  
  ### Parceiro Acadêmico
  MidAll LTDA
  
  ### Descrição do Projeto
  
  A ideia é criar um mini motor de regras com uma interface onde as regras das promoções possam ser cadastradas e aplicadas no momento que os itens forem para o     
  carrinho de compras. Alguns exemplos de mecânicas: compre 2 produtos e tenha 10% de desconto. Na compra de 2 produtos, ganhe mais 1. Na compra de 3 produtos, 
  ganhe 50% de desconto no item de menor valor.
  
  ### Tecnologias adotadas na solução
  
  ### Spring boot
  O funcionamento do e-commerce foi construído utilizando o Spring Boot.
  O Spring Boot é um framework Java open source que tem como objetivo facilitar esse processo em aplicações Java. Consequentemente, ele traz mais agilidade para o 
  processo de desenvolvimento, uma vez que devs conseguem reduzir o tempo gasto com as configurações iniciais.
  
  ### Angular 
  Para visualização da aplicação foi utilizado Angular.
  Angular é uma plataforma e framework para construção da interface de aplicações usando HTML, CSS e, principalmente, JavaScript, criada pelos desenvolvedores da 
  Google. Ele possui alguns elementos básicos que tornam essa construção interessante.
  
  ### SQLite
  Para persistências dos dados foi utilizado o SQLite.
  SQLite é uma biblioteca em linguagem C que implementa um banco de dados SQL embutido. Programas que usam a biblioteca SQLite podem ter acesso a banco de dados SQL 
  sem executar um processo SGBD separado
  
<h1>

  ## Contribuições Pessoais 
  Responsável por desenvolver requisições na tela de cadastro de produto, onde o usuário inseria
  dados nos campos da tela e com isso a aplicação passava as informações pro back-end e com isso a aplicação pegava a resposta dos mesmos métodos do back-end e mostrava na tela pro usuário. Nessa parte o usuário precisava preencher os seguintes campos para cadastrar um novo produto:
  - Nome
  - Preço
  - Descrição
  - Categoria

Por padrão do angular, utilizei o Observable para lidar com a variedade de operações assíncronas. Chamando o módulo HTTP para com solicitações e respostas AJAX.
  
<details>

  Com um construtor utilizando dos métodos do HttpClient para inserir um novo cadastro de produto. Para a construnção utilizei o  Observable. No cadastro do  
  produto era necessário passar alguns parâmetros, como o disconto, nome, preço, descrição e informar a categoria do produto.

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
  
</details>

  </h1>
  
Com a parte de cadastrar um novo produto, foi necessário mostrar os produtos em uma lista, para melhor controle do usuário, sendo assim, mostrando opções de edição e remoção de cada produto  
  
<details>

  ## Código para listagem  de produto com as funcionalidades citadas, utilizando o método GET para retornar os produtos registrados no sistema e com isso pegando 
  seu identificador para fazer as funcionalidades, como editar e excluir.

  ```js
  
  export class ProductsListComponent implements OnInit {

  products : Product[] = []
  id: number;
  lista : number[] = [1,2,3,4,5];
  selectedProduct : Product;
  success : string;
  failed : string;

  constructor(private service: ProductsService) { }

  ngOnInit(): void {
    this.service
      .getProducts()
      .subscribe( res => this.products = res )
  }

  addProduct(product : Product){

    if(product.quantidade != null){ 
      Cart.products.push(product);
    }
    
    this.ngOnInit();
  }

  preDelete(product : Product){
    this.selectedProduct = product;

  }

  deleteProduct(){
    this.service.delete(this.selectedProduct)
    .subscribe(
      res => {this.success = 'Product successfully deleted',
      this.ngOnInit();
    },
      erro => this.failed = 'There was an error deleting the Product'
      )

  }
  }

  ```

</details>

Com essa parte finalizada, fiz o mesmo para criar uma nova promoção, para conseguirmos atribuir essa promoção ao um produto. O objetivo foi criar promoções flexíveis de uma forma interativa, deixando o usuário ditar as regras da promoção e podendo alterar sua regra editando ou até mesmo deletando e criando uma nova.
Então peguei a lista de promoções, com o valor que foi dado pelo usuário, e atribui o valor com o tipo da promoção
  
<details>
  
    ```js

    @Output() productsEmitter = new EventEmitter();
    productPromotion : ProductPromotion
    success: boolean = false;

    errors: String[];
    id : number;
    lista_promotion : String[] = ['PRODUCT','TOTAL','PRODUCT_QUANTITY'];
    lista_type: String[] = ['VALUE', 'PERCENTAGE'];
    p1: boolean = true;
    p2: boolean = true;
    p3: boolean = true;
    p4: boolean = true;
    receivePromotion : string = "teste"; 


      pegaValor(){ // Função que foi chamada
        this.receivePromotion = this.productPromotion.receivePromotion;
        if(this.receivePromotion == 'PRODUCT'){
          this.p1 =false;
        }
        if(this.receivePromotion == 'PRODUCT_QUANTITY'){
          this.p2 =false;
          this.p1 =false;
        }
        if(this.receivePromotion == 'TOTAL'){
          this.productPromotion.product=1;
          this.p3 =false;
        }

      }

    ```
 
</details>
  
O processo de estudo e implementação do código em testes práticos necessitou de consultas à documentação oficial do Angular. Em poucas semanas, a implementação foi finalizada, realizando as etapas explicadas nos capítulos anteriores.



  ## Aprendizados Efetivos HS
  
  Neste projeto aprendi a mexer com Angular, consultando a documentação oficial da tecnologia consegui desenvolver o front-end do projeto. Com isso consegui           distinguir a velocidade de profundidade e velocidade em diferentes métodos de pesquisa e estudo. Diversos tutoriais estão disponíveis ensinando a realizar grande   partes das etapas de projetos deste tipo, e estes conteúdos possuem sua importância. Entretanto, a consulta na documentação das tecnologias se mostrou muito mais   completa, rápida e confiável do que qualquer fonte terceira. Experiência e aprendizado valiosos até hoje.
  Aprendi mais sobre arquitetura de software. Foi a primeira vez em que trabalhei de fato com uma aplicação frontend separada dos serviços chamados de "backend".     Por conta desta experiência, fui inserido a um novo nível de exigência para a contrução de um sistema web, tendo que me preocupar com o formato e conteúdo           específico das requisições possíveis de entrada no serviço desenvolvido.

  - Criação de API que se provê serviços e se comunica com outros aplicações: sei fazer com autonomia

  - Desenvolvimento de scripts em Angular: sei fazer com autonomia 
  
