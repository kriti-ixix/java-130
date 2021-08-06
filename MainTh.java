import java.lang.Thread;
class Mythread extends Thread{
String name;
Mythread(String n)
{
name=n;
}
public void run()
{
for(int i=0;i<10;i++){
System.out.println(name+ "_" +i);
}}

}
class MainTh{
public static void main(String [] args){
Mythread t1=new Mythread("thread 1");
Mythread t2=new Mythread("thread 2");
t1.start();
t2.start();
}}


