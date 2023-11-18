package com.shir.formula.model.service;
import com.shir.formula.model.MCalcular;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Archivo {
    public static void add(MCalcular mCalcular, String ruta){
        File archivo;
        FileWriter fileWriter;
        PrintWriter printWriter = null;

        try{
            archivo = new File(ruta);
            fileWriter = new FileWriter(archivo,true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(mCalcular.getResult1() +
                    "," + mCalcular.getResult2());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }finally {
            try
            {
                if (printWriter!= null){
                    printWriter.close();
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
