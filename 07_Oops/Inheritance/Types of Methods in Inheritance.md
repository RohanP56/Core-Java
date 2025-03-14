# Types of methods during inheritance

**In Java inheritance, you will encounter 3 primary types of methods:**

* Inherited methods
* Overridden methods
* Child-specific methods
* **Inherited Methods:** Methods defined in the superclass that are directly available to the subclass without any changes. These methods can be used as-is in the subclass.
* **Overridden Methods:** Methods defined in the superclass that are redefined in the subclass. The subclass provides its specific implementation of the method, which replaces the superclass’s version when called on an instance of the subclass.
* **Child-Specific Methods:** Methods that are defined only in the subclass. These methods provide behaviors that are unique to the subclass and are not present in the superclass.

**Explanation**

* **Inherited Method:** The work() method is defined in the Employee class and inherited by the Manager class. When we create an instance of Manager and call myManager.work(), it uses the method from Employee.
* **Overridden Method:** The attendMeeting() method is defined in the Employee class but overridden in the Manager class. The @Override annotation indicates that Manager is providing its own implementation of attendMeeting(). When myManager.attendMeeting() is called, it uses the overridden method in Manager.
* **Child-Specific Method:** The conductReview() method is unique to the Manager class and is not present in the Employee class. This method is specific to Manager and provides additional behavior. When myManager.conductReview() is called, it uses the method defined in Manager.

#### **Method Hiding**

- Method Hiding in Java occurs when a subclass defines a static method with the same name and signature as a static method in its superclass. The static method in the subclass hides the static method in the superclass. This is different from method overriding, which involves instance methods and supports runtime polymorphism.

**Why is it Called Method Hiding?**

It is termed "method hiding" because the static method in the subclass hides or conceals the static method in the superclass. When you call the static method using a superclass reference that points to a subclass object, the method in the superclass is called, not the one in the subclass.

**Upcasting: *It is the process of converting a subclass reference to a superclass reference.***
