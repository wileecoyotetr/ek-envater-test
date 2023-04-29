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
@Table(name="t_envater_log")
@Getter @Setter @NoArgsConstructor 
public class EnvanterLog {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="envanter_log_id")
	 private int envanter_log_id;
	 
	@Column(name="depo_id")
	private int depo_id;
	
	@Column(name="envanter_id")
	private int envanter_id;
	
	@Column(name="hareket_miktar")
	private BigDecimal hareket_miktar;

	@Column(name="hareket_tarih")
	private Date hareket_tarih;

	@Column(name="hareket_turu")
	private String hareket_turu;
	
	@Column(name="hareket_tipi")
	private String hareket_tipi;
	
}
