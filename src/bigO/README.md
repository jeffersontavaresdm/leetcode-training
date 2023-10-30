### Pacote destinado a estudar a complexidade do tempo de algoritmos

#### Alguns tipos de complexidade:

- O(1): Constante. Isso significa que o tempo de execução não depende do tamanho da entrada.
  - Exemplo: busca por um elemento em uma matriz ordenada, onde o tempo é constante porque você pode encontrar o elemento diretamente usando a busca binária.
- O(log n): Logarítmica. O tempo de execução cresce de forma lenta à medida que o tamanho da entrada aumenta. 
  - Exemplo: busca binária.
- O(n): Linear. O tempo de execução é diretamente proporcional ao tamanho da entrada. 
  - Exemplo: percorrer uma lista ou matriz em busca de um elemento.
- O(n log n): Quase linear. É mais rápida do que uma complexidade puramente linear, mas ainda cresce de forma eficiente. 
  - Exemplo: algoritmos de ordenação eficientes como o Merge Sort e o Quick Sort.
- O(n^2): Quadrática. O tempo de execução cresce rapidamente à medida que o tamanho da entrada aumenta.
  - Exemplo: algoritmos de ordenação ineficientes como o Bubble Sort.
- O(2^n): Exponencial. O tempo de execução cresce de forma exponencial com o tamanho da entrada. Geralmente, isso é considerado ineficiente.
  - Exemplo: algoritmos recursivos de força bruta.
- O(n!): Fatorial. O tempo de execução cresce de forma muito rápida à medida que a entrada aumenta.
  - Exemplo: resolução de problemas de permutação.

#### 3 passos para calcular a complexidade:

- Levar em consideração apenas as repetições do código
- Verificar a complexidade das funções/métodos próprios da linguagem (se utilizado)
- Ignorar as constantes e utilizar o termo de maior grau