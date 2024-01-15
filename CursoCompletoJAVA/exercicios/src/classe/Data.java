package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1; 
		ano = 1970;
	}
	
	Data(int diaPadrao, int mesPadrao, int anoPadrao){
		dia = diaPadrao;
		mes = mesPadrao;
		ano = anoPadrao;
	}
	
	String obterDataFormatada() {
		String data = "Dia " + dia + "/" + mes + "/" + ano;
		return data;
	}
}
  