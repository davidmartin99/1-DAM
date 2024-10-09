package com.mycompany.tema06.maven;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 *  con java MAVEN porque con java ANT no funciona el reverse de arrays
 * 
 * @author david
 */
public class Tema06Maven {

    public static void main(String[] args) {
        int [] numeros= {5,2,8,4,12};
        Arrays.sort(numeros);
        ArrayUtils.reverse(numeros);
    }
    
}
