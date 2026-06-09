# Estruturas de Dados
*By NUNES*

---

## Introdução

> Muitas estruturas são abstrações sobre outras.

**O que são estruturas de dados?**
É uma forma pela qual os dados são organizados de modo que possam ser acessados e/ou manipulados de forma eficiente.

---

## Array

Coleção com quantidade **fixa** de elementos onde a ordem importa.

```
Índice:  [0]  [1]  [2]  [3]  [4]  [5]
Valor:   [42] [17] [99] [ 5] [88] [ 3]
                ↑
          acesso direto por índice
```

- Acesso rápido por índice
- Inserção/remoção no meio → move elementos

---

## Linked List

Cada elemento (node) aponta para o próximo. Sem memória contígua.

```
[dado|•]──→[dado|•]──→[dado|•]──→[dado|null]
  node 0      node 1      node 2      node 3
```

- Inserção/remoção → move ponteiros
- Acesso por índice → percorre a lista

---

## Stack

Coleção onde o **último a entrar é o primeiro a sair** — LIFO (*Last In, First Out*).

```
     topo
  ┌────────┐
  │   C    │ ← push / pop
  ├────────┤
  │   B    │
  ├────────┤
  │   A    │
  └────────┘
```

- `push` → insere no topo
- `pop`  → remove do topo
- Acesso apenas ao topo

---

## Queue

Coleção onde o **primeiro a entrar é o primeiro a sair** — FIFO (*First In, First Out*).

```
enqueue →  [ A | B | C | D ]  → dequeue
           entrada           saída
```

- `enqueue` → insere no fim
- `dequeue` → remove do início
- Entrada e saída em lados opostos

---

## Tree

Estrutura hierárquica de nós.

```
          [root]
         /      \
      [node]  [node]
      /    \
  [left] [right]
```

- Cada nó pode ter filhos (esquerdo e direito em árvores binárias)
- Raiz (*root*) é o único nó sem pai

---

## HashMap

Armazena pares **chave → valor**. A chave é transformada por uma *hash function* em um índice que aponta para um *bucket* do array interno.

```
 key        hash fn      bucket (array interno)
"nome"  ──→  h("nome") ──→  índice 3  ──→  ["nome": "Ana"]
"idade" ──→  h("idade") ──→ índice 7  ──→  ["idade": 25]
"city"  ──→  h("city")  ──→ índice 3  ──→  colisão! → encadeamento
```

**Hash function:**
- Transforma a key em um índice
- Distribui os dados da forma mais uniforme possível
- Determinística: mesma key → mesmo hash

**Colisão:** quando duas keys geram o mesmo índice (*bucket*). Resolvida via encadeamento ou endereçamento aberto.

---

## Heap

Árvore binária **completa** e **parcialmente ordenada**, geralmente implementada com array.

```
         MaxHeap              MinHeap
           [90]                 [1]
          /    \               /   \
        [50]  [80]           [3]   [2]
        /  \                /  \
      [30] [40]           [6]  [5]

  pai >= filhos          pai <= filhos
```

- Parcialmente ordenada (não é totalmente ordenada como BST)
- Funciona como uma *priority queue*

---

## Grafo

Estrutura de **conexões livres** entre nós (vértices), ligados por arestas.

```
    (A)──────(B)
     |  \   / |
     |   (E)  |
     |  /   \ |
    (C)──────(D)
```

- Vértices (*nodes*) + Arestas (*edges*)
- Pode ser dirigido (setas) ou não dirigido
- Pode ter pesos nas arestas
- Não há hierarquia obrigatória (diferente da Tree)
