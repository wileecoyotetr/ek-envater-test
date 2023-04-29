package com.eneskaraoglu.ek.entity;

import java.math.BigDecimal;
import java.util.Date;

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
@Table(name="t_envanter")
@Getter @Setter @NoArgsConstructor 
public class EnvanterGiris {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="envanter_giris_id")
	 private int envanter_giris_id;
	 
	@Column(name="depo_id")
	private int depo_id;
	
	@Column(name="envanter_id")
	private int envanter_id;
	
	@Column(name="giris_miktar")
	private BigDecimal giris_miktar;

	@Column(name="giris_tarih")
	private Date giris_tarih;

}
