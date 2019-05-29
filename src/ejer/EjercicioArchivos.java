/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer;

import java.io.*;
/*
 *
 * @author jmaciasb
 */
public class EjercicioArchivos {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\jmaciasb\\Documents\\NetBeansProjects\\GestionDeArchivos\\x\\a.txt");
        
        if (f.exists()){
            System.out.println("Existe");
            System.out.println(f.length());
            if (f.isDirectory()){
                System.out.println("Es directorio");
                String[] carpetas = f.list();
                for (String carpeta : carpetas){
                    System.out.println(carpeta);
                }
            }
            if (f.isFile()){
                System.out.println("Es archivo");
            }
        }else{
            System.out.println("No existe");
        }
    }

    public void listarArchivos(){
        
    }


}
