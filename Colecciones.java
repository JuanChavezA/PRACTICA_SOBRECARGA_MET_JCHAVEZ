package Main;


import java.util.ArrayList;


		 class Colecciones {
		    public static void main(String[] args) {
		    	
		        ArrayList<String> nameStudents = new ArrayList<>();
		        
		        // Nombres de personas por defecto
		        nameStudents.add("Liliana Rojas");
		        nameStudents.add("Lucia Torres");
		        nameStudents.add("María Duque");
		        nameStudents.add("Juan Castro");
		        nameStudents.add("Laura Martínez");
		        
		        // Mostrar lista de nombre
		        System.out.println("LISTA ORIGINAL");
		        for (int i = 0; i < nameStudents.size(); i++) {
		            System.out.println((i+1) + ". " + nameStudents.get(i));
		        }
		        
		        // Eliminar el tercer elemento (índice 2)
		        if (nameStudents.size() > 2) {
		        	nameStudents.remove(2);
		        }
		        
		        // Mostrar lista actualizada
		        System.out.println("\nNUEVA LISTA");
		        for (int i = 0; i < nameStudents.size(); i++) {
		            System.out.println((i+1) + ". " + nameStudents.get(i));
		        }
		    }
		}

		

	


