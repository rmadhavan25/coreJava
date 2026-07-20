import java.lang.*;
import java.util.Objects;

public class Oops {

    public static void main(String[] args) {
        Car carObj = new Car();
        assert carObj.model.equals("Unknown");
        assert carObj.year == 0;

        Car carObj2 = new Car("Toyota", 2020);
        assert carObj2.model.equals("Toyota");
        assert carObj2.year == 2020;

        Car carObj3 = new Car(carObj2);
        assert carObj3.model.equals("Toyota");
        assert carObj3.year == 2020;

//-------------------------------------------------------------------------
        Vehicle bike = new Bike();
        assert bike instanceof Bike;
        bike.start();

//-------------------------------------------------------------------------
        Puppy puppy = new Puppy();
        puppy.play();

        //----------------------------------------------------------------------
        Shape circle = new Circle();
        circle.getArea();

        Shape rectangle = new Rectangle();
        rectangle.getArea();

        //------------------------------------------------------------------

        Calculator calc = new Calculator();
        System.out.println(calc.add(5,6) + " ");
        System.out.println(calc.add(5.0,6.0) + " ");
        System.out.println(calc.add("5","6"));

        //---------------------------------------------------------

        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

        //-----------------------------------------------------------------

        Employee manager = new Manager();
        System.out.println("Manager salary: "+ manager.calculateSalary(1.5));

        Employee developer = new Developer();
        System.out.println("Developer salary: "+ developer.calculateSalary(1.2));

        //-------------------------------------------------------------------
        Document doc = new Document();
        doc.print();
        doc.draw();

        //-------------------------------------------------------------
        BankAccount account = new BankAccount();
        account.setAccountNumber("xxx56778");
        account.setBalance(8000.00);
        account.getAccountNumber();
        account.setBalance(-500.00);
        System.out.println(account.getAccountNumber() + ": " + account.getBalance());
        //-----------------------------------------------------------
        Animal animal = new Animal();
        System.out.println(animal.reproduce() instanceof Animal);

        Animal dog1 = new Dog();
        System.out.println(dog1.reproduce() instanceof Dog);
        //-----------------------------------------------------

//        TestFinalClass tfc = new TestFinalClass();
//        tfc.display();
//
//        TestFinalMethod tfm = new TestFinalMethod();
//        tfm.display();
//        tfm.changeConstant(10);

        //--------------------------------------------------------------

        TestStatic ts1 = new TestStatic();
        TestStatic ts2 = new TestStatic();
        TestStatic ts3 = new TestStatic();

        // not recommended to access static variable/method using object reference
        ts1.incrementStaticVar();
        ts2.incrementStaticVar();
        ts3.incrementStaticVar();

        //prefer this
        TestStatic.incrementStaticVar();

        System.out.println(TestStatic.staticVar);

        //--------------------------------------------------------------

        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);

        System.out.println(p1.equals(p2));
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode());


    }
}

class Car{
    public String model = "";
    public int year = 0;

    Car(){
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    Car(Car car){
        this.model = car.model;
        this.year = car.year;
    }
}

class Vehicle{
    public void start(){
        System.out.println("parent start");
    }

    public void stop(){
        System.out.println("parent stop");
    }
}

class Bike extends Vehicle{

    @Override
    public void start() {
        super.start();
        System.out.println("child start");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("child stop");
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal eats");
    }

    public void makeSound(){
        System.out.println("Animal makes sound");
    }

    public Animal reproduce(){
        return this;
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }

    @java.lang.Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @java.lang.Override
    public Dog reproduce() {
        return this;
    }
}

class Cat extends Animal{
    @java.lang.Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Puppy extends Dog{
    public void play(){
        super.eat();
        super.bark();
        System.out.println("puppy plays");
    }

    @java.lang.Override
    public void makeSound() {
        System.out.println("Puppy whines");
    }
}

class Shape {
    public void getArea(){
        System.out.println("calculated area:");
    }
}

class Circle extends Shape {
    public void getArea(){
        super.getArea();
        System.out.println("Circle area: " + (int)(Math.PI * 5 * 5));
    }
}

class Rectangle extends Shape {
    public void getArea(){
        super.getArea();
        System.out.println("Rectangle area: " + (int)(10 * 5));
    }
}

class Calculator {
    public int add (int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public String add(String a, String b){
        return a + b;
    }
}

abstract class Employee {
    abstract double calculateSalary(double multiplier);
}

class Manager extends Employee {
    @Override
    double calculateSalary(double multiplier) {
        return 5000 * multiplier;
    }
}

class Developer extends Employee {
    @Override
    double calculateSalary(double multiplier) {
        return 4000 * multiplier;
    }
}

interface printable{
    public void print();
}

interface Drawable{
    public void draw();
}

class Document implements printable, Drawable{
    @Override
    public void print() {
        System.out.println("Document printed");
    }

    @Override
    public void draw() {
        System.out.println("Document drawn");
    }

}

class BankAccount {
    private double balance;
    private String accountNumber;

    public double getBalance(){
        return this.balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        if(balance > 0)
            this.balance = balance;
        else
            System.out.println("Balance cannot be negative");
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
}

//final class ImmutableString{
//    public void display(){
//        System.out.println("This is an immutable class");
//    }
//}
//
//class TestFinalClass extends ImmutableString{
//    @Override
//    public void display() {
//        System.out.println("This is a test class");
//    }
//}
//
//class FinalMethod{
//    public final void display(){
//        System.out.println("This is a final method");
//    }
//}
//
//class TestFinalMethod extends FinalMethod{
//
//    final int constant = 5;
//
//    public void changeConstant(int val){
//        this.constant = val;
//    }
//
//    @Override
//    public void display() {
//        System.out.println("This is a test class");
//    }
//}

class TestStatic {
    static int staticVar = 0;

    static {
        staticVar = 1;
        System.out.println("Static block executed");
    }

    static int incrementStaticVar() {
        return staticVar++;
    }
}


class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;

        if(obj == null || getClass() != obj.getClass())
            return false;

        Person p = (Person)obj;

        return age == p.age &&
                name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
