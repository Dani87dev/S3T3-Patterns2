# S3.03 — Design Patterns II
## Project Goal & Overview
The goal of this project is to practice advanced **Design Patterns** and **Unit Testing** in Java through hands-on exercises.
This repository covers the implementation of three creational and behavioral design patterns, focused on:
- applying patterns to real-world scenarios
- guaranteeing correctness through unit tests
- understanding when and why each pattern is useful
---
## LEVEL 1 — Builder Pattern
### Exercise 1 — Restaurant Menu Construction System
The **Builder** pattern (Fluent + Progressive Interface) allows building complex objects step by step, enforcing a logical construction order and preventing invalid combinations at compile time.
The system must:
- enforce the correct order of construction (Starter → Main Course → Dessert/Coffee → Drink)
- prevent invalid combinations: choosing **Dessert** blocks **Coffee**, and vice versa
- allow optional steps: Starter, Dessert/Coffee and Drink are all optional
- support multiple menu types: Full Menu, Half Menu (Main + Drink), Kids Menu (Main + Dessert + Drink)
- allow fluent configuration of dishes: `isVegan()`, `isGlutenFree()`, `withSupplement()`
#### Progressive Interface Flow
```
withStarter() → devuelve IStarterConfig
    → solo ves: isVegan(), isGlutenFree(), withMainCourse()
    → NO ves: withDessert(), build(), withDrink()
```
---
## The complete flow visualized
```
new MenuBuilder()
    │
    ▼ IStarterStep
withStarter("Amanida")
    │
    ▼ IStarterConfig  ← puedes configurar el starter
isVegan()
isGlutenFree()
    │
    ▼ IMainCourseStep (heredado por IStarterConfig)
withMainCourse("Filet")
    │
    ▼ IMainCourseConfig  ← puedes configurar el plato
withSupplement("Guarnició")
    │
    ▼ IAfterMainStep (heredado por IMainCourseConfig)
withDessert("Mousse")
    │
    ▼ IMenuBuildStep
withDrink("Vi Negre")
    │
    ▼
build() → Menu ✅
```
#### Example Usage
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
#### Unit Tests
- **Executive Menu Test**: Verifies starter, main course, dessert and drink are correctly set, including vegan and gluten-free flags
- **Kids Menu Test**: Validates a menu without starter builds correctly with main course, dessert and drink
- **Half Menu Test**: Ensures a menu with coffee and no dessert builds correctly with vegan flag on main course
- **Mutual Exclusion**: Compile-time guarantee that dessert and coffee cannot both be chosen

---

## LEVEL 2 — Observer Pattern
### Exercise 2 — Stock Market Notification System
The **Observer** pattern defines a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified automatically.
The system must:
- allow broker agencies to subscribe and unsubscribe from the stock agent dynamically
- notify all subscribed observers automatically when the market goes up or down
- keep the `StockAgent` decoupled from the internal logic of each observer

#### Class Structure
| Class / Interface | Role |
|---|---|
| `Observer` | Interface that all observers must implement |
| `Observable` | Interface that the publisher must implement |
| `StockAgent` | The publisher — maintains the list of observers and notifies them |
| `StockBrokerAgency` | Concrete observer — receives and prints notifications |

#### Example Usage
```java
StockAgent agent = new StockAgent();

Observer itAcademy = new StockBrokerAgency("It Academy");
Observer estrellaDamm = new StockBrokerAgency("Estrella Damm");

agent.addObserver(itAcademy);
agent.addObserver(estrellaDamm);

agent.stockMarketUp(150.75);
// It Academy received notification: Stock market went UP to 150.75
// Estrella Damm received notification: Stock market went UP to 150.75

agent.stockMarketDown(145.50);
// It Academy received notification: Stock market went DOWN to 145.50
// Estrella Damm received notification: Stock market went DOWN to 145.50
```

#### Unit Tests
- **Notification Test**: Verifies that all subscribed observers receive the correct message when the market goes up or down
- **Remove Observer Test**: Ensures that after unsubscribing, an observer no longer receives notifications

---

## LEVEL 3 — Decorator Pattern
### Exercise 3 — Bubble Tea Customization System
The **Decorator** pattern allows adding extra functionality to an object dynamically, without modifying its original class. Instead of creating subclasses for every combination, decorators wrap the original object and layer behaviour on top.
The system must:
- support multiple base drinks: `LatteBase`, `MatchaBase`, `TeaBase`
- allow dynamic composition of add-ons: `Ice`, `Sugar`, `Tapioca`, `Flavor`
- accumulate cost and description with each decorator added
- support adding the same decorator multiple times (e.g. two different flavors)

#### Class Structure
| Class / Interface | Role |
|---|---|
| `BubbleTea` | Interface with `getDescription()` and `getCost()` |
| `BubbleTeaDecorator` | Abstract class holding a reference to a wrapped `BubbleTea` |
| `LatteBase`, `MatchaBase`, `TeaBase` | Concrete base drinks with initial cost and description |
| `Ice`, `Sugar`, `Tapioca`, `Flavor` | Concrete decorators that add cost and description on top |

#### Example Usage
```java
BubbleTea tea = new LatteBase();
tea = new Tapioca(tea);
tea = new Sugar(tea);
tea = new Flavor(tea, "Maduixa");
tea = new Flavor(tea, "Mango");

System.out.println(tea.getDescription());
// Latte Bubble Tea + Tapioca + Sugar + Flavor: Maduixa + Flavor: Mango

System.out.println(tea.getCost());
// 5.50
```

#### Unit Tests
- **Full composition test**: Verifies description and cost of a Latte with Tapioca, Sugar and two Flavors
- **Simple decoration test**: Verifies a Matcha with Ice returns the correct description and cost
- **No decorators test**: Verifies a plain Tea base returns its base description and cost

---

## Technologies
- Java 21
- JUnit 5
- Maven
- Git & GitHub
