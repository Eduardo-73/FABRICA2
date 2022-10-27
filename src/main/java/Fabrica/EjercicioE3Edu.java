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
         
        
        String menu;
        final double COSTE_MANO_DE_OBRE1 = 0.5, COSTE_MANO_DE_OBRE2 = 0.9;
        final double PORCENTAJE1 = 0.5, PORCENTAJE2 = 0.65;
        final double MANO_DE_OBRA_M1_T1 = 0.15, MANO_DE_OBRA_P1_M2_T2 = 0.22;
        String salir = "Salir";
        double numMateriaPrima;
        double costeProduccion;
        double precioVenta = 0;
                        
        do {       
            
            menu = JOptionPane.showInputDialog( """
                      1. Calcular la viagibilidad de los productos.
                      2. Terminar
                  """).toUpperCase();
            
            switch(menu){
                
                case "1" :
                 
                String menu2 = JOptionPane.showInputDialog("""
                                                           
                                       ------------------------------------
                                                PRODUCTOS
                                            1ºMantecados de Limón 
                                            2ºPolvorones
                                            3ºTurrón de chocolate
                                            4ºTurrón clásica
                                            5ºMazapanes
                                       -------------------------------------  
                                                           """).toUpperCase();
                
                switch(menu2){
                    case "1","3", "M1", "T1" :
                        
                        numMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la materia prima a utilizar: "));
                        
                        if(numMateriaPrima >= COSTE_MANO_DE_OBRE1 && numMateriaPrima >= COSTE_MANO_DE_OBRE2){
                
                        costeProduccion = numMateriaPrima + MANO_DE_OBRA_M1_T1;
                        precioVenta = costeProduccion + (costeProduccion * PORCENTAJE1);
                        
                        JOptionPane.showMessageDialog(null, """
                                                            El coste de produccion es de %.2f € y el precio de venta es de
                                                            %.2f €.
                                                            """.formatted(costeProduccion, precioVenta));
                        }
                         if(precioVenta >= 2500){
                            System.out.println("Hay beneficios ");
                        }else{
                            System.out.println("No hay beneficios ");
                        }
                     break;
                    case "2", "4", "5", "P1", "T2", "M2" :
                        
                        numMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog
                          ("Introduce la materia prima a utilizar: "));
                        
                        if(numMateriaPrima >= COSTE_MANO_DE_OBRE1 && numMateriaPrima >= COSTE_MANO_DE_OBRE2){

                        costeProduccion = numMateriaPrima + MANO_DE_OBRA_P1_M2_T2;
                        precioVenta = costeProduccion + (costeProduccion * PORCENTAJE2);
                        
                        JOptionPane.showMessageDialog(null, """
                                                            El coste de produccion es de %.2f € y el precio de venta es de
                                                            %.2f €.
                                                            """.formatted(costeProduccion, precioVenta));
                        }
                        if(precioVenta >= 2500){
                           JOptionPane.showMessageDialog(null,"Hay beneficios ");
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay beneficios ");
                        }
                     break;
                    default :
                }
                
                break;
                default :        
            }
            
            
        } while (!salir.equalsIgnoreCase(salir));
    }
}
