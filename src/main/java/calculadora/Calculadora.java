package calculadora;

import java.text.DecimalFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Calculadora {
	private static StringBuilder sb=new StringBuilder();
	//Método para borrar
	public static void borrar() {
		 sb.setLength(0);
	}
	//Método para almacenar y mostrar la operacion.
	public static String enviar(String num,String ope) {
		sb.append(num);
		sb.append(ope);
		return sb.toString();
	}
	//Método para resolver cuenta.
	public static String solucionar() {
		String resultado="";
		DecimalFormat df = new DecimalFormat("#.##");
		Double total=0.0;
		String operadorUlt="";
		StringBuilder num = new StringBuilder();
		try {
			for(int i=0;i<sb.length();i++) {
				if(sb.charAt(i)=='+') {
					if(operadorUlt.equals("+")) {
						total+=Double.valueOf(num.toString());
					} else if(operadorUlt.equals("-")) {
						total-=Double.valueOf(num.toString());
					} else {
						total=Double.valueOf(num.toString());
					}
					operadorUlt="+";
					num.setLength(0);
				} else if(sb.charAt(i)=='-') {
					if(operadorUlt.equals("+")) {
						total+=Double.valueOf(num.toString());
					} else if(operadorUlt.equals("-")) {
						total-=Double.valueOf(num.toString());
					} else {
						total=Double.valueOf(num.toString());
					}
					operadorUlt="-";
					num.setLength(0);
				} else {
					num.append(sb.charAt(i));
				}
			}
			if(operadorUlt.equals("+")) {
				total+=Double.valueOf(num.toString());
			} else if(operadorUlt.equals("-")) {
				total-=Double.valueOf(num.toString());
			} else {
				total=Double.valueOf(num.toString());
			}
		} catch (Exception e) {
			total=-1.0;
		}
		//Validación de error
		if(total==-1.0) {
			resultado=sb.toString()+"="+"Error";
		} else {
			resultado=sb.toString()+"="+String.valueOf(df.format(total));
		}
		sb.setLength(0);
		return resultado;
	}
	
	

}
