class Student {
    int roll;
    String name;
    String branch;
    double cgpa;
    int yop;

    Student(int r, String n, String b, double c, int y) { // No return type
        roll = r;
        name = n;
        branch = b;
        cgpa = c;
        yop = y;
    }

    void intro() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println("YOP: " + yop);
    }

    void eat() {
        System.out.println(name + " Eating");
    }
}

class Constructor {
    public static void main(String[] args) {
        Student s = new Student(5, "Amit", "ECE", 8.91, 2018);
        s.intro();
    }
}

/*
 * Called during object creation
 * Name will same as class name
 * There's no return type
 * Call during object creation
 * Creating a constructor is not mandatory java creats constructor automatically
 * but we can't initialize it, if we want to initialize
 * something we have to creat own Constructors
 * like method overloading we can also creat constructor overloading
 * Creating a constructor is not mandatory java creats constructor automatically
 * but we can't initialize it, if we want to initialize something we have to
 * creat own Constructors
 * like method overloading we can also creat constructor overloading
 */