# 📦 S3.03 — Design Patterns II
## 🎯 Project Goal & Overview
The goal of this project is to practice advanced **Design Patterns** and **Unit Testing** in Java through hands-on exercises.
This repository covers the implementation of three creational and behavioral design patterns, focused on:
- applying patterns to real-world scenarios
- guaranteeing correctness through unit tests
- understanding when and why each pattern is useful

---

## 🧩 LEVEL 1 — Builder Pattern
### 📌 Exercise 1 — Restaurant Menu Construction System

The **Builder** pattern (Fluent + Progressive Interface) allows building complex objects step by step, enforcing a logical construction order and preventing invalid combinations at compile time.

The system must:
- enforce the correct order of construction (Starter → Main Course → Dessert/Coffee → Drink)
- prevent invalid combinations: choosing **Dessert** blocks **Coffee**, and vice versa
- allow optional steps: Starter, Dessert/Coffee and Drink are all optional
- support multiple menu types: Full Menu, Half Menu (Main + Drink), Kids Menu (Main + Dessert + Drink)
- allow fluent configuration of dishes: `isVegan()`, `isGlutenFree()`, `withSupplement()`

#### 🔄 Progressive Interface Flow
```
new MenuBuilder()
├── withStarter()  → isVegan() / isGlutenFree()
└── (skip)
        ↓
withMainCourse()   → isVegan() / isGlutenFree() / withSupplement()
        ↓
withDessert() OR withCoffee() OR (skip)
        ↓
withDrink() OR (skip)
        ↓
build()
```

#### 🧪 Example Usage
```java
Menu executiveMenu = new MenuBuilder()
    .withStarter("Amanida Mediterrània")
        .isVegan()
        .isGlutenFree()
    .withMainCourse("Filet de Vedella")
        .withSupplement("Guarnició extra")
    .withDessert("Mousse de xocolata")
    .withDrink("Vi Negre")
    .build();

Menu kidsMenu = new MenuBuilder()
    .withMainCourse("Macarrons amb tomàquet")
    .withDessert("Gelat de Vainilla")
    .withDrink("Suc de taronja")
    .build();

Menu halfMenu = new MenuBuilder()
    .withMainCourse("Risotto de bolets")
        .isVegan()
    .withCoffee("Espresso")
    .withDrink("Aigua")
    .build();
```

#### 🧪 Unit Tests
- **🍽️ Executive Menu Test**: Verifies starter, main course, dessert and drink are correctly set, including vegan and gluten-free flags
- **👶 Kids Menu Test**: Validates a menu without starter builds correctly with main course, dessert and drink
- **🥗 Half Menu Test**: Ensures a menu with coffee and no dessert builds correctly with vegan flag on main course
- **🚫 Mutual Exclusion**: Compile-time guarantee that dessert and coffee cannot both be chosen

---

## 🛠 Technologies
- ☕ Java 21
- 🧪 JUnit 5
- 🏗️ Maven
- 🐙 Git & GitHub
