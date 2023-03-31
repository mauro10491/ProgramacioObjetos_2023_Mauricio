package poo.greatbooktext;

import java.util.ArrayList;
import java.util.List;
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
                
        /*
        List<Student> lista = new ArrayList<>();
        
        Student estudiante1 = new Student();
        lista.add(estudiante1);
        
        for(Student list:lista){
            System.out.println(list);
        }
       */
        
    }
}
