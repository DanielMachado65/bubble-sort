# bubble-sort

creating a refactor for bubble sort


## How to run the code

```bash
java Main
```

### Choices to Refactor

1. Nomes Significativos:
    Renomeei arr para array e n para arrayLength para tornar claro o que cada variável representa.
    Alterei trocado para swapped para manter a consistência do idioma e tornar o nome mais intuitivo.

2. Extração de Função:
    Extraí o trecho de código que faz a troca dos elementos para um método separado chamado swap. Isso melhora a legibilidade e a reutilização, além de seguir o princípio de "cada função deve fazer apenas uma coisa".
    
3. Simplificação e Comentários Removidos:
    Removi comentários óbvios que explicavam o que o código fazia. Com nomes de métodos e variáveis mais significativos, os comentários se tornaram desnecessários.
    Mudei a inicialização de variáveis dentro do método bubbleSort, como arrayLength, para evitar a passagem desnecessária de parâmetros e melhorar a clareza.

4. Alteração de classes para Encapsulamento:
    Alterei a classe BubbleSort para encapsular o método bubbleSort e torná-lo privado. Isso torna o código mais legível e fácil de manter, além de tornar o código mais modular e reutilizável. E fazendo **ter apenas uma função** em uma classe, torna mais fácil de ler e entender o código.

5. Extração de Métodos:
    Extração de loop para o método performSinglePass.

6. Testes:
    Adicionado testes para o método bubbleSort.