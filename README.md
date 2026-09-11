
# Assignment S302. Patterns 2
Implementation of SOLID principles through several design patterns.

**Technologies**: Backend Java

**Prerequisites:**<br>
* **Maven**: Required to download external dependencies: JUnit API for testing.

**Installation and Compilation**:

1. Clone repository:<br>
   https://github.com/bmestres/S303_Patterns_2.git
2. Navigate to the project root directories:<br>
   `cd tascaS303`
3. Resolve dependencies and compile the project using Maven:<br>
   `mvn clean compile`

## Level 1:
Design and implementation of a system that allows building different types of **Restaurant Menus** applying the Builder design pattern with **Fluent Builder** style, and following the SOLID principles. 

Use of the **progressive interface** concept to ensure that the building process is carried out in the correct order and the dependencies between steps are met. 

#### 🔨 *Builder Pattern* project structure:

```text
.
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   ├── BuildStage.java
    │   │   ├── CoffeeStage.java
    │   │   ├── DessertStage.java
    │   │   ├── DrinkStage.java
    │   │   ├── FirstStage.java
    │   │   ├── MainCourseStage.java
    │   │   ├── Menu.java
    │   │   ├── MenuBuilder.java
    │   │   ├── SecondStage.java
    │   │   ├── StarterOrMain.java
    │   │   └── StarterStage.java
    │   └── resources
    └── test
        └── java
            └── MenuBuilderTest.java

```


## Level 2:
Implementation of a system in which an Observable Stock Exchange Agent automatically notify several Stock Exchange Agencies (Observers) each time a change in the Stock Exchange status occurs.

This program fulfills the following requirements:
* **Dynamic Subscription:** The system allows gencies to subscribe and unsubscribe from the main stock agent.

* **State Management:** The StockAgent class has methods to simulate stock market ups (`stockMarketUp()`) and downs (`stockMarketDown()`).
* **Automatic Notification:** Whenever a change in the stock value is produced, the Agent automatically forwards a notification to all subscribed Agencies.
* **Output Handling:** Each `StockBrokerAgency` formats a specific message detailing the change and the new stock value.



#### 📢 *Observer pattern* project structure:
````text
.
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   ├── StockAgent.java
    │   │   └── StockBrokerAgency.java
    │   └── resources
    └── test
        └── java
            └── StockAgentTest.java

````



#### *S302* Overall Structure

```text
.
├── builder_pattern
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   ├── BuildStage.java
│       │   │   ├── CoffeeStage.java
│       │   │   ├── DessertStage.java
│       │   │   ├── DrinkStage.java
│       │   │   ├── FirstStage.java
│       │   │   ├── MainCourseStage.java
│       │   │   ├── Menu.java
│       │   │   ├── MenuBuilder.java
│       │   │   ├── SecondStage.java
│       │   │   ├── StarterOrMain.java
│       │   │   └── StarterStage.java
│       │   └── resources
│       └── test
│           └── java
│               └── MenuBuilderTest.java
├── observer_pattern
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   ├── StockAgent.java
│       │   │   └── StockBrokerAgency.java
│       │   └── resources
│       └── test
│           └── java
│               └── StockAgentTest.java
└── README.md
```

