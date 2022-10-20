<h1><details>
  
  <summary>Contribuições Pessoais</summary>
  
  ### Heading
  
  Responsável por desenvolver as telas do projeto utilizando Angular. Comecei pesquisando por alguns sites de compras e e-commerce para ter uma       ideia inicial e      
  prosseguir com o desenvolvimento.
  Com isso desenvolvi a primeira tela para cadastro de produtos com requisição do back-end para o front-end, atribuindo os seguintes valores:
  Nome, descrição, preço e categoria.
  Logo adicionei os métodos para editar e excluir o produto
  
  <img></img>
  
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
  Com essa parte finalizada, criei a tela para criar uma nova promoção, para conseguirmos atribuir essa promoção ao um produto. O objetivo foi    
  criar promoções flexíveis de uma forma interativa, deixando o usuário ditar as regras da promoção 
  
  <img></img>
  
</details></h1>
