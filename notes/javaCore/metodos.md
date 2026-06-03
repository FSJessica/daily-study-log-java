# 🔷 O que são métodos

Tecnicamente, um método é apenas uma parte estruturada do código com alguns componentes. 

Exemplo:

    public staticint countSeeds (int parrotWeight, int parrotAge) {
        return parrotWeight / 5 + parrotAge;
    }

Um método contém um conjunto de modificadores, um tipo de retorno, um nome, uma lista de parâmetros entre parenteses e
o corpo do método entre chaves. A combinação do nome do método e a lista de parâmetros é conhecida como a assinatura do
método. No exemplo acima a assinatura é "countSeeds(int, int)".

## Nome do método

Geralmente, o nome de um método reflete o que o método faz.
O nome de um método deve seguir as seguintes regras:

- São case-sensitive;
- Pode incluir unicode, letras, digitos, underscore, ou letras como $.
- Não pode começar com dígitos.
- Não podem conter palavras-chave do Java.

Por convenção também:

- Nomes com apenas uma palavra devem ser um verbo em letras minúsculas. Ex: somar, subtrair, ler.
- Nomes com mais de uma palavra, a primeira letra do segundo (e seguintes) nome, deve ser maiúscula. Ex: calcularNumero.

## Modificadores

Existem doistipos de modificadores: modificadores de acesso e não-modificadores de acesso.
Modificadores de acesso definem a visibilidade de um método. Ex: public
Não modificadores de acesso provém informações sobre o comportamento dos métodos. Ex: static

## Parâmetros de um método

Os parâmetros são colocados entre parênteses, onde são definidos os tipos, quantidade e ordem dos parâmetros

## Corpo e retorno

    public static int countSeeds(int parrotWeight, int parrotAge) {
        return parrotWeight / 5 + parrotAge; // it returns an int
    }

Dentro das chaves se encontra o corpo do método, nele é escrito a lógica implementada no método.
Nem sempre métodos precisam retornar um valor. Quando não queremos que um método apresente um retorno, apenas
realizando as operações, usa-se a palavra-chave void como tipo de retorno.

Exemplo:

    public static void printSeedsCount(int seeds) {
        System.out.println("Give your parrot " + seeds + "g of seeds per day");
    }

Quando os métodos contém condições, você pode usar return pra sair do método.
Exemplo:

    public static void isPositive(int num) {
        if (num > 0) {
            System.out.println("the number is positive");
        } else {
            return;
        }
    }

