package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    
    // EJERCICIO 1
   
    public static void ejercicio1() {
        System.out.println("=== EJERCICIO 1 ===");

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");

        frutas.add(2, "Uva");

        System.out.println("Primera fruta: " + frutas.get(0));

        frutas.set(3, "Kiwi");

        System.out.println("Tamaño de la lista: " + frutas.size());

        System.out.println("Lista completa: " + frutas);
    }

    
    // EJERCICIO 2
    
    public static void ejercicio2() {
        System.out.println("=== EJERCICIO 2 ===");

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20));

        numeros.remove(2);
        numeros.remove(Integer.valueOf(20));

        boolean contiene40 = numeros.contains(40);
        System.out.println("¿La lista contiene 40? " + contiene40);

        System.out.println("Tamaño final: " + numeros.size());
        System.out.println("Lista resultante: " + numeros);
    }

    
    // EJERCICIO 3
    
    public static void ejercicio3() {
        System.out.println("=== EJERCICIO 3 ===");

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "María", "Carlos", "Elena"));

        int contador = 0;

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Posición " + i + ": " + nombres.get(i));

            if (nombres.get(i).length() > 4) {
                contador++;
            }
        }

        System.out.println("Nombres con más de 4 caracteres: " + contador);
    }

    
    // EJERCICIO 4
    
    public static void ejercicio4() {
        System.out.println("=== EJERCICIO 4 ===");

        ArrayList<Double> valores = new ArrayList<>(Arrays.asList(15.5, 23.8, 9.2, 31.7, 12.4));

        double suma = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double v : valores) {
            suma += v;
            if (v > max) max = v;
            if (v < min) min = v;
        }

        double promedio = suma / valores.size();

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Promedio: " + promedio);
    }

    
    // EJERCICIO 5
    
    public static void ejercicio5() {
        System.out.println("=== EJERCICIO 5 ===");

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Lista antes: " + numeros);

        Iterator<Integer> it = numeros.iterator();
        int eliminados = 0;

        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 == 0) {
                it.remove();
                eliminados++;
            }
        }

        System.out.println("Lista después: " + numeros);
        System.out.println("Elementos eliminados: " + eliminados);
    }

    
    // EJERCICIO 6
    
    public static void ejercicio6() {
        System.out.println("=== EJERCICIO 6 ===");

        ArrayList<String> lenguajes =
                new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Python", "Go"));

        int primeraPython = lenguajes.indexOf("Python");
        int ultimaPython = lenguajes.lastIndexOf("Python");
        boolean contieneRuby = lenguajes.contains("Ruby");

        List<String> sublista = lenguajes.subList(1, 4);

        System.out.println("Primera aparición de Python: " + primeraPython);
        System.out.println("Última aparición de Python: " + ultimaPython);
        System.out.println("¿Contiene Ruby?: " + contieneRuby);
        System.out.println("Sublista (1 a 4): " + sublista);
    }

    
    // EJERCICIO 7
    
    public static void ejercicio7() {
        System.out.println("=== EJERCICIO 7 ===");

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(45, 12, 78, 23, 67, 34, 89, 56));

        Collections.sort(numeros);
        System.out.println("Orden ascendente: " + numeros);

        numeros.sort(Collections.reverseOrder());
        System.out.println("Orden descendente: " + numeros);

        ArrayList<String> nombres =
                new ArrayList<>(Arrays.asList("Ana", "Pedro", "Luis", "Mariana", "José"));

        Collections.sort(nombres);
        System.out.println("Nombres alfabéticos: " + nombres);

        nombres.sort((a, b) -> a.length() - b.length());
        System.out.println("Nombres por longitud: " + nombres);
    }

    
    // EJERCICIO 8
    
    public static void ejercicio8() {
        System.out.println("=== EJERCICIO 8 ===");

        ArrayList<String> palabras =
                new ArrayList<>(Arrays.asList("casa", "auto", "bicicleta", "avión", "barco", "tren"));

        palabras.removeIf(p -> p.length() < 5);

        System.out.println("Palabras >= 5 caracteres: " + palabras);

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }

        numeros.removeIf(n -> n % 3 == 0);

        System.out.println("Números no divisibles por 3: " + numeros);
    }

    
    // EJERCICIO 9
    
    public static void ejercicio9() {
        System.out.println("=== EJERCICIO 9 ===");

        ArrayList<String> dias =
                new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes"));

        Object[] arregloObj = dias.toArray();
        String[] arregloStr = dias.toArray(new String[0]);

        System.out.println("Longitud Object[]: " + arregloObj.length);
        System.out.println("Longitud String[]: " + arregloStr.length);

        System.out.println("Elementos Object[]:");
        for (Object o : arregloObj) System.out.println(o);

        System.out.println("Elementos String[]:");
        for (String s : arregloStr) System.out.println(s);

        List<String> desdeArreglo = Arrays.asList("A", "B", "C");
        System.out.println("ArrayList desde arreglo: " + desdeArreglo);
    }

    
    // EJERCICIO 10
    
    static ArrayList<String> estudiantes = new ArrayList<>();
    static ArrayList<Double> calificaciones = new ArrayList<>();

    public static void agregarEstudiante(String nombre, Double calificacion) {
        estudiantes.add(nombre);
        calificaciones.add(calificacion);
    }

    public static void eliminarEstudiante(int indice) {
        estudiantes.remove(indice);
        calificaciones.remove(indice);
    }

    public static int buscarEstudiante(String nombre) {
        return estudiantes.indexOf(nombre);
    }

    public static double calcularPromedio() {
        double suma = 0;
        for (double c : calificaciones) suma += c;
        return suma / calificaciones.size();
    }

    public static void listarEstudiantes() {
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(i + ". " + estudiantes.get(i) + " - " + calificaciones.get(i));
        }
    }

    public static void estudiantesAprobados() {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (calificaciones.get(i) >= 3.0) {
                System.out.println(estudiantes.get(i) + " - " + calificaciones.get(i));
            }
        }
    }

    public static void ejercicio10() {
        System.out.println("=== EJERCICIO 10 ===");

        agregarEstudiante("Ana", 4.5);
        agregarEstudiante("Luis", 2.8);
        agregarEstudiante("María", 3.7);
        agregarEstudiante("Carlos", 4.2);
        agregarEstudiante("Elena", 2.5);

        System.out.println("Lista de estudiantes:");
        listarEstudiantes();

        System.out.println("Promedio general: " + calcularPromedio());

        System.out.println("Estudiantes aprobados:");
        estudiantesAprobados();

        eliminarEstudiante(1);

        int pos = buscarEstudiante("María");
        System.out.println("Posición de María: " + pos);

        System.out.println("Lista final:");
        listarEstudiantes();
    }

    
    // MAIN PARA PROBAR TODO
    
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }
}
