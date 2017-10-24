/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafila;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Fila {
  private List<String> fila = new LinkedList<String>();
  
  public void enqueque(String qualquerCoisa) {
    this.fila.add(qualquerCoisa);
  }
    public String dequeue() {
    return this.fila.remove(0);
  }
    public int size(){
    return this.fila.size();
    }
    public String head(){
    return this.fila.get(0);
    }
}
