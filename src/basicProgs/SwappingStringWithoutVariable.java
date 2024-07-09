package basicProgs;

public class SwappingStringWithoutVariable {

	public static void main(String[] args) {
		
		String a="Durray";
		String b="Nayab";
		int lena=a.length();
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		a=a+b;
		b=a.substring(0,lena);
		a=a.substring(lena,a.length());
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		

	}

}
