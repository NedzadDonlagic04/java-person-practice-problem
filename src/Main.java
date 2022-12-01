// Underneath is the description of the practice problem in Bosnian
/*
Napisite glavni program u kojem cete kreirati polje od 5 osoba
i u njega staviti 3 nastavnika i dva studenta. Nakon toga program
treba u petlji ispisati ime i prezime svake osobe te na kraju
petlje prosjecnu placu svih nastavnika koji se pojavljuju u polju.
Takoder, za sljedeci isjecak koda:
Person p1 = new Person("Ivo", "Ivic", 20);
Person p2 = new Person("Ivo", "Ivic", 20);
Student p3 = new Student("Ivo", "Ivic", 20, "0036312123", (short)3);
Student p4 = new Student("Marko", "Markovic", 25, "0036312123", (short)5);

System.out.println(p1.equals(p2));
System.out.println(p1.equals(p4));
System.out.println(p3.equals(p4));
System.out.println();
Ocekuje ovakav ispis:
true
false
true
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Marko", "Markovic", 27);
        Person p2 = new Person("Pero", "Peric", 30);

        Student s1 = new Student("Ivica", "Ivic", 20, "0011223344", (short)2);
        Student s2 = new Student("Marija", "Marinovic", 22, "5566778899", (short)4);

        Teacher t1 = new Teacher("Pajo", "Patak", 42, "pajoPatak@gmail.com", "Matematika", 1250);
        Teacher t2 = new Teacher("Miki", "Maus", 50, "mikiMaus@gmail.com", "Bosanski", 1500);

        System.out.println("Person class test:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println();

        System.out.println("Student class test:");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println();

        System.out.println("Teacher class test:");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t1));
        System.out.println();

        System.out.println("Salaries before 50% boost: " + t1.getSalary() + " and + " + t2.getSalary());
        Teacher.increaseSalary(50, new Teacher[]{t1, t2});
        System.out.println("Salaries after 50% boost: " + t1.getSalary() + " and + " + t2.getSalary());
        System.out.println();

        task();
    }

    private static void task() {
        Person p1 = new Person("Ivo", "Ivic", 20);
        Person p2 = new Person("Ivo", "Ivic", 20);
        Student p3 = new Student("Ivo", "Ivic", 20, "0036312123", (short)3);
        Student p4 = new Student("Marko", "Markovic", 25, "0036312123", (short)5);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p3.equals(p4));
        System.out.println();

        Object[] persons = new Object[]{
                new Teacher("Robert", "Brown", 60, "robertBrown@gmail.com", "History", 2000),
                new Teacher("Miki", "Maus", 50, "mikiMaus@gmail.com", "Bosanski", 1500),
                new Teacher("Pajo", "Patak", 42, "pajoPatak@gmail.com", "Matematika", 1250),
                new Student("Ivo", "Ivic", 20, "0036312123", (short)3),
                new Student("Marko", "Markovic", 25, "0036312123", (short)5)
        };

        double sum = 0;
        int count = 0;

        for(Object person : persons) {
            System.out.println(person.toString());
            if(person instanceof Teacher) {
                sum += ((Teacher) person).getSalary();
                count++;
            }
        }
        System.out.println();

        System.out.println("The average salary is " + twoDecimalRound(sum / count));
    }

    private static double twoDecimalRound(double value) {
        return Math.round(value * 100) / 100.00;
    }
}