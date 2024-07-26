
public class A6_Stings {

	public static void main(String[] args) {
		
		String original = "abcd FGHIJ ABC abc DEFG        ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace("a", "x");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String frase = "Batata Frita com Guarana ";
		String vect[] = frase.split(" ");
		
		System.out.println("Original -> "+original);
		System.out.println("toLowerCase -> "+s01);
		System.out.println("toUpperCase -> "+s02);
		System.out.println("trim -> "+s03);
		System.out.println("substring 2 -> "+s04);
		System.out.println("substring (2 , 9) -> "+s05);
		System.out.println("replace(\"a\", \"x\") -> "+s06);
		System.out.println("indexOf(\"bc\") -> "+i);
		System.out.println("latIndexOf(\"bc\") -> "+j);
		System.out.println("");
		System.out.println(frase);
		System.out.println("Vetor da Franse: ");
		
		for(int c = 0; c < vect.length;c++) {
			System.out.println(vect[c]);
		}
		
	}

}
