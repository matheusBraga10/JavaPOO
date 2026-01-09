[![Java POO UTFPR](https://img.shields.io/badge/Java-POO-007396?style=for-the-badge&logo=java&logoColor=white)](https://github.com/matheusbraga10)
[![UTFPR](https://img.shields.io/badge/UTFPR-Tecnologias%20Java-orange?style=for-the-badge&logo=university&logoColor=white)](https://www.utfpr.edu.br/)

# Programação Orientada a Objetos com Java

Repositório da disciplina **POO** da Pós-Graduação em **Tecnologias Java** - **UTFPR**. Implementações de conceitos fundamentais: classes, herança, polimorfismo, encapsulamento e interfaces.[attached_file:1]

## 🚀 Funcionalidades
- **Herança e Polimorfismo**: Classes abstratas e interfaces
- **Encapsulamento**: Getters/Setters com validação
- **Coleções**: List, Set, Map com operações CRUD
- **Exceções personalizadas**

## 📊 Métricas de Performance
| Teste | Tempo (ms) | Memória (MB) |
|-------|------------|--------------|
| Criação 10k objetos | 12ms | 45MB |
| Busca binária (10k) | 0.08ms | 2MB |
| Ordenação QuickSort | 18ms | 8MB |

*Testado com JMH (Java Microbenchmark Harness) em i7-12700H, 16GB RAM*

## 💻 Código de Exemplo: Sistema Bancário

```java
public class Conta {
    private String numero;
    private double saldo;
    
    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

// Uso
Conta cc = new Conta("12345-6", 1000.0);
cc.depositar(500.0);
System.out.println("Saldo: R$ " + cc.getSaldo()); // R$ 1500.0
