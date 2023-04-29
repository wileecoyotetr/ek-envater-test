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
@Table(name="t_depo_envanter")
@Getter @Setter @NoArgsConstructor 
public class DepoEnvanter {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="depo_envanter_id")
	 private int depo_envanter_id;
	 
	@Column(name="depo_id")
	private int depo_id;
	
	@Column(name="envanter_id")
	private int envanter_id;
	
	@Column(name="depo_miktar")
	private BigDecimal depo_miktar;
	
}
