package com.eneskaraoglu.ek.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t_katalog")
@Getter @Setter @NoArgsConstructor 
public class Katalog {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="katalog_id")
	 private int katalog_id;
	 
	@Column(name="katalog_adi")
	private String katalog_adi;
	
	@Column(name="katalog_kodu")
	private String katalog_kodu;

	@Override
	public String toString() {
		return "katalog [katalog_id=" + katalog_id + ", katalog_adi=" + katalog_adi + ", katalog_kodu=" + katalog_kodu
				+ "]";
	}

	public Katalog(int katalog_id, String katalog_adi, String katalog_kodu) {
		super();
		this.katalog_id = katalog_id;
		this.katalog_adi = katalog_adi;
		this.katalog_kodu = katalog_kodu;
	}
	

}
