
package Ejercicio1;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Alumno>Lista = new ArrayList();
        
        
        
      Alumno a1 = new Alumno("Jorge", "Ruidiaz", "ADSSA123", "M", "Regular", 4.5);  
       Lista.add(a1);
      Alumno a2 = new Alumno("Miguel", "Alvarado", "ADSSA122", "M", "Condicional", 4.0);    
       Lista.add(a2);
      Alumno a3 = new Alumno("Juan", "Cadena", "ADSSA120", "M", "Regular", 3.5);    
       Lista.add(a3);
      Alumno a4 = new Alumno("Natalia", "Perez", "ADSSA023", "F", "Condicional", 4.5);    
       Lista.add(a4);
       
       
        System.out.println("Listado de alumnos");
        for (Alumno a: Lista){
            System.out.println( a.getNombre()+ "  "+a.getApellido()+" "+a.getPadron()+" "+a.getSexo()+" "+a.getCondicion()+" "+a.getNotafinal());
        
        
        }
        
    }
 
    
    
    
    
    
    
}
