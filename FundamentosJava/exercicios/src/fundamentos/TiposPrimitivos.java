package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
//		Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 325;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
//		Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
//		Tipo booleano
		boolean estaDeFerias = false; //true
		
//		Tipo caractere
		char status = 'a';
		
//		Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
//		Numero de viagens
		System.out.println(numeroDeVoos/2);
//		Pontos acumulados
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
