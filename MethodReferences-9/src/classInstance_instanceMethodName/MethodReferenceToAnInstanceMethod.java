package classInstance_instanceMethodName;

public class MethodReferenceToAnInstanceMethod {

	public void myMethod(){  
		System.out.println("Instance Method");  
	    } 
	public static void main(String[] args) {
		
		//with method reference
		MethodReferenceToAnInstanceMethod mr=new MethodReferenceToAnInstanceMethod();
		MyInterface ref=mr::myMethod;
		ref.display();

		//with lembda
		MyInterface res=()->System.out.println("Instance Method2"); 
           res.display();
		 
		

	}

}

@FunctionalInterface 
interface MyInterface{  
    void display();  
} 
