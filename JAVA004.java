
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

abstract class Library {
    public int returnBook() {
        return 0;
    }

    public int takeBook() {
        return 0;
    }

    public int getID() {
        return 0;
    }

    public int getISBN() {
        return 0;
    }

    public String getName() {
        return "";
    }

    public long getMobNo() {
        return 0;
    }

    public int getQuantity() {
        return 0;
    }
}

class Book extends Library {
    private String name;
    private int isbn, quantity;

    Book(int isbn, String name, int quantity) {
        this.isbn = isbn;
        this.name = name;
        this.quantity = quantity;
    }

    public int getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int returnBook() {
        quantity++;
        return 1;
    }

    public int takeBook() {
        if (quantity > 0) {
            quantity--;
            return 1;
        } else {
            return 0;
        }
    }
}

class Student extends Library {
    private int id;
    private String name;
    private long mobNo;

    Student(int id, String name, long mobNo) {
        this.id = id;
        this.name = name;
        this.mobNo = mobNo;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getMobNo() {
        return mobNo;
    }

    public int returnBook() {
        System.out.print(JAVA004.newline);
        System.out.print("Enter Book ISBN: ");
        JAVA004.bookISBN = JAVA004.sc.nextInt();
        JAVA004.idx = JAVA004.searchBooks(JAVA004.bookISBN);
        if (JAVA004.idx != -1) {
            System.out.print(JAVA004.newline);
            System.out.println("Book Returned!");
            return JAVA004.books[JAVA004.idx].returnBook();
        } else {
            System.out.print(JAVA004.newline);
            System.out.println("Invalid ISBN!");
            return 0;
        }
    }

    public int takeBook() {
        System.out.print(JAVA004.newline);
        System.out.print("Enter Book ISBN: ");
        JAVA004.bookISBN = JAVA004.sc.nextInt();
        JAVA004.idx = JAVA004.searchBooks(JAVA004.bookISBN);
        if (JAVA004.idx != -1) {
            if (JAVA004.books[JAVA004.idx].takeBook() != 0) {
                System.out.print(JAVA004.newline);
                System.out.println("Book Issued!");
                return 1;
            } else {
                System.out.print(JAVA004.newline);
                System.out.println("Book Not Available!");
                return 0;
            }
        } else {
            System.out.print(JAVA004.newline);
            System.out.println("Invalid ISBN!");
            return 0;
        }
    }
}

public class JAVA004 {
    public static Scanner sc = new Scanner(System.in);
    public static int bookISBN, idx, nBook = 0, nStudent = 0;
    public static Book[] books = new Book[100];
    public static Student[] students = new Student[100];
    public static String newline = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        int choice;
        while (true) {
            System.out.print(newline);
            System.out.println("#################### | LIBRARY SYSTEM | ####################");
            System.out.print(newline);
            System.out.println("1. Administrator");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print(newline);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    admin();
                    break;
                case 2:
                    student();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.print(newline);
                    System.out.println("Invalid Option!");
            }
        }
    }

    public static void admin() throws IOException {
        int choice, id, isbn, quantity;
        String bookName, studentName;
        long mobNo;
        while (true) {
            System.out.print(newline);
            System.out.println("#################### | ADMIN MENU | ####################");
            System.out.print(newline);
            System.out.println("1. Add Student");
            System.out.println("2. Add Book");
            System.out.println("3. Display Students");
            System.out.println("4. Display Books");
            System.out.println("5. Back");
            System.out.print(newline);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (nStudent < 100){
                        System.out.print(newline);
                        id = nStudent + 1;
                        System.out.print("Enter Name: ");
                        sc.nextLine();
                        studentName = sc.nextLine();
                        System.out.print("Enter Mobile No.: ");
                        mobNo = sc.nextLong();
                        students[nStudent] = new Student(id, studentName, mobNo);
                        nStudent++;
                        System.out.print(newline);
                        System.out.println("Student Successfully Added!");
                    }
                    else{
                        System.out.print(newline);
                        System.out.println("Storage Full!");
                    }
                    break;
                case 2:
                    if (nBook < 100){
                        while (true) {
                            System.out.print(newline);
                            System.out.print("Enter ISBN No.: ");
                            isbn = sc.nextInt();
                            idx = searchBooks(isbn);
                            if (idx == -1) {
                                break;
                            } else {
                                System.out.print(newline);
                                System.out.println("ISBN Already Exists!");
                            }
                        }
                        System.out.print("Enter Name: ");
                        sc.nextLine();
                        bookName = sc.nextLine();
                        while (true) {
                            System.out.print("Enter Quantity: ");
                            quantity = sc.nextInt();
                            if (quantity > 0) {
                                break;
                            }
                            System.out.print(newline);
                            System.out.println("Invalid Quantity!");
                            System.out.print(newline);
                        }
                        books[nBook] = new Book(isbn, bookName, quantity);
                        nBook++;
                        System.out.print(newline);
                        System.out.println("Book Successfully Added!");
                    }
                    else{
                        System.out.print(newline);
                        System.out.println("Storage Full!");
                    }
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    return;
                default:
                    System.out.print(newline);
                    System.out.println("Invalid Option!");
            }
        }
    }

    public static void student() throws IOException {
        int choice, i = 0, id;
        System.out.print(newline);
        System.out.println("#################### | STUDENT MENU | ####################");
        System.out.print(newline);
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        i = searchStudents(id);
        if (i == -1) {
            System.out.print(newline);
            System.out.println("Invalid ID!");
            return;
        }
        while (true) {
            System.out.print(newline);
            System.out.println("#################### | STUDENT MENU | ####################");
            System.out.print(newline);
            System.out.println("1. Display Books");
            System.out.println("2. Take book");
            System.out.println("3. Return book");
            System.out.println("4. Back");
            System.out.print(newline);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    students[i].takeBook();
                    break;
                case 3:
                    students[i].returnBook();
                    break;
                case 4:
                    return;
                default:
                    System.out.print(newline);
                    System.out.println("Invalid Option!");
            }
        }
    }

    public static void displayStudents() {
        System.out.print(newline);
        System.out.println("#################### | DISPLAY STUDENTS | ####################");
        if (nStudent > 0) {
            Formatter fmt = new Formatter();
            fmt.format("\n%5s %20s %20s", "ID", "Name", "Mobile No.");
            for (int i = 0; i < nStudent; i++) {
                fmt.format("\n%5s %20s %20s", students[i].getID(), students[i].getName(), students[i].getMobNo());
            }
            System.out.println(fmt);
            fmt.close();
        } else {
            System.out.println("No Students Added!");
        }
    }

    public static void displayBooks() {
        System.out.print(newline);
        System.out.println("#################### | DISPLAY BOOKS | ####################");
        if (nBook > 0) {
            Formatter fmt = new Formatter();
            fmt.format("\n%10s %20s %20s", "ISBN", "Name", "Quantity");
            for (int i = 0; i < nBook; i++) {
                fmt.format("\n%10s %20s %20s", books[i].getISBN(), books[i].getName(), books[i].getQuantity());
            }
            System.out.println(fmt);
            fmt.close();
        } else {
            System.out.println("No Books Added!");
        }
    }

    public static int searchStudents(int id) {
        for (int i = 0; i < nStudent; i++) {
            if (students[i].getID() == id)
                return i;
        }
        return -1;
    }

    public static int searchBooks(int isbn) {
        for (int i = 0; i < nBook; i++) {
            if (books[i].getISBN() == isbn)
                return i;
        }
        return -1;
    }
}
