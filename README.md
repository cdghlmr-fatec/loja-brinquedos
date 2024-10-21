Para rodar locamente:
- crie o banco de dados 'loja_brinquedos'
- execute a aplicação

No MYSQL-CLI execute: 
- INSERT INTO roles (id, name) VALUES (1, 'ROLE_ADMIN'), (2, 'ROLE_USER');
- insert into user_role(user_id, role_id) values (1,1), (1,2);

---

# Loja de Brinquedos - Requisitos Funcionais

## 1. Cadastro e Login de Usuários
- O sistema deve permitir o **cadastro de novos usuários** (nome, e-mail, senha, endereço).
- O sistema deve permitir o **login de usuários registrados**.
- O sistema deve permitir a **recuperação de senha** via e-mail.

## 2. Gestão de Produtos
- O administrador deve poder **adicionar novos produtos** ao catálogo (nome, descrição, preço, quantidade, categoria).
- O administrador deve poder **editar as informações** de produtos já cadastrados.
- O administrador deve poder **excluir produtos** do catálogo.
- O sistema deve **listar todos os produtos** disponíveis para compra, com filtros de pesquisa.
- O sistema deve exibir uma página de **detalhes de cada produto**.

## 3. Carrinho de Compras
- O sistema deve permitir que o usuário **adicione produtos ao carrinho**.
- O sistema deve permitir que o usuário **remova produtos do carrinho**.
- O sistema deve permitir que o usuário **atualize as quantidades** de produtos no carrinho.
- O sistema deve exibir um **resumo do carrinho** com subtotal, impostos e frete.

## 4. Checkout e Pagamento
- O sistema deve permitir que o usuário **finalize a compra**.
- O sistema deve oferecer **diferentes métodos de pagamento** (ex: cartão de crédito, boleto).
- O sistema deve exibir um **resumo do pedido** antes da finalização.
- O sistema deve enviar um **e-mail de confirmação do pedido** para o cliente após a compra.

## 5. Gestão de Pedidos
- O sistema deve permitir que o cliente veja seu **histórico de pedidos**.
- O sistema deve mostrar o **status do pedido** (ex: processando, enviado, entregue).
- O sistema deve permitir que o cliente e o administrador **cancelem pedidos** antes da entrega.

## 6. Pesquisa e Filtros de Produtos
- O sistema deve permitir que o cliente **pesquise produtos** por nome ou descrição.
- O sistema deve permitir que o cliente **filtre produtos** por preço, categoria e faixa etária.

## 7. Avaliação e Comentários de Produtos
- O sistema deve permitir que o cliente **avalie os produtos** com estrelas e comentários após a compra.
- O sistema deve exibir as **avaliações de outros clientes** na página de detalhes do produto.

## 8. Gerenciamento de Estoque (Admin)
- O administrador deve poder visualizar o **estoque disponível** de cada produto.
- O sistema deve **atualizar automaticamente o estoque** após a finalização de um pedido.
- O sistema deve notificar o administrador quando um produto estiver com **estoque baixo**.

## 9. Ofertas e Descontos
- O administrador deve poder **criar cupons de desconto** e promoções.
- O sistema deve permitir que o cliente aplique **cupons de desconto** no checkout.

## 10. Funcionalidades Extras
- O sistema deve permitir que o cliente adicione produtos à **lista de desejos**.
- O sistema deve enviar **notificações de disponibilidade** para o cliente quando um produto fora de estoque voltar a estar disponível.
- O sistema deve permitir que o cliente **compartilhe produtos** em redes sociais.
- O sistema deve oferecer um **chat de suporte** para atendimento ao cliente.

---

# Loja de Brinquedos - Requisitos Não Funcionais

## 1. Desempenho
- O sistema deve **carregar a listagem de produtos** em até 2 segundos para até 1000 produtos.
  
## 2. Segurança
- O sistema deve **criptografar senhas** de usuários no banco de dados.
- O sistema deve implementar **proteção contra ataques de SQL Injection**.

## 3. Usabilidade
- O sistema deve ser **intuitivo e fácil de navegar** tanto para usuários quanto administradores.
- O sistema deve ser **responsivo**, funcionando corretamente em dispositivos móveis.

## 4. Escalabilidade
- O sistema deve suportar **até 10.000 usuários simultâneos** sem perda de desempenho.

---

# Lista de Requisitos Funcionais

1. Cadastro e login de usuários.
2. Gestão de produtos (CRUD).
3. Carrinho de compras (adicionar, remover, atualizar produtos).
4. Finalização de compra e métodos de pagamento.
5. Histórico de pedidos e acompanhamento de status.
6. Pesquisa e filtros de produtos.
7. Avaliação e comentários dos produtos.
8. Gerenciamento de estoque para administradores.
9. Sistema de cupons de desconto e promoções.
10. Funcionalidades extras (lista de desejos, notificações, compartilhamento em redes sociais, chat de suporte).

---

Você pode usar essa lista para criar as issues no GitHub e acompanhar o progresso de cada funcionalidade. Quer ajustar algum requisito ou detalhar alguma parte?
