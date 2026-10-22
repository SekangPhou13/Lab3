package Lab3;
import java.util.Scanner;

class Student{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    Student(){
        this.name = "Unknown";
        this.id = 0;
    }

    public void print() {
        System.out.printf("%d %s \n ", id, name);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your id: ");
        int id = sc.nextInt();

        Student st1 = new Student(name, id);

        st1.print();

        sc.close();
    }
}