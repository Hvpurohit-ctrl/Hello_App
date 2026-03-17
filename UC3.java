/* 
@version 3.0
@author Harshvardhan
*/
public class UC3 {
    public static void main(String[] args) {
String name = "World";

if (args.length > 0) {
    name = args[0];
}
System.out.println("Hello, " + name + "!");
}
}