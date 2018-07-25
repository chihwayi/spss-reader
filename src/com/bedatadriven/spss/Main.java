/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bedatadriven.spss;

import java.io.IOException;

/**
 *
 * @author Gina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        SpssDataFileReader reader = new SpssDataFileReader("download-3.sav");
    
    // Print variables present in the file
    for(SpssVariable variable : reader.getVariables()) {
        System.out.println(variable.getVariableLabel());
    }
    
    // Read the cases
    while(reader.readNextCase()) {
        double var0 = reader.getDoubleValue(0);
        String var1 = reader.getStringValue(1);
    }
 
    }
    
}
