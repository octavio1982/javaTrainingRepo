
public class HelloWorld {


	public HelloWorld(){
		System.out.println("Constructor vacio");
	}


	public HelloWorld(int a){
		System.out.println("Constructor 2:"+a);
	}


	public HelloWorld(String cad){
		System.out.println("Constructor 3:"+cad);
	}


	public static void main(String[] args) {
		HelloWorld h = new HelloWorld("fasfasf");
       
	}

	
}
