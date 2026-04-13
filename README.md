## 📌 Descrição

Este repositório apresenta a implementação de um TAD de Playlist Musical em Java utilizando listas sequenciais (arrays). O objetivo é praticar conceitos fundamentais de estrutura de dados, como manipulação de índices, controle de capacidade e lógica de deslocamento (shift) para inserção e remoção de músicas.

O projeto demonstra como os dados são organizados sequencialmente na memória e como as operações funcionam internamente, garantindo que a playlist permaneça sempre compactada.

---

## 🛠 Recursos Utilizados

Linguagem: Java
IDE: IntelliJ IDEA
Controle de versão: Git
Plataforma de hospedagem: GitHub

---

## 📋 Estrutura do Código

O projeto está organizado nas seguintes partes:

---

## 🔹 Interface PlaylistTAD

Define as operações da playlist, como:

Inserção (adicionar música no final ou em posição específica)
Remoção (remover do final ou de uma posição)
Busca e consulta (buscar, obter, verificar existência)
Verificações de estado (lista cheia, vazia, tamanho)

---

## 🔹 Classe Playlist

Responsável por implementar a lista sequencial, contendo métodos de:

Inserção (adicionar música e adicionar em posição)
Remoção (remover música e remover por posição)
Busca (buscar e obter)
Verificação (estaVazia, estaCheia, tamanho, contem)

🔹 Utiliza deslocamento (shift) para manter a lista organizada.

---

## 🔹 Classe Main

Responsável por testar todas as operações implementadas e validar o funcionamento da playlist.

---

## ⚙️ Observações sobre a implementação

A lista é baseada em um array de tamanho fixo.
As operações utilizam lógica de deslocamento (shift) dos elementos.
O controle é feito pela variável `tamanho`.
Possui tratamento de erros (lista cheia, vazia e posições inválidas).

---

## ▶️ Logs de Execução

```
Tamanho: 3
Musica 0: 10
Musica 1: 15
Musica 2: 20

Após remover:
Musica 0: 10
Musica 1: 20

Contém 20? true
```

---

## 👨‍💻 Autor

Marcos Antonio
Curso: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
Disciplina: Estrutura de Dados I
