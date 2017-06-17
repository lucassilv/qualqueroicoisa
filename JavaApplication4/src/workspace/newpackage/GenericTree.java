/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workspace.newpackage;

import java.util.ArrayList;

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
        
        private char letra;
        private ArrayList<Node> children;
        private Palavra palavra;
        private boolean ultima;
        public Node(char letra, Palavra palavra) {
            this.letra = letra;
            this.children = new ArrayList<Node>();
            this.palavra = palavra;
            this.ultima=ultima;
        }
    }
    public void add(Palavra palavra){
        if(root==null){
            root= new Node(palavra.palavra.charAt(0), palavra);
        }
    }
}
