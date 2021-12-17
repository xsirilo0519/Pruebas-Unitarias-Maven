package co.com.sofka.app;

import co.com.sofka.app.Calculator.BasicCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        print( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        print( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

        print( "Ingrese :\n 1.Sumar.\n 2.Restar.\n 3.Multiplicar.\n 4.Dividir" );
        String opcion = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );
        BasicCalculator calculator = new BasicCalculator();
        switch (opcion){
            case "1":
                print( number1 + " + " + number2 + " = " + calculator.sum(number1, number2));
                break;
            case "2":
                print( number1 + " - " + number2 + " = " + calculator.subtrac(number1, number2));
                break;
            case "3":
                print( number1 + " * " + number2 + " = " + calculator.multi(number1, number2));
                break;
            case "4":
                print( number1 + " / " + number2 + " = " + calculator.divi(number1, number2));
                break;

            default:
                print("Valor invalido");
        }

    }

    private static void print(String msg) {
        System.out.println(msg);
    }


}
