class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    class Classroom {
        private int roomNumber;
        private String subject;

        public Classroom(int roomNumber, String subject) {
            this.roomNumber = roomNumber;
            this.subject = subject;
        }

        public void displayInfo() {
            System.out.println(name + " - Room " + roomNumber + ": " + subject + " class");
        }
    }

}

public class MemberInnerClasses {
    public static void main(String[] args) {
        School mySchool = new School("Greenwood High");
        School.Classroom mathClass = mySchool.new Classroom(101, "Math");
        School.Classroom scienceClass = mySchool.new Classroom(102, "Science");
        mathClass.displayInfo();
        scienceClass.displayInfo();
    }
}


/*

                                                Another Exmaple

class Library {
    private String name;

    public Library(String name) {
        this.name = name;
    }

    class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayDetails() {
            System.out.println("Book: " + title + " by " + author + ", available at " + name);
        }
    }
}

public class InnerClassJDemo3 {
    public static void main(String[] args) {
        Library myLibrary = new Library("Central Library");
        Library.Book book1 = myLibrary.new Book("1984", "George Orwell");
        Library.Book book2 = myLibrary.new Book("To Kill a Mockingbird", "Harper Lee");
        book1.displayDetails();
        book2.displayDetails();
    }
}
 */