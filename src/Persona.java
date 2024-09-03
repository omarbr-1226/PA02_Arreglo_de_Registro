import java.util.Scanner;

public class Persona {
    public String nombre;
    public int edad;
    public char sexo;
    public int peso;
    static Scanner sc = new Scanner(System.in);
    //constructor
    public Persona(String nombre, int edad,int peso, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
    }

    //setters y getters de Sexo
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //setters y getters de Edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //setters y getters de Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //setters y getters de Peso
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
}
