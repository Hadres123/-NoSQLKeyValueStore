/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nosqldatabasedemo;

import java.util.ArrayList;
import java.util.List;

public class KeyValueStore {
    private final List<KeyValuePair> store;  // Lista para almacenar pares clave-valor

    // Constructor que inicializa la lista
    public KeyValueStore() {
        store = new ArrayList<>();
    }

    // Método para almacenar datos en la lista
    public void put(String key, String value) {
        for (KeyValuePair pair : store) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);  // Actualiza el valor si la clave ya existe
                System.out.println("Updated: " + key + " -> " + value);
                return;
            }
        }
        // Si la clave no existe, añade un nuevo par clave-valor
        store.add(new KeyValuePair(key, value));
        System.out.println("Stored: " + key + " -> " + value);
    }

    // Método para recuperar datos de la lista usando la clave
    public String get(String key) {
        for (KeyValuePair pair : store) {
            if (pair.getKey().equals(key)) {
                System.out.println("Retrieved: " + key + " -> " + pair.getValue());
                return pair.getValue();
            }
        }
        System.out.println("Key not found: " + key);
        return null;
    }

    // Método para eliminar datos usando la clave
    public void remove(String key) {
        for (KeyValuePair pair : store) {
            if (pair.getKey().equals(key)) {
                store.remove(pair);
                System.out.println("Removed key: " + key);
                return;
            }
        }
        System.out.println("Key not found: " + key);
    }

    // Método para mostrar todo el contenido almacenado
    public void displayAll() {
        System.out.println("Current store contents:");
        for (KeyValuePair pair : store) {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }
}
