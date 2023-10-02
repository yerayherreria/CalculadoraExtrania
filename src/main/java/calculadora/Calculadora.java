package calculadora;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Calculadora {
	private static StringBuilder sb=new StringBuilder();
	
	public static void borrar() {
		 sb.setLength(0);
	}
	public static String enviar(String num,String ope) {
		sb.append(num);
		sb.append(ope);
		return sb.toString();
	}
	public static int solucionar() {
		int total=0;
		String operadorUlt="";
		StringBuilder num = new StringBuilder();
		
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='+') {
				if(operadorUlt.equals("+")) {
					total+=Integer.valueOf(num.toString());
				} else if(operadorUlt.equals("-")) {
					total-=Integer.valueOf(num.toString());
				} else {
					total=Integer.valueOf(num.toString());
				}
				operadorUlt="+";
				num.setLength(0);
			} else if(sb.charAt(i)=='-') {
				if(operadorUlt.equals("+")) {
					total+=Integer.valueOf(num.toString());
				} else if(operadorUlt.equals("-")) {
					total-=Integer.valueOf(num.toString());
				} else {
					total=Integer.valueOf(num.toString());
				}
				operadorUlt="-";
				num.setLength(0);
			} else {
				num.append(sb.charAt(i));
			}
		}
		if(operadorUlt.equals("+")) {
			total+=Integer.valueOf(num.toString());
		} else if(operadorUlt.equals("-")) {
			total-=Integer.valueOf(num.toString());
		} else {
			total=Integer.valueOf(num.toString());
		}
		return total;
	}
	
	

}
