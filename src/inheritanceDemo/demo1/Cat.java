package inheritanceDemo.demo1;

public class Cat extends Animal {
	public void sound() {
		System.out.println("my crying sound mau-mau:"+sound);
		
	}
 public void display() {
	 System.out.println("my name is "+aname);
	 //comment akshjj
	 //devloper d2: doing changes in  cat child class of Animal
}
 public static void main(String[] args) {
	Dog  labrador=new Dog();
	labrador.aname="tommy";
	labrador.display();
	labrador.eat();
	
	Cat whitecat=new Cat();
	
	whitecat.aname="pinky";
	whitecat.display();
	whitecat.eat();
	whitecat.sound();
	
	
	
	
	 
}
 

}
