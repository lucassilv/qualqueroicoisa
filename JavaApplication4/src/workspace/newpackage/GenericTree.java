/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workspace.newpackage;

import java.util.LinkedList;

/**
 *
 * @author Lucas
 */
public class GenericTree {
    
    private Node root;  
    private int count;
    
    public GenericTree() {
        this.root = null;
        this.count = 0;
    }

   
    
   
    public class Node{
        Node father;
        private char element;
        private LinkedList<Node> subtree;
        private Palavra palavra;
        private boolean ultima;
        public Node(char element) {
            this.element = element;
            this.subtree = new LinkedList<Node>();
        }
    }
    public boolean add(Palavra palavra,int num){
        if(num>palavra.palavra.length()){ 
        count++;
        return true;
        }else{
        Node aux=new Node(palavra.palavra.charAt(num));
        if (root==null){
            root=aux;
            add(palavra,num+1);
            if(palavra.palavra.length()-1==num){
            root.ultima=true;
            }
        }if(root.subtree.isEmpty()){
            aux.father=root;
            root.subtree.add(aux);
            if(palavra.palavra.length()-1==num){
            root.ultima=true;
            }
           return add(palavra,num+1);
        }
        Node rootAux=root;
        auxAdd(rootAux,palavra,num);
        }
        
        
        return false;
    }
     private boolean auxAdd(Node rootAux, Palavra palavra, int num) {
         if(num>palavra.palavra.length()){ 
            return true;
         }
        Node aux=new Node(palavra.palavra.charAt(num));
        if(rootAux.subtree.contains(aux)){
        int indice = 0;
            for(int i=0;i<root.subtree.size();i++){
                if(rootAux.subtree.get(i).element==palavra.palavra.charAt(num))indice=i;
            }
        rootAux=rootAux.subtree.get(indice);
        return auxAdd(rootAux,palavra,num+1);
        }else {
            rootAux.subtree.add(aux);
            if(palavra.palavra.length()-1==num){
            root.ultima=true;
            }
            aux.father=rootAux;
            rootAux=root.subtree.getLast();
            return auxAdd(rootAux,palavra,num+1);
        }
    }
      public LinkedList <String> getPalavras(String palavra,int i){
        
        LinkedList <String> aux=new LinkedList();
        if(root.element==palavra.charAt(i)){
            Node auxRoot=root;
        if(root.ultima==true) aux.add(""+root.element);
            String formado=root.element+"";
            return auxGetPalavras(auxRoot, aux, palavra, formado,i+1);
        }else
          return aux;
       }
      
      private LinkedList <String> auxGetPalavras(Node auxRoot,LinkedList<String> aux,String palavra,String formando,int i){
          aux.add("");
          return aux;
       }
}
