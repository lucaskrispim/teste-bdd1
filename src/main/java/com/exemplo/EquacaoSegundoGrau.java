package com.exemplo;

/**
 * Hello world!
 *
 */
public class EquacaoSegundoGrau{

        public static void main (String[]args ){
        {
            System.out.println("Hello World!");
        }
    }

    public static double[] resolverEquacaoSegundoGrau(double a,double b,double c){

            double delta = b*b - 4.0 * a * c;

            if( delta < 0 ){
                return null;
            }else if(delta == 0.0){
                double x = -b/(2.0*a);
                return new double[] {x};
            }else{
                double x1 = (-b + Math.sqrt(delta))/(2.0*a);
                double x2 = (-b - Math.sqrt(delta))/(2.0*a);
                return new double[]{x1,x2};
            }


    }

}