/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evalua;

import javax.swing.*;
/**
 *
 * @author Citlali
 */
public class Evalua {

    public static void main(String[] args) {
        // Obtener las coordenadas de los tres vértices del triángulo
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada x del primer vértice:"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada y del primer vértice:"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada x del segundo vértice:"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada y del segundo vértice:"));
        double x3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada x del tercer vértice:"));
        double y3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada y del tercer vértice:"));

        // Calcular las longitudes de los lados del triángulo
        double lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lado2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double lado3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Calcular el perímetro del triángulo
        double perimetro = lado1 + lado2 + lado3;

        // Calcular el área del triángulo usando la fórmula de Herón
        double s = perimetro / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        // Calcular los ángulos del triángulo
        double angulo1 = Math.toDegrees(Math.acos((lado2 * lado2 + lado3 * lado3 - lado1 * lado1) / (2 * lado2 * lado3)));
        double angulo2 = Math.toDegrees(Math.acos((lado1 * lado1 + lado3 * lado3 - lado2 * lado2) / (2 * lado1 * lado3)));
        double angulo3 = 180 - angulo1 - angulo2;

        // Determinar el tipo de triángulo
        String tipoTriangulo;
        if (lado1 == lado2 && lado2 == lado3) {
            tipoTriangulo = "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipoTriangulo = "Isósceles";
        } else {
            tipoTriangulo = "Escaleno";   
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "El triángulo es de tipo " + tipoTriangulo + ".\n"
                + "Su perímetro es: " + perimetro + "\n"
                + "Su área es: " + area + "\n"
                + "Sus ángulos son: \n"
                + "Ángulo 1: " + angulo1 + " grados\n"
                + "Ángulo 2: " + angulo2 + " grados\n"
                + "Ángulo 3: " + angulo3 + " grados");
    }
}
