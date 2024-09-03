import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos campos desea llenar?");
        int T = sc.nextInt();
        Persona[] persona = new Persona[T];

        for (int i = 0; i < T; i++) {
            System.out.println("Ingresar el nombre: ");
            String nombre = sc.next();
            System.out.println("Ingresar el edad: ");
            int edad = sc.nextInt();
            System.out.println("Ingresar el peso: ");
            int pesos = sc.nextInt();
            System.out.println("Ingresar el sexo: ");
            char sexo = sc.next().charAt(0);
            persona[i] = new Persona(nombre, edad, pesos, sexo);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(persona[i].getNombre());
            System.out.println(persona[i].getEdad());
            System.out.println(persona[i].getPeso());
            System.out.println(persona[i].getSexo());

        }
    }
}
