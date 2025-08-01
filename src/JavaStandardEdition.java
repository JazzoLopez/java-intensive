import java.util.Scanner;

public class JavaStandardEdition {
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

        //Arreglo unidimensional
        int numbers[] = new int[8]; //Arreglo limitado a 8 espacios
        numbers[0] = 3333; //guardamos 3333 en la posicion =
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = i*234;
        }
        System.out.println("numbers = " + numbers[5]);

        //Arreglo bidimensional el primero es la fila, el segundo la columna
        int matriz[][] = new int [3][3]; // matriz cuadrada cuando hay misma cantidad de filas que de columnas
        for(int i =0; i<3 ;i++){
            for(int j = 0;j<3;j++){
                System.out.println("Ingresa el valor para la fila " +i+" Columna" + j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        for(int i =0; i<3 ;i++){
            for(int j = 0;j<3;j++){
                System.out.println("Fila: "+i+" columna: "+j+" Valor: " +matriz[i][j]);
            }
        }

    }
}