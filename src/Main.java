import java.util.ArrayList;
import java.util.Scanner;

/*
* Integrantes:
* Omar de Jesus Bautista Ramirez
* Angel Gustavo Lopez Lopez
* Emmanuel Lopez Villatoro
* */


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        ArrayList<Persona> personas = new ArrayList<>();
        int menu;
        do {
            System.out.println("---Menu---");
            System.out.println(" 1.- Añadir\n 2.- Eliminar\n 3.- Modificar\n 4.- Consulta\n 5.- Informe\n 6.- Terminar ");
            menu = sc.nextInt();
            if (menu==1){
                //metodo Array para listas dinamicas
                do {
                    System.out.println("Ingresar el nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingresar el edad: ");
                    int edad = sc.nextInt();
                    System.out.println("Ingresar el peso: ");
                    int pesos = sc.nextInt();
                    System.out.println("Ingresar el sexo: ");
                    char sexo = sc.next().charAt(0);
                    personas.add( new Persona(nombre, edad, pesos, sexo));

                    System.out.println("Deseas agregar otra persona (si, no)");
                    resp = sc.next().charAt(0);
                }while (resp =='s' || resp=='S');
            }if (menu==2){
                System.out.println("Que elemento desea eliminar?");

            }if (menu==3){

                System.out.println("Que posicion desea modificar?");
                int P = sc.nextInt();

            }if (menu==4){
                System.out.println("Que persona desea consultar?");



            }if (menu==5){

                //for each que recorra las posiciones
                for(Persona persona : personas) {
                    System.out.print(persona.getNombre()+" ");
                    System.out.print(persona.getEdad()+" ");
                    System.out.print(persona.getPeso()+" ");
                    System.out.print(persona.getSexo()+"\n");
                }
            }if (menu==6){
                break;
            }
            System.out.println("");
        }while (menu!=6);


    }
}
