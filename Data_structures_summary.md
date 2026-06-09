# Data Structures
*By NUNES*

---

## Introduction

> Many structures are abstractions over others.

**What are data structures?**
It is a way in which data is organized so that it can be accessed and/or manipulated efficiently.

---

## Array

Collection with a **fixed** number of elements where order matters.

```
Index:  [0]  [1]  [2]  [3]  [4]  [5]
Value:  [42] [17] [99] [ 5] [88] [ 3]
                ↑
          direct access by index
```

- Fast access by index
- Insertion/removal in the middle → shifts elements

---

## Linked List

Each element (node) points to the next. No contiguous memory.

```
[data|•]──→[data|•]──→[data|•]──→[data|null]
  node 0      node 1      node 2      node 3
```

- Insertion/removal → moves pointers
- Access by index → traverses the list

---

## Stack

Collection where the **last in is the first out** — LIFO (*Last In, First Out*).

```
     top
  ┌────────┐
  │   C    │ ← push / pop
  ├────────┤
  │   B    │
  ├────────┤
  │   A    │
  └────────┘
```

- `push` → inserts at the top
- `pop`  → removes from the top
- Access only at the top

---

## Queue

Collection where the **first in is the first out** — FIFO (*First In, First Out*).

```
enqueue →  [ A | B | C | D ]  → dequeue
           entrance           exit
```

- `enqueue` → inserts at the end
- `dequeue` → removes from the front
- Input and output on opposite ends

---

## Tree

Hierarchical structure of nodes.

```
          [root]
         /      \
      [node]  [node]
      /    \
  [left] [right]
```

- Each node can have children (left and right in binary trees)
- Root is the only node without a parent

---

## HashMap

Stores **key → value** pairs. The key is transformed by a *hash function* into an index that points to a *bucket* in the internal array.

```
 key        hash fn      bucket (internal array)
"name"  ──→  h("name") ──→  index 3  ──→  ["name": "Ana"]
"age"   ──→  h("age")  ──→  index 7  ──→  ["age": 25]
"city"  ──→  h("city") ──→  index 3  ──→  collision! → chaining
```

**Hash function:**
- Transforms the key into an index
- Distributes data as uniformly as possible
- Deterministic: same key → same hash

**Collision:** when two keys generate the same index (*bucket*). Resolved via chaining or open addressing.

---

## Heap

**Complete** and **partially ordered** binary tree, usually implemented with an array.

```
         MaxHeap              MinHeap
           [90]                 [1]
          /    \               /   \
        [50]  [80]           [3]   [2]
        /  \                /  \
      [30] [40]           [6]  [5]

  parent >= children     parent <= children
```

- Partially ordered (not fully ordered like a BST)
- Works as a *priority queue*

---

## Graph

Structure of **free connections** between nodes (vertices), linked by edges.

```
    (A)──────(B)
     |  \   / |
     |   (E)  |
     |  /   \ |
    (C)──────(D)
```

- Vertices (*nodes*) + Edges
- Can be directed (arrows) or undirected
- Edges can have weights
- No mandatory hierarchy (unlike a Tree)