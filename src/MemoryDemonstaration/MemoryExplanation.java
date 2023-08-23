package MemoryDemonstaration;

public class MemoryExplanation {
    public static void main(String[] args)
    {
        //store in a stack memory
        int a = 5;
        int b = 10;

        Student student1 = new Student("John");
        Student student2 = new Student("Billy");
        Student student3 = student2;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("Student1 memory hash code is" + System.indetityHashCode(student1));
        System.out.println("Student2 memory hash code is" + System.indetityHashCode(student2));
        System.out.println("Student3 memory hash code is" + System.indetityHashCode(student3));

        student1.setName("Humpthrey");
        student2.setName("Gorge");

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());
    }
}
