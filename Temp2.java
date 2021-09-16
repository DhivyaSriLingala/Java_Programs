import java.io.BufferedReader;
import java.io.InputStreamReader;
class Temp2
{
public static void main(String args[])
{
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Your Name..!!");
String name=reader.readLine();
System.out.println("Enter Your Science marks..!!");
float Science=Float.parseFloat(reader.readLine());
System.out.println("Enter Your Maths marks..!!");
float Maths=Float.parseFloat(reader.readLine());
System.out.println("Enter Your English marks..!!");
float English=Float.parseFloat(reader.readLine());
System.out.println("Total marks of "+name" is:" +(Science+Maths+English));
System.out.println("Average marks of "+name" is:" +((Science+Maths+English)/3));
}
}

