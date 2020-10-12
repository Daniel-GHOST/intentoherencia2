/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos_HER;


public class OperacionesImpl extends Operaciones {
    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    public double resultado;
    private double sumaElectrodomesticos;
    private double sumaLavadoras;
    private double sumaTelevisores;
    @Override
    public void ResFin(double ResFin){
        resultado = sumaElectrodomesticos;
     }
    @Override
    public void ResSumEl(double ResSumLav){
        resultado = sumaLavadoras;        
     }
    @Override
    public void ResSumTel(double ResSumTel){
        resultado = sumaTelevisores;
     }
}
