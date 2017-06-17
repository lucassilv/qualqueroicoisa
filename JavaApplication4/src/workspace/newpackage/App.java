/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workspace.newpackage;

import java.util.Scanner;


/**
 *
 * @author Lucas
 */
public class App {
        
    public static void caseBusca(String caracteres) {
        
    }
        
   
        
        
    public static void main (String[]args) {
            
            Scanner sc=new Scanner(System.in); 
               
            int op;
            do{
                System.out.println  ("1. Exibir índice\n" +
                                    "0. Sair");
                                    op=sc.nextInt();
                                          switch(op){
                                        case 1:
                                           System.out.println("Digite a palavra ou as inicias da palavra que busca: ");
                                           String caracteres=sc.nextLine();
                                           caseBusca(caracteres);
                                           break;
                                        case 0: 
                                             System.out.println("Finalizando");
                                        default: 
                                               System.out.println("Opção invalida");
                                               break;
                                    }
            }while(op!=0);
            
    }

    
}
