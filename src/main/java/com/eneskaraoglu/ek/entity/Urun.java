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
@Table(name="t_urun")
@Getter @Setter @NoArgsConstructor 
public class Urun {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="urun_id")
	 private int urun_id;
	 
	@Column(name="urun_adi")
	private String urun_adi;
	
	@Column(name="urun_kodu")
	private String urun_kodu;
	
	@Column(name="urun_miktar")
	private BigDecimal urun_miktar;

	@Override
	public String toString() {
		return "urun [urun_id=" + urun_id + ", urun_adi=" + urun_adi + ", urun_kodu=" + urun_kodu + ", urun_miktar="
				+ urun_miktar + "]";
	}

	public Urun(int urun_id, String urun_adi, String urun_kodu, BigDecimal urun_miktar) {
		super();
		this.urun_id = urun_id;
		this.urun_adi = urun_adi;
		this.urun_kodu = urun_kodu;
		this.urun_miktar = urun_miktar;
	}
}
