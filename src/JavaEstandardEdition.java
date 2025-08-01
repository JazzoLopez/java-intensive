import java.util.Scanner;

public class JavaEstandardEdition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 2004;
        double salary= 200.5;
        boolean isUser = false;
        char letter = 'J'; //Comillas simples
        String direction = "Calle 1234";
        //Operadores && -> and, || -> or ! not
        System.out.println("year = " + year); //sout autocompletar print line
        if(isUser) {
            System.out.println("Es usuario");
        }
        else{
            System.out.println("no es usuario esta en false jaja");
        }

        /*Operador ternario*/
        System.out.println("Ingresa el promedio del alumno");
        double avg  =scanner.nextDouble();
        String finalCondition;
        finalCondition = (avg >= 6) ? "Si pasa" :"no paso mai"; //?->if : ->else
        System.out.println("year = " + year);

        for (int i = 0; i<10; i++){
            System.out.println(i+1);
        }

        //Arreglos
        int numbers[] = new int[8]; //Arreglo limitado a 8 espacios
        numbers[0] = 3333; //guardamos 3333 en la posicion =
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = i*234;
        }
        System.out.println("numbers = " + numbers[5]);
    }
}