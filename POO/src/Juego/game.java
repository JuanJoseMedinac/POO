package Juego;

import java.util.Random;
import java.util.Scanner;

public class game {
   
    private int piedra;
    private String papel;
    private String tijera;
    private String jugador;
    private int eleccion;

    Scanner captura= new Scanner (System.in);

    public void iniciar(){

        System.out.println("ingrse el nombre del jugador");
        jugador=captura.next();

    }
    
    public void jugar(){
        System.out.println(jugador+ " ingresa tu opción \n1 piedra  \n2 papel \n3 tijera");
        eleccion=captura.nextInt();
        Random aleatorio =new Random ();
        piedra=aleatorio.nextInt(2)+1;
        
        System.out.println(" ha lanzado piedra");
    }
  
        public void finalizar(){ 
            if (piedra==1 && eleccion ==3 ){
                System.out.println("saco piedra, ganaste " +jugador);
            }else if(piedra==2 && eleccion ==1){
                System.out.println("saco papel, ganaste " +jugador);
            }else if(piedra==3 && eleccion ==3){
                System.out.println("saco tijera, ganaste " +jugador);
            }else if(piedra==2 && eleccion ==1){
                System.out.println("saco papel, perdiste " +jugador);
            }else if(piedra==3 && eleccion ==3){
                System.out.println("saco tijera, perdiste " +jugador);
            }else if(piedra==3 && eleccion ==1){
                System.out.println("saco piedra, perdiste " +jugador);

            
     }
    
}
}