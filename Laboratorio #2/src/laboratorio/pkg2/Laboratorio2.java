/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author ANGEL VAIL
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String[] nombre = new String[10];
        String[] cargo = new String[10];
        float matriz[][], igss=(float) 0.0483;
        float isr1 = (float) 0.05, isr2 = (float) 0.06, isr3 = (float) 0.08;
        float sumafilas = 0, impuestos=0, totdesc = 0, totliq = 0, sumadesc=0;
        
        matriz = new float[10][10];
        
        for(int filas = 0; filas<10; filas++){
            
            System.out.print("\nNombre del empleado: ");
            nombre[filas] = leer.nextLine();
            System.out.print("Puesto: ");
            cargo[filas] = leer.nextLine();            
                        
            Random r = new Random();
            
            for(int col = 0; col < 5; col++){
                
                matriz[filas][col] = (int) (Math.random()*3000);
                
                
            }
            
            
            for(int l=6; l<7; l++){
                
                matriz[filas][l] = (int) 150;
                
            }
            
            for(int l=7; l<8; l++){
                
                matriz[filas][l] = (int) 200;
                
            }
            
            for(int l=8; l<9; l++){
                
                matriz[filas][l] = (int) (Math.random()*300);
                
            }
            
            
            
        }
        
        
        //imprime todo
        System.out.println("\n\tNombre:" + "\t\t\tPuesto: "+"\tSuel Ord: "+"\tSuel Extr: "+"\tBonific: "+"\tComisi: "+"\tOtros: "+"\t     Sueldo bruto: "+"\tIGSS: "+"\t\tISR: "+"\t\t\tAnticip: "+"\tDescuent: "+"\tOtros: "+"\t\tTot desc: "+"\tTot liq: ");                                                                                                               
        
        
        for(int i = 0; i<10; i++){
            
            System.out.print("\n\t"+nombre[i]+"\t"+ cargo[i]+"\t");
            
            
            for(int j = 0; j<5; j++){
                
                
                System.out.print(matriz[i][j]+"\t\t");
                
                
            }
            sumafilas=0;
            for (int k = 0; k<5; k++){
                
                sumafilas += matriz[i][k];
                
                
            }
            
            //Sueldo bruto
            
            System.out.print(sumafilas);
            
            //calculo del IGSS            
                        
            System.out.print("\t\t"+igss * sumafilas);
            
            //calculo del ISR
            
            if(sumafilas > 6000 && sumafilas < 7500){
                
                
                System.out.print("\t"+ isr1 * sumafilas);
                impuestos = ((igss * sumafilas) + (isr1 * sumafilas));
                
                
            }else if(sumafilas > 7500 && sumafilas < 9000){
                
                
                System.out.print("\t"+ isr2 * sumafilas);
                impuestos = ((igss * sumafilas) + (isr2 * sumafilas));
                
            }else if(sumafilas > 9000){
                
               
               System.out.print("\t"+ isr3 * sumafilas);
               impuestos = ((igss * sumafilas) + (isr3 * sumafilas));
                
            }
            
            
            for(int l=6; l<7; l++){
                
                
                 System.out.print("\t\t\t "+matriz[i][l]);
                
            }
            
            
            for(int l=7; l<8; l++){
                
                
                 System.out.print("\t\t "+matriz[i][l]);
                
            }
            
            for(int j = 8; j<9; j++){
                
                
                System.out.print("\t\t"+matriz[i][j]);
                
                
            }
            sumadesc = 0;
            for (int k = 6; k<9; k++){
                
                sumadesc += matriz[i][k];
                
            }
            
            //Suma impuestos
            totdesc = sumadesc + impuestos;
            System.out.print("\t\t"+totdesc);
            
            totliq = sumafilas-totdesc;
            System.out.print("\t"+totliq);
            
            
            
            
            
        }
        
        
        
                      
            
        
        
        
        
        
        
    }
    
}
