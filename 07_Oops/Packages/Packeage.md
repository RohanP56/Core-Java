# Packages
**A package in Java is a namespace that organizes classes and interfaces by functionality. This organization helps manage large codebases by logically grouping related files, making the code easier to manage and use.**

### Creating and Using Packages
Suppose you are developing a software for a library management system. You might organize your code into packages like this:

- com.library.ui for user interface classes
- com.library.data for database access
- com.library.network for network communications

**Example**

#### 1. Creating a Package
- File: Book.java
- Location: com/library/data
``` Java
// Define the package package com.library.data; 
public class Book { 
    String title; 
    String author; 
    
    public Book(String title, String author) { 
        this.title = title; 
        this.author = author; 
    } 
    
    public void displayInfo() { 
        System.out.println("Title: " + title + ", Author: " + author); 
    } 
}
```

#### 2. Using the Package in Another Class
- File: LibraryManagement.java
- Location: com/library/app
``` Java
// Import the Book class from the data package 
import com.library.data.Book; 

public class LibraryManagement { 

   public static void main(String[] args) { 
       Book myBook = new Book("1984", "George Orwell"); 
       myBook.displayInfo(); 
   } 
}
```