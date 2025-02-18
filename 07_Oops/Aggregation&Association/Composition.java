class Book {
    Chapter chapter = new Chapter();
}

class Chapter {
    String title;
    String content;
}

public class Composition {
    public static void main(String[] args) {
        // Create a book and add the chapter
        Book myBook = new Book();
        myBook.chapter.title = "Introduction to Java";
        myBook.chapter.content = "Java is a high-level programming language...";

        // Read the chapter
        System.out.println("Reading Chapter: " + myBook.chapter.title);
        System.out.println("Content: " + myBook.chapter.content);
    }
}
