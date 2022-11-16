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

  Código para cadastro de produto utilizando Observable

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

  ## Código para listagem  de produto com as funcionalidades citadas

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


  Aprendizados Efetivos HS

  ## Heading
  
  Neste projeto aprendi a mexer com Angular, consultando a documentação oficial da tecnologia consegui desenvolver o front-end do projeto. Com isso consegui           distinguir a velocidade de profundidade e velocidade em diferentes métodos de pesquisa e estudo. Diversos tutoriais estão disponíveis ensinando a realizar grande   partes das etapas de projetos deste tipo, e estes conteúdos possuem sua importância. Entretanto, a consulta na documentação das tecnologias se mostrou muito mais   completa, rápida e confiável do que qualquer fonte terceira. Experiência e aprendizado valiosos até hoje.
  Aprendi mais sobre arquitetura de software. Foi a primeira vez em que trabalhei de fato com uma aplicação frontend separada dos serviços chamados de "backend".     Por conta desta experiência, fui inserido a um novo nível de exigência para a contrução de um sistema web, tendo que me preocupar com o formato e conteúdo           específico das requisições possíveis de entrada no serviço desenvolvido.

  - Criação de API que se provê serviços e se comunica com outros aplicações: sei fazer com autonomia

  - Desenvolvimento de scripts em Angular: sei fazer com autonomia 

