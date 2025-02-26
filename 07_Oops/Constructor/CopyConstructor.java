class Student {
    String name;
    String address;
    String batch;
    String dept;

    Student(String name, String address, String batch, String dept) {
        this.name = name;
        this.address = address;
        this.batch = batch;
        this.dept = dept;
    }

    //Copy Constructor, which will take Student object as a parameter
    Student(Student stud) {
        this.name = stud.name;
        this.address = stud.address;
        this.batch = stud.batch;
        this.dept = stud.dept;
    }

    public void  studentDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address);
        System.out.println("Student Batch: " + batch);
        System.out.println("Department: " + dept);
        System.out.println("---------------------------------------------------");
    }    
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student originalstudent1 = new Student("Rohan", "Kolkata", "2024", "ECE");
        originalstudent1.studentDetails();

        Student originalstudent2 = new Student("Mohan", "Chandigarh", "2024", "CSE");
        originalstudent2.studentDetails();

        //in copied student i have pass same original student 2
        Student copiedstudent1 = new Student(originalstudent2);
        copiedstudent1.studentDetails();

        //here i have pass original student 1 with updated name and department
        Student copiedstudent2 = new Student(originalstudent1);
        copiedstudent2.name = "Ram";
        copiedstudent2.dept = "Civil";
        copiedstudent2.studentDetails();

        // As we can see here in the student Details when we are passing student properties then, we are only changing the student name and department other thins remaon same so, why we pass all the other staff every time.... To solve this we have created copy constructor
    }
}


/*
class Book {
    String title;
    int pages;

    // Standard constructor
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Copy constructor
    public Book(Book another) {
        this.title = another.title;
        this.pages = another.pages;
    }

    // Method to display book details
    public void display() {
        System.out.println("Book: " + title + ", Pages: " + pages);
    }
}

public class Library {
    public static void main(String[] args) {
        // Create a book object
        Book originalBook = new Book("Java Fundamentals", 300);
        originalBook.display();

        // Create a copy of the book
        Book copiedBook = new Book(originalBook);
        copiedBook.display();

        // Modifying the copy to show that it does not affect the original
        copiedBook.pages = 350; // Assume setter methods or direct access for simplicity
        System.out.println("After modifying the copied book:");
        copiedBook.display();
        originalBook.display();
    }
}

- Output Explanation
    - Book: Java Fundamentals, Pages: 300
    - Book: Java Fundamentals, Pages: 300
    - After modifying the copied book:
    - Book: Java Fundamentals, Pages: 350
    - Book: Java Fundamentals, Pages: 300


- Key Points from the Example
    - Original and Copy: The original and the copied book initially share the same data (title and number of pages), demonstrating that the copy constructor effectively duplicates the original book.
    - Independence of Copies: After modifying the number of pages in the copied book, the original book remains unchanged. This shows that the copy constructor has successfully created a deep copy of the original object, where changes to the copy do not affect the original.
 */