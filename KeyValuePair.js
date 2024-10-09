/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nosqldatabasedemo;

public class KeyValuePair {
    private final String key;
    private String value;

    // Constructor
    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    // Getters
    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    // Setters
    public void setValue(String value) {
        this.value = value;
    }
}
