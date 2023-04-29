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
@Table(name="t_katalog_urun")
@Getter @Setter @NoArgsConstructor 
public class EnvanterHareket {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="katalog_urun_id")
	 private int katalog_urun_id;
	 
	@Column(name="katalog_id")
	private int katalog_id;
	
	@Column(name="urun_id")
	private int urun_id;

	@Override
	public String toString() {
		return "katalogUrun [katalog_urun_id=" + katalog_urun_id + ", katalog_id=" + katalog_id + ", urun_id=" + urun_id
				+ "]";
	}

	public EnvanterHareket(int katalog_urun_id, int katalog_id, int urun_id) {
		super();
		this.katalog_urun_id = katalog_urun_id;
		this.katalog_id = katalog_id;
		this.urun_id = urun_id;
	}
	

	
}
