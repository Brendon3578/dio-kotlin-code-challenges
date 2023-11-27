# Média final do Aluno - Primeiras Condições com Kotlin

## Desafio

Faça um programa que receba a média de um aluno e imprima o seguinte:

- Caso a média seja < 5 imprima "REP";
- Caso a média seja >= 5 e < 7 imprima "REC";
- Caso a média seja >7 imprima "APR".

## Solução

Clique aqui para ver o [arquivo da solução](./solucao/media-final-do-aluno.kt)

```kotlin
fun main() {
   val media = readLine()!!.toDouble()
   
   when {
       media < 5 -> println("REP")
       media >= 5 && media < 7 -> println("REC")
       media >= 7 -> println("APR")
   }
}
```
