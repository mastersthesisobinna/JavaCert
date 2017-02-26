/*
 * This file shows you that you can include more than one class in a single java file
 * However, one and only one of the classes will be assigned the public keyword.
 */
package aRandomCodes;

/**
 *
 * @author javao
 */
public class Animal{
    {System.out.print("Animal2");}
    public Animal(){}
    public static void main(String args[]){
        Animal newObject = new Animal(); //this will make the print statement above run
    }
}
class Animal2{}
class Animal3{}