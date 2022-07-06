### Atomic Datatypes (AtomicInteger, AtomicDouble...)
> Atomics ensure that operation on variables are performed atomically

```java
int i = i + 1; // Performing read & write operation
i++; // Performing read & write operation
```
> No matter how you define i, a different Thread reading the value just when the above line is executed might get i, or i + 1, because the _operation_ is not atomically. If the other thread sets i to a different value, in worst case i could be set back to whatever it was before by thread A, because it was just in the middle of calculating i + 1 based on the old value, and then set i again to that old value + 1.
```
Assume i = 0
Thread A reads i, calculates i+1, which is 1
Thread B sets i to 1000 and returns
Thread A now sets i to the result of the operation, which is i = 1
```
> Atomics like AtomicInteger ensure, that such operations happen atomically. So the above issue cannot happen, i would either be 1000 or 1001 once both threads are finished.
### Volatile
* Volatile ensures, that a certain, expected (memory) state is true across different threads,
* Solves **visibility** issue
*  Volatile is used  to make variable updates guaranteed to be seen by other threads + visibility effects: after writing to a volatile variable, all the variables that where visible before writing that variable become visible to another thread after reading the same volatile variable (happen-before ordering).

