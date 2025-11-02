# 🌱 Spring Core – XML Based Dependency Injection Example

This simple program demonstrates the **core concept of Spring Framework** — *Dependency Injection (DI)* using **XML configuration**.
It shows how Spring automatically creates and manages Java objects (beans) using `ApplicationContext`.

---

## 🧠 Concept Overview

### 1. What is Spring Core?

Spring Core is the **heart of the Spring Framework**.
It provides the **Inversion of Control (IoC)** container that manages the creation and life cycle of Java objects, known as **beans**.

In normal Java, you manually create objects using `new`, but in Spring:

> Spring creates and injects objects automatically from the configuration file.

---

### 2. What is Inversion of Control (IoC)?

IoC means that the **control of object creation** is taken away from you (the developer) and given to the **Spring container**.
Spring creates and wires your objects based on instructions provided in `config.xml`.

---

### 3. What is Dependency Injection (DI)?

**Dependency Injection** is a process where Spring provides the required data (dependencies) to an object from outside, instead of hardcoding values inside the class.

There are two types of DI used in this example:

#### 🧩 a) Setter Injection

Uses `<property>` tags in XML.
Spring calls the setter methods to inject values.

Example:

```xml
<bean class="Cse.Csebranch.csedata" name="student1">
    <property name="pin" value="573"/>
    <property name="name" value="Ramyaa"/>
    <property name="branch" value="CSE"/>
</bean>
```

Spring executes:

```java
setPin(573);
setName("Ramyaa");
setBranch("CSE");
```

#### 🏗️ b) Constructor Injection

Uses `<constructor-arg>` tags in XML.
Spring calls the class constructor to pass values.

Example:

```xml
<bean class="Cse.Csebranch.aimldata" name="student3">
    <constructor-arg name="pin" value="12"/>
    <constructor-arg name="name" value="Thuanju"/>
    <constructor-arg name="branch" value="Mech"/>
    <constructor-arg name="city" value="VNK"/>
</bean>
```

Spring executes:

```java
new aimldata(12, "Thuanju", "Mech", "VNK");
```

---

### 4. What is ApplicationContext?

`ApplicationContext` is the **Spring Container** responsible for:

* Reading the `config.xml`
* Creating and initializing all beans
* Injecting their dependencies
* Providing ready-to-use objects via `getBean()`

Example:

```java
ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
csedata cd = (csedata) context.getBean("student1");
System.out.println(cd);
```

---

## 🧾 Example Output

```
Hello World!
csedata [pin=573, name=Ramyaa, branch=CSE]
itdata [pin=574, name=Hema, Branch=ECE, city=null]
aimldata [pin=12, name=Thuanju, branch=mech, city=vnk]
```

---

## 📘 Interview Key Points

| Concept                        | Explanation                                                    |
| ------------------------------ | -------------------------------------------------------------- |
| **IoC (Inversion of Control)** | Spring controls object creation instead of you.                |
| **Dependency Injection**       | Passing data to objects from outside (via XML or annotations). |
| **Setter Injection**           | Injects values using setter methods.                           |
| **Constructor Injection**      | Injects values using constructor parameters.                   |
| **Bean**                       | Java object managed by Spring container.                       |
| **ApplicationContext**         | Interface to access Spring beans.                              |
| **config.xml**                 | Configuration file that defines beans and their dependencies.  |

---

## ⚙️ Technologies Used

* **Java 17**
* **Spring Core / Spring Context**
* **Maven Build Tool**

---

## 🚀 How It Works (Flow)

1. `App.java` runs.
2. Spring loads `config.xml` using `ApplicationContext`.
3. Beans (`student1`, `student2`, `student3`) are created automatically.
4. Values are injected through setters or constructors.
5. `toString()` prints all details of each object.

---

## 💬 Summary

This project gives a clear understanding of:

* How **Spring manages objects automatically**
* The difference between **Setter** and **Constructor Injection**
* How **IoC Container** (ApplicationContext) works behind the scenes

Learning this concept builds the foundation for **Spring Boot, MVC, and Dependency Injection in real-world projects**.
