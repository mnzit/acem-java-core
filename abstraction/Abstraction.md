# Abstraction
 
<img width="957" alt="image" src="https://user-images.githubusercontent.com/21164124/176195461-742f7cd3-cd4a-4372-84a1-d47cf040c549.jpg">

1. Incomplete/Abstract types Ball and MusicalInstrument
2. Both of them contain same behaviour i.e play
3. Types of Ball & Types of MusicalInstrument
## Interface
> Interface acts as a abstraction layer that helps to group incompatible objects with same behaviour/action
> Interface are 100% abstraction.

```java
public interface Playable {
 void play();
}
```

## Abstract Class
> Abstract class acts as a abstraction layer that helps to group compatible objects with same behaviour/action
> Abstract class are 0-100% abstraction i.e. We can write abstract methods as well as concrete implemented methods in it.

```java
public abstract class Ball {

 public abstract void getColor(); 
 
 public abstract void setColor();
 
 public void inflate(){
  System.out.println("Inflating ball");
 }
}
```
