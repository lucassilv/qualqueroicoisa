package calculadorafila;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;






public class App {
 
public static boolean eInt(String texto) {
	try {
		Integer.parseInt(texto);
		return true;
	} catch (NumberFormatException nfex) {
		return false;
	}
}

public static boolean eDouble(String texto) {
	try {
		Double.parseDouble(texto);
		return true;
	} catch (NumberFormatException nfex) {
		return false;
	}
}

  public static void main(String[] args) {
      Pilha pilha=new Pilha();
      Fila fila=new Fila ();
      File file=new File("C:/Users/Lucas/Documents/NetBeansProjects/Java/CalculadoraFila/src/calculadorafila/arquivo.txt");
         try{
            FileReader reader=new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String linha;
            while((linha=br.readLine()) != null){
              
                    
                        pilha.push(linha);
                   
            }
            br.close();
         } catch (IOException ioe){
             System.out.println(ioe);
         } 
         pilha.setInteiros();
         System.out.println("Size: "+pilha.size());
        String temp = null;
        System.out.println("Count inteiros: "+pilha.countInteiros());
        while(pilha.countInteiros()>=1 && fila.size()>=1 || pilha.size()>=1){
            
            String auxPilha=pilha.pop();
            if(eInt(auxPilha)==true){
                fila.enqueque(auxPilha);
            }else if (eDouble(auxPilha)){
                fila.enqueque(auxPilha);
            }
            else{
                if(fila.size()>=2){
                    int aux1;
                    int aux2;
                    String auxNewArm;
                switch(auxPilha){
                    case "+":
                        
                        aux1=(int) Integer.parseInt(fila.dequeue());
                        aux2=(int) Integer.parseInt(fila.dequeue());
                        auxNewArm = pilha.somar(aux2, aux1);
                        temp=auxNewArm;
                            pilha.push(auxNewArm, true);
                            break;
                    case "-":
                            aux1=(int) Integer.parseInt(fila.dequeue());
                            aux2=(int) Integer.parseInt(fila.dequeue());
                            auxNewArm = pilha.subtrair(aux2, aux1);
                            temp=auxNewArm;
                            pilha.push(auxNewArm, true);
                            break;
                    case "/":
                        
                        aux1=(int) Integer.parseInt(fila.dequeue());
                        aux2=(int) Integer.parseInt(fila.dequeue());
                        auxNewArm = pilha.divisão(aux2, aux1);
                        temp=auxNewArm;
                        pilha.push(auxNewArm, true);
                            
                            break;
                    case "*":
                        aux1=(int) Integer.parseInt(fila.dequeue());
                        aux2=(int) Integer.parseInt(fila.dequeue());
                        auxNewArm = pilha.multiplicação(aux2, aux1);
                            pilha.push(auxNewArm, true);
                            temp=auxNewArm;
                            break;
                    case "pop":
                        if(fila.size()>=1){
                            fila.dequeue();
                        }else {
                        System.out.println("Não a numero para remover");
                        }
                        break;
                    case "dup":
                        if(temp!=null) pilha.push(temp);
                        break;
                    case "swap":break;
                    case "chs":break;
                    case "sqrt":break;
                }
                }else {
                    
                    System.out.println("A operacao "+auxPilha+" nao pode ser efetuada pois nao a numeros");
                }
            }
  }
      int aux=pilha.size();
     
      
     
          System.out.println("O resultado é: "+fila.dequeue());
     
      System.out.println("O tamanho da pilha é "+aux);
  } 
}
