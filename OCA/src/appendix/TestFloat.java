/*
 * THE CODE SHOWN HERE WILL NOT COMPILE.
 * THIS IS CODE SNIPPET TO EXPLORE ERRORS IN 
 * float primitive type declaration.
 * The uncommented section of the code works.
 */
package appendix;

/**
 *
 * @author javao
 */
public class TestFloat {
    public static void main(String args[]){
        float value1 = 102;
        float value2 = (int)102.0;
        //float value3 = 1f * 0.0;
        float value4 = 1f * (short)0.0;
        //float value5 = 1f * (boolean)0;
    }
}
