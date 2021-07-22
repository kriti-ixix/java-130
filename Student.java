class Student{
public int id;
public String name;
Student(int id , String name)
{
this.id=id;
this.name=name;
}
public void display()
{
System.out.println("Student id is: " + id + "  Student name: "+ name);
System.out.println();
}}

class Abc{
public static void main(String[] args)
{
Student[] arr;
arr=new Student[2];
arr[0]= new Student(1, "abc");
arr[1]= new Student(2, "cde");
System.out.println("Element 1: " ); 
arr[0].display();
System.out.println("Element 2: " );
arr[1].display();
}
}