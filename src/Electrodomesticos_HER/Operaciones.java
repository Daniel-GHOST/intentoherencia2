/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos_HER;

/**
 *
 * @author Daniel
 */
public class Operaciones extends Ejecutar{
    public double resultado;
    private double sumaElectrodomesticos;
    private double sumaLavadoras;
    private double sumaTelevisores;
    public void ResFin(double ResFin){
        resultado = sumaElectrodomesticos;
     }
    public void ResSumEl(double ResSumLav){
        resultado = sumaLavadoras;        
     }
    public void ResSumTel(double ResSumTel){
        resultado = sumaTelevisores;
     }
    
}
