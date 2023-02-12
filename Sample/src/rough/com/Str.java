package rough.com;

public class Str {

	public static void main(String[] args) {
		String s= "Bigg Boss";
		String r="13";
		String p=null;
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
        System.out.println(s.concat(" "+r));
        System.out.println(s.indexOf("s" ));
        System.out.println(s.substring(5, 7));
       // System.out.println(p.length());
        System.out.println(s.equalsIgnoreCase(r));
	}

}
