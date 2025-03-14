# Static Keyword

- The static keyword in Java is used to indicate that a particular component belongs to the class itself, rather than to objects of the class. This also implies that the static member can be accessed without creating an object of the class.
- Basically, which method, variable are common means used by all that will be static so every one can utilize it without creting a object.
- Though, Everytime we don't have to create object so memory usage will be less.

All about static:
-----------------

* Static variables are shared across all instances of a class and initialize when the class is loaded.
* Static methods are tied to the class, not instances, and can be used without creating a class instance, perfect for utility functions that don't need instance data.
* Static blocks run once when the class is first loaded, setting up initial conditions before any instances or static methods are used.
* Static variables are ideal for common data needed by all instances, like configuration settings or counters.
* Static methods are great for tasks that require shared data but don't alter instance-specific details, such as calculations or accessing static variables.
