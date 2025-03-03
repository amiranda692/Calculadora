package com.calculadora;


public class CalculadoraFuncionalidad {

    private double numero1;
    private double numero2;
    private double resultado;
    public String operacion;
   
    
   public double getNumero1(){
       return numero1;
   }
   
   public double getNumero2(){
       return numero2;
   }
   
   public double getResultado(){
       return resultado;
   }
   
   public String getOperacion(){
       return operacion;
   }
       
   public void setNumero1(double numero){
       this.numero1 = numero;
   }
    
   public void setNumero2(double numero){
       this.numero2 = numero;
   }
   
   public void setOperacion(String operacion){
       this.operacion = operacion;
   }
   
   public void setNumero2(String numero2) {
        try {
            this.numero2 = Double.parseDouble(numero2);  // Convertir a double
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número válido.");
            this.numero2 = 0; // Asignamos 0 en caso de error
        }
    }
   
   public void setNumero1(String numero1) {
        try {
            this.numero2 = Double.parseDouble(numero1);  // Convertir a double
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número válido.");
            this.numero1 = 0; // Asignamos 0 en caso de error
        }
    }
   
   
   //operaciones calculadora
   public void calcular(){
   
       switch (operacion){
           case "+":
               resultado = numero1 + numero2;
               break;
           case "-":
               resultado = numero1 - numero2;
               break;
           case "*":
               resultado = numero1 * numero2;
               break;
           case "/":
               if (numero2 != 0){
                   resultado = numero1 / numero2;            
               } else{
               throw new ArithmeticException("No se puede dividir por cero.");
               }
               break;
           case "%":
               resultado = numero1 * (numero2 / 100);
           default:
               throw new UnsupportedOperationException("Operación no soportada.");  
       }
   }
   
   //limpiar variables
    public void limpiar(){
        numero1 = 0;
        numero2 = 0;
        operacion = "";
   }
   
   
   
   
}
