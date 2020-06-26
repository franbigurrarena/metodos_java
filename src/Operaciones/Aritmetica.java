
package Operaciones;

public class Aritmetica {
    // Atributos
    int a;
    int b;
    
    // metodo
   public void suma(){
       int resultado = a + b;
       System.out.println("resultado = " + resultado);
   }
   public int sumarConRetorno(){
       int resultado = a + b;
       return resultado;
   }
   
  public int sumarConArgumento(int a, int b){
      this.a = a;
      this.b = b;
      return this.sumarConRetorno();
  }
}
