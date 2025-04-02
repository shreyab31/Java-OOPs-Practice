public class ArrMarks {
    public static void main(String[] args) {
        int marks[] = {98,44,56,78,90};
        String students[]={"Harry", "Andy", "Ben", "jake" };
        System.out.println(marks[4]);
        System.out.println(marks.length);
        System.out.println(students[3]);
        System.out.println(students.length);
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for each loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
