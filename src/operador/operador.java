package operador;
import java.util.Scanner;

public class operador {
    private int operador1;
    private int operador2;
    private String text="caca";
    
    operador(int op1, int op2){
        this.operador1=op1;
        this.operador2=op2;
    }
    public int suma(){
        int suma;
        suma=operador1+operador2;
        return suma;   
    }
    public int resta(){
        int resta;
        resta=operador1-operador2;
        return resta;
    }
    public int multiplicar(){
        int multi;
        multi=operador1*operador2;
        return multi;
    }
    public double dividir(){
        double div;
        div=operador1/operador2;
        return div;
    }
    public void calcular_maximo(){
        if (operador1>operador2){
            System.out.println("El "+operador1+" es el máximo.");
        }
            else if(operador1==operador2){
                    System.out.println("Los dos valores son iguales. No hay MINIMO");
                    }
        
    }
    public void calcular_minimo(){
        if (operador1<operador2){
            System.out.println("El "+operador1+" es el mínimo.");
        }
            else if(operador1==operador2){
                    System.out.println("Los dos valores son iguales. No hay MINIMO");
                    }
    }
    public void intercambiar_numeros(){
        int a;
        a=operador2;
        operador2=operador1;
        operador1=a; 
        System.out.println("El primer valor ahora es el "+operador1+" y el segundo valor ahora es el"+operador2);
    }
    public void resultado(){
        System.out.println("La suma de los dos números es: "+suma());
        System.out.println("La resta de los dos números es: "+resta());
        System.out.println("La multiplicación de los dos números es: "+multiplicar());
        System.out.println("La división de los dos números es: "+dividir());
        calcular_maximo();
        calcular_minimo();
        intercambiar_numeros();
        
    }
    
   public static void main(String[] args) {
       int op1=0,op2=0;
       int sn;
       int elegir;
       int operacion;
   Scanner sc=new Scanner(System.in);
       do{
       System.out.println("Introduzca el primer valor con el que desea operar ");
       op1=sc.nextInt();
       System.out.println("Introduzca el segundo valor ");
       op2=sc.nextInt();
       operador m=new operador(op1,op2);
       
           System.out.println("¿Desea realizar todas las operaciones a la vez o elegir una?\n(1) para haerlas todas\n(2)para elegir una");
           elegir=sc.nextInt();
           if(elegir==1){
                m.resultado();    
           }
           else if(elegir==2){
               System.out.println("Elija una operación:\n(1) Sumar\n(2) Restar\n(3) Multiplicar\n(4) Dividir\n(5) Calcular máximo\n(6) Calcular mínimo\n(7) Intercambiar números");
               operacion=sc.nextInt();
               switch(operacion){
                    case 1:
                        System.out.println("La suma de los dos números es: "+m.suma());
                    break;
                    case 2:
                        System.out.println("La resta de los dos números es: "+m.resta());
                    break;
                    case 3:
                        System.out.println("La multiplicación de los dos números es: "+m.multiplicar());
                    break;
                    case 4:
                        System.out.println("La división de los dos números es: "+m.dividir());
                    break;
                    case 5:
                        m.calcular_maximo();
                    break;
                    case 6:
                        m.calcular_minimo();
                    break;
                    case 7:
                        m.intercambiar_numeros();
                    break;
                    default:
                        System.out.println("Introduzca una operación válida.");
               }
           }
       System.out.println("¿Desea realizar otra operación? \n(1) para SI\n(2) para NO");
       sn=sc.nextInt();
       }while(sn==1);
       
   }
}
