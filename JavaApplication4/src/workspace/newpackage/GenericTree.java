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
        Node aux=new Node(palavra.palavra.charAt(num));
        if(palavra.palavra.length()>num){
        if (root==null){
            root=aux;
            aux.father=root;
        }if(root.subtree.isEmpty()){
            root.subtree.add(aux);
           return add(palavra,num+1);
        }if(root.subtree.contains(aux)){
           return add(palavra,num+1);
        } Node temp=root;
        }
        return true;
    }
}
