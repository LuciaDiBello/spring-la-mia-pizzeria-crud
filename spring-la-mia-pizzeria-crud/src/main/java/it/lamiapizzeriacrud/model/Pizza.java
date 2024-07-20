package it.lamiapizzeriacrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="Pizze")
public class Pizza{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="name", nullable=false)
	@NotNull(message="name cannot be null")
	@NotBlank(message="name cannot be null")
	private String name;

	@Column(name="descrizione", nullable=false)
	@NotNull(message="descrizione cannot be null")
	@NotBlank(message="descrizione cannot be null")
	private String descrizione;

	@Column(name="foto", nullable=true)
	private String foto;

	@Column(name="prezzo", nullable=false)
	private float prezzo;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String urlPhoto) {
		this.foto = foto;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
}


