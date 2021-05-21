package vacheck.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vacuna {
//
	@Id
	@GeneratedValue
	private Integer id;
	private String marca;
	private int dosisenstock;
	
	@OneToMany (mappedBy = "vacuna")
	private List<Usuario> usuarios_vacunados;
	
	public Vacuna() {
		
		
	}

	public Vacuna(String m, int n) {
		marca = m;
		dosisenstock = n;
	}

	public String consultarmedicina() {
		return "Marca: " + marca;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setDosisenstock(int dosisenstock) {
		this.dosisenstock = dosisenstock;
	}

	public Integer getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public int getDosisenstock() {
		return dosisenstock;
	}

	public List<Usuario> getUsuarios_vacunados() {
		return usuarios_vacunados;
	}

	public void setUsuarios_vacunados(List<Usuario> usuarios_vacunados) {
		this.usuarios_vacunados = usuarios_vacunados;
	}
	
	
	

}
