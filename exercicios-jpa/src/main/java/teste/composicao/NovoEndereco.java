package teste.composicao;

import infra.DAO;
import modelo.composicao.Fornecedor;
import modelo.composicao.Funcionario;

public class NovoEndereco {
	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor("Empresas SA");
		Fornecedor fornecedor2 = new Fornecedor("Clube B");

		Funcionario funcionario1 = new Funcionario("Matheus");
		Funcionario funcionario2 = new Funcionario("Mario");
		
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao().incluir(fornecedor1).incluir(fornecedor2).incluir(funcionario1).incluir(funcionario2).fecharTransacao().fechar();
		
	}
}
