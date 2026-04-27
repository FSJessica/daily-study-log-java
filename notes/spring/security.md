# 🔷 Jwt (JSON Web Token)

## O que é
* Funciona como um crachá, uma comprovação de identidade.
* Armazena objetos JSON
* 3 componentes: header , payload e signature

## Pra que serve

* Essencial para autenticação do usuário numa aplicação, é como uma assinatura digital.

## Usos

* Em cenários de autorização digital

#  🔷 UserDetails e UserDetailsService

## O que é

- UserDetails é uma interface que representa um usuário no sistema
- UserDetailsService também é uma interface que busca um usuário dentro de um banco de dados.
- Fazem parte do Spring Security.

## Pra que serve

- Autenticação de  usuário

## Usos

- Em Login: Cliente envia  username e senha, o spring usa o UserDetailsService para buscar o usuário,
  retorna um UserDetails, a senha é validada.