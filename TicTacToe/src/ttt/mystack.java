package ttt;

import java.util.LinkedList;

import javax.swing.ImageIcon;

public class mystack {
	 private LinkedList ll=new LinkedList();
	 String name;
	 int count=0;
	 mystack(String name){
		 this.name=name;
	 }
	 public void push(Object o){
		 ll.addFirst(o);
		 count++;
	 }
	 public Object pop(){
		 Object obj=ll.removeFirst();
		 count--;
		 return obj;
	 }
	 public int count(){
		 return count;
	 }
	 public Object peek(){
		 return ll.getFirst();
	 }
	 public boolean empty(){
		 return ll.isEmpty();
	 }
}