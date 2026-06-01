8# 🔷 O são Arrays?

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

## Processando Arrays Usando loops

É de grande utilidade processar Arrays através de um loop.
Exemplo:

    int n = 10;
    int[] squares = new int[n];

    System.out.println(Arrays.toString(squares));

    /* iterando o array */
    for (int i = 0; i < squares.length; i++) {
        squares[i] = i * i;
    }
    System.out.println(Arrays.toString(squares));
    // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]

Também é possível usar while e do while para iterar Arrays, apesar de ser menos comum. 

## Usando for-each loop

É usado para iterar sobre cada elemento do array, string ou collection, com ele não precisa lidar com índices. 
Tem algumas limitações também, por exemplo, com for each você não pode modificar um array porque a variável que se usa na iteração não contém o elemento de fato, apenas a cópia. Você também não pode recuperar um elemento pelo index, já que o index não é utilizado. Também não é possível mover pelo array mais de um passo por iteração, precisa ser por cada elemento, um por um.

Exemplo: 


    for (type var : array) { 
        //statements using var
    }

Uma comparação entre for-each e for:

FOR-EACH:

    char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

    int counter = 0;
    for (char ch : characters) {
        if (ch == 'a') {
            counter++;
        }
    }

    System.out.println(counter); // output "3"

FOR:

    char[] characters = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};

    int counter = 0;
    for (int i = 0; i < characters.length; i++) {
        if (characters[i] == 'a') {
            counter++;
        }
    }

    System.out.println(counter); // output "3"