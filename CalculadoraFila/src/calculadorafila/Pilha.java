package calculadorafila;



class  Pilha{

    public String somar(int a, int b) {
        double c=a+b;
        int abc=(int)c;
                return abc+"";
                
        }

   public String subtrair(int a,int b) {
     
         double c=a-b;
        
                return c+"";
    }
    
    public String divisão(int a,int b) {
       
           double c=a/b;
           int abc=(int)c;
                return abc+"";
    }
      
    public String multiplicação(int a,int b) {
     double c=a*b;
        int abc=(int)c;
                return abc+"";
               
    }





  
    private class Node{
        String character;
        boolean resultado;
        boolean inteiro;
        Node next;
     
        
        
        public Node (String character ,boolean resultado){
            this.character=character;
           this.resultado=resultado;
        }
        public Node (boolean inteiro,String character){
            this.character=character;
            this.inteiro=true;
        }
        public Node (String character){
            this.character=character;
        }
    }
  Node head;
  Node tail;
  int count;
  int countResultado;
  public Pilha(){
    head=null;
    tail=null;
    count=0;
    countResultado=0;
  }
  public void push(String character){
    
    Node add= new Node(character);
    if(isEmpty()){
      head=add;
      tail=add;
    }
    else{
    head.next=add;
    head=add;
    }
    count++;
    }
  public void push(String character, boolean resultado){
   
    Node add= new Node(character , resultado);
    if(isEmpty()){
      head=add;
      tail=add;
    }
    else{
    
    add.next=tail;
    tail=add;
    tail.resultado=true;
    }
    count++;
    }
  
  public void push( boolean inteiro,String character){
    
    Node add= new Node(character , inteiro);
    if(isEmpty()){
      head=add;
      tail=add;
    }
    else{
    
    head.next=add;
    head=add;
    }
    count++;
    }
  
  
  public String pop(){
      
      String aux;
    if(isEmpty()){  return "Lista vazia";
    }else
        if(tail.inteiro==true) tail.inteiro=false;
        if(tail.resultado==true) tail.resultado=false;
     aux=tail.character;
     Node aux2=tail.next;
     tail=aux2;
     count--;
     return aux;
  }
  public int size(){ return count; }
  
  public String top(){ return head.character; }
  
  public boolean isEmpty(){
    if(head==null){
    return true;
    } else return false;
  }
  public void clear(){
    head=null;
    count=0;
    tail=null;
  }
  private boolean eInt(String texto) {
	try {
		Integer.parseInt(texto);
		return true;
	} catch (NumberFormatException nfex) {
		return false;
	}
}
  public void setInteiros(){
      Node aux=tail;
      while(aux!=null){
          
            if(eInt(aux.character)==true){
                aux.inteiro=true;
            }

            aux=aux.next;
        }
      
  }
  public int countInteiros(){
   Node aux=tail;
      int contador=0;
      while(aux!=null){
          
            if(aux.inteiro==true){ 
                
                contador++;
            } 
            aux=aux.next;
        }
      return contador;
  }
   
    @Override
    public String toString() {
        Node aux=tail;
        String concatena ="";
        while(aux!=null){
            concatena = concatena+aux.character+ "\n"; 
            aux=aux.next;
        }
        return concatena;
    }
    
}
