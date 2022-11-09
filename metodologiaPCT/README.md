<h1><details>
  
  <summary>Contribuições Pessoais</summary>
  
  ### Heading
  
  Responsável por desenvolver as telas do projeto utilizando Angular. Comecei pesquisando por alguns sites de compras e e-commerce para ter uma ideia inicial e prosseguir com o desenvolvimento. Com isso desenvolvi a primeira tela para cadastro de produtos com requisição do back-end para o front-end, atribuindo os seguintes valores:
  Nome, descrição, preço e categoria.
  
  ### Some Code
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
  Com essa parte finalizada, criei a tela para criar uma nova promoção, para conseguirmos atribuir essa promoção ao um produto. O objetivo foi criar promoções flexíveis de uma forma interativa, deixando o usuário ditar as regras da promoção e podendo alterar sua regra editando ou até mesmo deletando e criando uma nova.

  ### Some Code 
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
  O processo de estudo e implementação do código em testes práticos necessitou de consultas à documentação oficial do Angular. Em poucas semanas, a implementação foi finalizada, realizando as etapas explicadas nos capítulos anteriores.
  
  
</details></h1>

<h1><details>

  <summary>Aprendizados Efetivos HS</summary>

  ### Heading
  Neste projeto aprendi a mexer com Angular, consultando a documentação oficial da tecnologia consegui desenvolver o front-end do projeto. Com isso consegui distinguir a velocidade de profundidade e velocidade em diferentes métodos de pesquisa e estudo. Diversos tutoriais estão disponíveis ensinando a realizar grande partes das etapas de projetos deste tipo, e estes conteúdos possuem sua importância. Entretanto, a consulta na documentação das tecnologias se mostrou muito mais completa, rápida e confiável do que qualquer fonte terceira. Experiência e aprendizado valiosos até hoje.
  Aprendi mais sobre arquitetura de software. Foi a primeira vez em que trabalhei de fato com uma aplicação frontend separada dos serviços chamados de "backend". Por conta desta experiência, fui inserido a um novo nível de exigência para a contrução de um sistema web, tendo que me preocupar com o formato e conteúdo específico das requisições possíveis de entrada no serviço desenvolvido.

  - Criação de API que se provê serviços e se comunica com outros aplicações: sei fazer com autonomia

  - Desenvolvimento de scripts em Angular: sei fazer com autonomia 

</details></h1>