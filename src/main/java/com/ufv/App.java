package com.ufv;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String data = "{'nombre': 'Nacho', 'apellido': 'Serrano', 'empleos':[{'tipo': 'Consultor'},{'tipo': 'Profesor'}] }";

        Gson gson = new Gson();

        Profe profe = gson.fromJson(data, Profe.class);

        profe.setApellido("Serrano Broncano");
        Empleos nuevoEmpleo = new Empleos("Padre a tiempo completo");

//        System.out.println(nuevoEmpleo);
        profe.addEmpleo(nuevoEmpleo);

        String jsonString = gson.toJson(profe);
        System.out.println(jsonString);

//        System.out.println(data);


    }
}
