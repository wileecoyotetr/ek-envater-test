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
@Table(name="t_envanter")
@Getter @Setter @NoArgsConstructor 
public class Envanter {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="envanter_id")
	 private int envanter_id;
	 
	@Column(name="envanter_adi")
	private String envanter_adi;
	
	@Column(name="envanter_kodu")
	private String envanter_kodu;
	
	@Column(name="envanter_miktar")
	private BigDecimal envanter_miktar;

	@Column(name="kritik_miktar")
	private BigDecimal kritik_miktar;

}
