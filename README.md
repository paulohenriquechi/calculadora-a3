# Unidade Curricular de Programação de Soluções Computacionais
2º Semestre de 2022

Prof. Flávio Augusto Rezende Calado e 
Prof. Alexandre de Oliveira

# Projeto A3 
Nome: Paulo Henrique Chi

RA: 8222242190

Leia atentamente o texto abaixo:

Um cliente nos solicitou um orçamento de um site, com duas telas e um login. Já é o quinto esse mês. Com tantos orçamentos de sites para fazer, você, e sua empresa pensaram em uma forma de simplificar o processo de criação dessas propostas. Para tal, foi proposto que fosse construída uma calculadora de projetos de TI que pudesse acelerar o processo de confecção de
propostas.

## Para isso, foram levantados vários requisitos para este projeto:

1. O sistema deve possuir uma estrutura que represente
os dados do desenvolvedor, colocando seu nome, quantidade
de horas disponíveis no dia e valor mensal desejado
2. O sistema deverá calcular a quantidade de horas
trabalhadas no mês, tomando por base a seguinte fórmula:
VH = VMD/(20 * HDD) , onde
VH = Valor Hora
VMD = Valor Mensal Desejado
HDD = Horas Diárias Disponíveis
3. O sistema deve contemplar itens de um sistema. Os
itens do sistema podem ser dos seguintes tipos:
a. Telas com entradas e saídas de dados;
b. Telas de consultas com informação de dados;
c. Gravação de dados;
d. Algoritmos com processamentos;
4. Cada item do sistema deverá ter, além de seu tipo, o
nome e um grau de dificuldade, indo de 1 a 3.
5. Cada item de sistema deverá ter um esforço em horas
6. O sistema deverá calcular o valor da proposta, da
seguinte maneira:
a. Somar a quantidade de horas de todas as horas dos
itens que forem levantados;
b. Multiplicar pelo valor hora do desenvolvedor;
c. Acrescentar ao total, 30% como gestão, encargos e
risco.

# Atividade 

1) Criar um programa Java, com uma classe que represente os dados do desenvolvedor, colocando seu nome, quantidade de horas disponíveis no dia e valor Mensal Desejado
2) A classe do desenvolvedor deverá calcular a quantidade de horas trabalhadas no mês, tomando por base a seguinte fórmula:
* a. VH = VMD/(20 * HDD) , onde
* i. VH = Valor Hora
* ii. VMD = Valor Mensal Desejado
* iii. HDD = Horas Diárias Disponíveis
3) Criar uma classe Java, que represente um item de um sistema. Os itens do sistema podem ser dos seguintes tipos:
* a. Telas com entradas e saídas de dados;
* b. Telas de consultas com informação de dados;
* c. Gravação de dados;
* d. Algoritmos com processamentos;
4) Cada item do sistema deverá ter, além de seu tipo, o nome e um grau de dificuldade, indo de 1 a 3.
5) Cada item de sistema deverá ter um esforço em horas, calculado da seguinte maneira:

Tipo de Item de sistema | Dificuldade | Quantidade de horas 
----------------------- | ----------- | -------------------
Telas com entradas e saídas de dados | 1 | 8
Telas com entradas e saídas de dados | 2 | 12
Telas com entradas e saídas de dados | 3 | 16
Telas de consultas com informação de dados | 1 | 4 
Telas de consultas com informação de dados | 2 | 6 
Telas de consultas com informação de dados | 3 | 8 
Gravação de dados | 1 | 16 
Gravação de dados | 2 | 24
Gravação de dados | 3 | 36

6) Criar uma classe Java Orcamento que armazena a informação do orçamento final com os dados do desenvolvedor, o total de horas e o custo final do projeto
7) O sistema deve permitir que o usuário insira os dados do desenvolvedor
8) O sistema deve permitir que o usuário escolha quantos itens serão incluídos na proposta desejar
9) Ao final, o sistema deverá calcular o valor do sistema, da seguinte maneira:
* a. Somar a quantidade de horas de todas as horas dos itens que forem levantados;
* b. Multiplicar pelo valor hora (VH) do desenvolvedor;
* c. Acrescentar ao total, 30% como gestão, encargos e risco.
10) Criar uma classe Java para promover a conexão com o banco de dados
11) Criar um comando SQL para criar a tabela de Orcamento
12) Criar um comando SQL para inserir, na tabela Orcamento, os dados do projeto calculado no sistema

IMPORTANTE: não é necessário que os demais dados (informações do
desenvolvedor, informações dos itens de software) sejam
armazenados no banco de dados

## Entrega
1. (2 pontos) Criação de um único repositório no GitHub por
cada grupo
2. (2 pontos) informar, no arquivo README.md do repositório,
os nomes completos e os RAs dos integrantes
3. (6 pontos) Todas as classes solicitadas na atividade
(incluindo a classe com o método Main)
4. (8 pontos) Todos os métodos e atributos para a realização
dos requisitos
5. (2 pontos) Todos os comandos SQL solicitados (crie um
arquivo com o nome do comando e a extensão SQL. Ex:
TabelaOrcamento.SQL)
