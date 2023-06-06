# Sistema de Gerenciamento de Pedidos

Este é um projeto Java que implementa um sistema de gerenciamento de pedidos de clientes. O sistema permite criar pedidos, adicionar itens aos pedidos e calcular o preço total do pedido.

## Descrição

O projeto consiste em quatro classes principais:

- `Cliente`: representa um cliente e contém informações como nome, e-mail e data de nascimento. Essa classe também possui um método para exibir as informações do cliente.

- `Pedido`: representa um pedido e contém informações como momento, status e uma lista de itens. Essa classe possui métodos para adicionar e remover itens do pedido, calcular o preço total do pedido e exibir um resumo do pedido.

- `Item`: representa um item do pedido e contém informações como quantidade, preço e o produto associado. Essa classe possui um método para calcular o subtotal do item.

- `Produto`: representa um produto e contém informações como nome e preço.

Além disso, o projeto inclui um enum chamado `Status`, que define os diferentes status possíveis para um pedido (`PENDENTE_PAGAMENTO`, `PROCESSANDO`, `ENVIADO`, `ENTREGUE`).

## Funcionalidades

O sistema de gerenciamento de pedidos possui as seguintes funcionalidades:

- Registrar os dados do cliente, como nome, e-mail e data de nascimento.
- Criar um novo pedido informando o status.
- Adicionar itens ao pedido, fornecendo informações como nome do produto, preço e quantidade.
- Remover itens do pedido.
- Calcular o preço total do pedido.
- Exibir um resumo do pedido, incluindo momento do pedido e status.
- Exibir os dados do cliente.
- Exibir os itens do pedido, incluindo nome do produto, preço, quantidade e subtotal.

O sistema utiliza a classe `Scanner` para obter os dados do cliente e dos itens do pedido a partir da entrada do usuário.


