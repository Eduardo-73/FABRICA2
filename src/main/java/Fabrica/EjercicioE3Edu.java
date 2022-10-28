/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Fabrica;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class EjercicioE3Edu {

    public static void main(String[] args) {
         
        //Inicializo las variables necesarias
        String menu;
        String menu2;
        final double COSTE_MANO_DE_OBRE1 = 0.5, COSTE_MANO_DE_OBRE2 = 0.9;
        final double COSTE_MINIMO_MATERIAPRIMA = 0.1, COSTE_MAXIMO_MATERIAPRIMA = 1;
        final double PORCENTAJE1 = 0.5, PORCENTAJE2 = 0.65;
        double numMateriaPrima;
        double numManoObra;
        double costeProduccion;
        double precioVenta = 0;
        
        
        do {       
            
            menu = JOptionPane.showInputDialog( """
                      1. Calcular la viagibilidad de los productos.
                      2. Terminar
                  """).toUpperCase();
            
            switch(menu){
                
                case "1" :
            do {  
                
                menu2 = JOptionPane.showInputDialog("""
                                       
                                         INTRODUCE EL CÓDIGO DEL PRODUCTO            
                                       ------------------------------------
                                                PRODUCTOS
                                            1ºMantecados de Limón (M1)
                                            2ºPolvorones (P1)
                                            3ºTurrón de chocolate (T1)
                                            4ºTurrón clásica (T2)
                                            5ºMazapanes (M2)
                                         --------------------------------
                                             PARA TERMINAR EL PROGRAMA
                                             INTRODUZCA 'SALIR'
                                         --------------------------------           
                                       -------------------------------------  
                                                           """).toUpperCase();
               
                if(menu2.equals("M1")|| menu2.equals("P1")
                       || menu2.equals("M2")){
                   
                   numMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la materia prima a utilizar: "));
                        
                        while(numMateriaPrima <= COSTE_MINIMO_MATERIAPRIMA && numMateriaPrima >= COSTE_MAXIMO_MATERIAPRIMA){
                              numMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la materia prima a utilizar: "));
                        }
                        numManoObra = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la mano de obra a utilizar: "));
                        
                         while(numManoObra <= COSTE_MANO_DE_OBRE1 && numManoObra >= COSTE_MANO_DE_OBRE2){
                              numManoObra = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la mano de obra a utilizar: "));
                        }

                        costeProduccion = numMateriaPrima + numManoObra;
                        precioVenta = costeProduccion + (costeProduccion * PORCENTAJE1);
                        
                         JOptionPane.showMessageDialog(null, """
                                                            El coste de produccion es de %.2f € y el precio de venta es de
                                                            %.2f €.
                                                            """.formatted(costeProduccion, precioVenta));
                        
                         if(precioVenta >= 2500){
                          JOptionPane.showMessageDialog(null,"Hay beneficios ");
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay beneficios ");
                        }
               } 
                 if(menu2.equals("T1")|| menu2.equals("T2")){
                   
                   numMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la materia prima a utilizar: "));
                        
                        while(numMateriaPrima <= COSTE_MINIMO_MATERIAPRIMA && numMateriaPrima >= COSTE_MAXIMO_MATERIAPRIMA){
                              numMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la materia prima a utilizar: "));
                        }
                        numManoObra = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la mano de obra a utilizar: "));
                        
                         while(numManoObra <= COSTE_MANO_DE_OBRE1 && numManoObra >= COSTE_MANO_DE_OBRE2){
                              numManoObra = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la mano de obra a utilizar: "));
                        }

                        costeProduccion = numMateriaPrima + numManoObra;
                        precioVenta = costeProduccion + (costeProduccion * PORCENTAJE2);
                        
                         JOptionPane.showMessageDialog(null, """
                                                            El coste de produccion es de %.2f € y el precio de venta es de
                                                            %.2f €.
                                                            """.formatted(costeProduccion, precioVenta));
                        
                         if(precioVenta >= 2500){
                          JOptionPane.showMessageDialog(null,"Hay beneficios ");
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay beneficios ");
                        }
               } 

            }while(!(menu2.equalsIgnoreCase("salir")));
            
                break;
                case "2" :
                    JOptionPane.showMessageDialog(null, "Para terminar el programa introduce 'Salir'");
                default :        
            }
            

           //la exclamacion con el parentesis significa que todo lo que todo lo
           // no entre en el parentesis significa falso
        } while (!(menu.equalsIgnoreCase("salir")));

            

    }
}
