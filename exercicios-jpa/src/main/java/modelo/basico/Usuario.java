package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
//	@Column(name = "...", nulable = false ...)  altera nome das colunas
//	@Transient - javax.persistence atributo que não será mapeado para o banco de dados (não vira coluna)
	
	@Id // chave valor
	@GeneratedValue(strategy = GenerationType.IDENTITY) // atributo de auto-incremento
	private Long id;
	
	private String nome;
	private String email;
	
	public Usuario() {

	}

	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
