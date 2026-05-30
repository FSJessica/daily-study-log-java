# 🔷 O são Arrays?

Em Java é possível você processar múltiplos objetos do mesmo tipo, salvando eles num array.
Um Array é uma coleção de elementos do mesmo tipo. Os elementos são armazenados na memória sequencialmente.
Todos os elementos nessa coleção estão sob o mesmo nome, e o número de elementos num array é estabelecido quando ele é criado, e não pode ser modificado. Mas o elemento armazenado pode ser modificado.

Regras importantes do array em java:

- Um array é um "reference type".
- Todos os elementos do array são armazenados de maneira sequencial.
- Cada elemento pode ser acessado pelo número de index, começando sempre pelo 0.
- O último elemento sempre é acessado pelo index -1.
- É possível criar um array pra armazenar elementos de qualquer tipo.

## Declarando um array

    int[] array; //declaração tipo 1

ou:

    int array[]; //declaração tipo 2, menos comum.

## Incluindo elementos

    int[] numbers = {1,2,3,4};

ou:

    int a=1, b=2, c=3, d=4;
    int[] numbers = {a,b,c,d};
   
## Usando new

    int n = ...;
    int[] numbers = new int[n];

É possível deparar declaração e instanciação em duas linhas:

    int[] numbers;
    numbers = new int[n];

para obter o tamanho de um array existente, acesse a propriedade arrayName.length.

    int[]array = {1,2,3,4};
    int length = array.length;
    System.ou.println(length);

## Acessando os elementos

Indexes de um array tem números de 0 -1. Você pode acessar os valores buscando pelo index.

    int[] numbers = new int[3]; // numbers: [0, 0, 0]
    numbers[0] = 1; // numbers: [1, 0, 0]
    numbers[1] = 2; // numbers: [1, 2, 0]
    numbers[2] = numbers[0] + numbers[1]; // numbers: [1, 2, 3]; 

Se tentar acessar um valor em um index inexistente, o programa joga o erro:

    ArrayIndexOutOfBoundsException.