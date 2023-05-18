/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Profesor;
import paquete01.Calificacion;

public class EjemploTres {

    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Profesor prof = new Profesor("Luis", "Nombramiento");
        Profesor prof2 = new Profesor("Juan", "Contrato");

        Calificacion[] calificaciones = {new Calificacion(10, "Computación", prof),
            new Calificacion(9, "Electrónica", prof2)};

        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n con profesor %s\n",
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(), objetoCalificacion.obtenerProfesor().obtenerNombre());
        }

    }
}
