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

