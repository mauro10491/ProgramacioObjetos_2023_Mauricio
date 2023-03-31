package poo.greatbooktext;

import java.util.Scanner;

public class GradeBookTest{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        GradeBook book = new GradeBook();
        Student estudiante = new Student();
        
        System.out.println("El nombre del curso (antes de la asignacion): " + book.getNameCurse());
        
        System.out.println("Por favor ingrese el nombre del curso");

        String entrada = in.nextLine();
        book.setNameCurse(entrada);
        
        System.out.println("El valor asignado es: " + book.getNameCurse());
        book.displayMessage();
                
        
    }
}
