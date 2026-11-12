# Laboratory 02: Algorithmic Efficiency and Complexity

**Group project:** Galahad Constante and Melane Herreria  
**Universidad Central del Ecuador**  
**Program:** Information Systems Engineering – Fourth Semester  
**Course:** Algorithms (Week 2)

---

## 1. Problem Description
The goal of this laboratory is to implement, measure, compare, and justify two algorithmic strategies that solve the same problem: **detecting and separating unique and duplicate elements** within a dataset.

* **Strategy A (Manual sequential search):** uses nested loops and auxiliary arrays built from scratch to compare each input element against the uniques already stored.
* **Strategy B (Auxiliary structure / Hash table):** uses `HashSet` / `HashMap`, with lookups and insertions in average constant time.

## 2. Hypothesis
**Strategy B** will scale linearly, O(n), processing large volumes of data in milliseconds. **Strategy A** will show quadratic growth, O(n²), due to its nested loops, and will become impractical as n grows by orders of magnitude (100, 1,000, 10,000, 100,000, 1,000,000).

## 3. Repository Structure
This repository contains only the source code of the two strategies:

```
Laboratorio2/
├── src/
│   ├── AlgorithmA.java   # Strategy A: sequential search (O(n²))
│   └── AlgorithmB.java   # Strategy B: HashMap / HashSet (O(n))
└── README.md
```

## 4. How to Run
1. Open the project in IntelliJ IDEA.
2. Run the `main` method of `AlgorithmA.java` or `AlgorithmB.java`.
3. The number of operations and the time (ms) are printed for each n.
