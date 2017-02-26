/*
 * Static defined methods are bond by the class. Java does not need to defined an object of the class in 
 * in order to access this method.
 */
package aRandomCodes;

/**
 *
 * @author javao
 */
public class StaticKeywordExample {
    static void runMe(){
        System.out.print("Java does not need to create an object to access a static defined method");
    }
}

class StaticKeywordExampleMain {
    public static void main(String args[])
    {
        StaticKeywordExample.runMe();//note no object was created to use this method
    }
}
