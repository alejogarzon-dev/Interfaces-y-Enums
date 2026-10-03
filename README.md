# Interfaces y Enums en Java ☕

> Proyecto de prácticas sobre **interfaces** y **enums** en Java, basado en el capítulo *«Interfaces y Enums en Java»*.

---

## 📋 Contenido

| Actividad | Descripción | Conceptos |
|-----------|-------------|-----------|
| **Laboratorio 1** 🎵 | Mi playlist ordenada | `Comparable`, `Comparator`, `Predicate` |
| **Laboratorio 2** 💳 | Pasarela de pagos | Interfaces, polimorfismo, `default` |
| **Laboratorio 3** 🚦 | Semáforo inteligente | Enums con atributos y máquina de estados |
| **Laboratorio 4** ☕ | Cafetería «El Algoritmo» | Proyecto integrador: enums + records + lambdas |
| **Reto 1** 📐 | Figuras con perímetro | `sealed`, records, switch con patrones |
| **Reto 2** 🃏 | Baraja española | Múltiples enums, records, `Collections.shuffle` |
| **Reto 3** ➗ | Calculadora con lambdas | `DoubleBinaryOperator`, lambdas en enum |
| **Reto 4** 🏷️ | Promociones combinables | Métodos `default`, composición |
| **Reto 5** 🔐 | Permisos con EnumSet | `EnumSet`, roles |

---

## 🚀 Cómo ejecutar

Requisito: **Java 21 LTS** o superior (usa switch con patrones y records).

```powershell
cd Laboratorio4          # entra a la carpeta de la actividad
javac *.java -d out      # compila los archivos .java en out/
java -cp out Main        # ejecuta
```

> 💡 La carpeta `out/` contiene los archivos `.class` compilados. No es parte del código fuente.

---

## 🏗️ Estructura

```
InterfacesEnums/
├── Laboratorio1/   Main.java
├── Laboratorio2/   Main.java
├── Laboratorio3/   Main.java
├── Laboratorio4/   Bebida.java, Tamano.java, EstadoPedido.java,
│                   Promocion.java, Item.java, Pedido.java, Main.java
├── Reto1/          Main.java
├── Reto2/          Main.java
├── Reto3/          Main.java
├── Reto4/          Main.java
├── Reto5/          Main.java
└── README.md
```

---

## ✨ Ideas clave del capítulo

- **Interfaz** → dice *qué puede hacer* un objeto, sin atarte a *cómo*.
- **Enum** → dice *qué valores existen* y no deja colar ninguno más.
- Juntos hacen que **el compilador trabaje para ti** 🛠️

---

_Hecho con Java ☕ y mucho café ☕☕_
