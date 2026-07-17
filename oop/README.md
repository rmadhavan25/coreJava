# OOP Concepts

## Topics to Practice
- [ ] Classes, Objects, Constructors (default, parameterized, copy)
- [ ] Inheritance (single, multilevel, hierarchical)
- [ ] Polymorphism — method overloading vs overriding
- [ ] Abstraction — abstract classes vs interfaces
- [ ] Encapsulation — getters/setters, access modifiers
- [ ] `this` vs `super` keyword
- [ ] Covariant return types
- [ ] Marker interfaces
- [ ] `final` keyword (class, method, variable)
- [ ] `static` — blocks, methods, variables
- [ ] Object class methods — `equals()`, `hashCode()`, `toString()`, `clone()`

## Practice Tasks

### Task 1: Classes, Objects, Constructors
Create a **Car** class with:
- Default constructor (sets model = "Unknown", year = 0)
- Parameterized constructor (model, year)
- Copy constructor
- Test all three in main() with assertions

### Task 2: Inheritance — Single
Create **Vehicle** (parent) and **Bike** (child):
- Vehicle has: `start()`, `stop()` methods
- Bike overrides and adds specific behavior
- Test in main()

### Task 3: Inheritance — Multilevel
Create **Animal → Dog → Puppy** hierarchy:
- Each level adds new methods/behavior
- Puppy calls parent methods using `super`

### Task 4: Inheritance — Hierarchical
Create **Shape** (parent) with **Circle**, **Rectangle**, **Triangle** (children):
- Each has `getArea()` implementation
- Test all three subclasses

### Task 5: Polymorphism — Method Overloading
Create **Calculator** class with overloaded `add()` methods:
- `add(int, int)`, `add(double, double)`, `add(String, String)`
- Test all variants

### Task 6: Polymorphism — Method Overriding
Create **Animal** (parent) with `makeSound()` and **Dog/Cat** (children):
- Override `makeSound()` in each child
- Use polymorphic calls: `Animal animal = new Dog(); animal.makeSound();`

### Task 7: Abstraction — Abstract Classes
Create **Employee** (abstract) with abstract method `calculateSalary()`:
- Create **Manager** and **Developer** subclasses
- Implement `calculateSalary()` differently
- Test with polymorphic calls

### Task 8: Abstraction — Interfaces
Create **Printable** and **Drawable** interfaces:
- Implement both in a **Document** class
- Test interface methods

### Task 9: Encapsulation
Create **BankAccount** class:
- Private fields: `balance`, `accountNumber`
- Public getters/setters with validation (balance ≥ 0)
- Test invalid operations

### Task 10: `this` vs `super` Keyword
Create **Parent** and **Child** classes:
- Use `this` to reference current object
- Use `super` to call parent constructor and methods
- Demonstrate the difference clearly

### Task 11: Covariant Return Types
Create **Animal** with `reproduce()` returning **Animal**:
- In **Dog** subclass, `reproduce()` returns **Dog** (more specific type)
- Show how this works in main()

### Task 12: Marker Interfaces
Create **Serializable** marker interface:
- Implement in **Person** class
- Use `instanceof` to check if object is serializable

### Task 13: `final` Keyword — All Three Uses
- `final` class: Create **ImmutableString** (cannot be subclassed)
- `final` method: Create method that cannot be overridden
- `final` variable: Create constant that cannot be changed
- Test all three behaviors

### Task 14: `static` — Blocks, Methods, Variables
Create **Counter** class:
- `static` variable: `count` (shared by all instances)
- `static` method: `getCount()`
- `static` block: Initialize before instance creation
- Test and verify sharing behavior

### Task 15: Object Class Methods
Create **Person** class with custom implementations of:
- `toString()` — returns formatted string
- `equals()` — compares two Person objects
- `hashCode()` — returns hash based on name/age
- Test all three methods
