/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nosqldatabasedemo;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la base de datos clave-valor
        KeyValueStore kvStore = new KeyValueStore();

        // 1. Almacenar datos del primer usuario
        kvStore.put("usuario_1_nombre", "Martin");
        kvStore.put("usuario_1_edad", "21");
        kvStore.put("usuario_1_ciudad", "Callao");

        // 2. Almacenar datos del segundo usuario
        kvStore.put("usuario_2_nombre", "Dalia");
        kvStore.put("usuario_2_edad", "22");
        kvStore.put("usuario_2_ciudad", "Arequipa");

        // 3. Almacenar datos del tercer usuario
        kvStore.put("usuario_3_nombre", "keiko");
        kvStore.put("usuario_3_edad", "49");
        kvStore.put("usuario_3_ciudad", "Lima");

        // 4. Almacenar datos del cuarto usuario
        kvStore.put("usuario_4_nombre", "Johan");
        kvStore.put("usuario_4_edad", "24");
        kvStore.put("usuario_4_ciudad", "Trujillo");

        // 5. Recuperar datos de los usuarios
        kvStore.get("usuario_1_nombre");
        kvStore.get("usuario_1_edad");
        kvStore.get("usuario_2_nombre");
        kvStore.get("usuario_2_ciudad");
        kvStore.get("usuario_3_nombre");
        kvStore.get("usuario_3_ciudad");
        kvStore.get("usuario_4_nombre");
        kvStore.get("usuario_4_edad");

        // 6. Mostrar todos los datos almacenados
        kvStore.displayAll();
    }
}
