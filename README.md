# Sistema de Gerenciamento de Contratos

Este é um projeto Java que implementa um sistema de gerenciamento de contratos de trabalhadores. O sistema permite calcular a renda mensal de um trabalhador com base nos contratos que ele possui.

## Descrição

O projeto consiste em três classes principais:

- Trabalhador: representa um trabalhador e contém informações como nome, nível de trabalho, salário e departamento. Essa classe também possui métodos para adicionar e remover contratos, calcular a renda mensal e exibir informações do trabalhador.

- Contrato: representa um contrato de trabalho e contém informações como data, valor por hora e quantidade de horas trabalhadas. Essa classe possui um método para calcular o valor total do contrato.

- Departamento: representa um departamento e contém informações como nome. Essa classe é utilizada para associar um departamento a um trabalhador.

Além disso, o projeto inclui um enum chamado NivelTrabalho, que define os diferentes níveis de trabalho possíveis para um trabalhador (JUNIOR, PLENO, SENIOR).

## Funcionalidades

O sistema de gerenciamento de contratos possui as seguintes funcionalidades:

- Adicionar um novo contrato ao trabalhador.
- Remover um contrato existente do trabalhador.
- Calcular a renda mensal do trabalhador para um determinado ano e mês.
- Exibir as informações básicas do trabalhador, como nome e departamento.

