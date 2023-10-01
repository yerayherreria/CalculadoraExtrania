package calculadora;

public class Calculadora {
	private static StringBuilder sb=new StringBuilder();
	
	public static String enviar(String num,String ope) {
		sb.append(num);
		sb.append(ope);
		return sb.toString();
	}

}
