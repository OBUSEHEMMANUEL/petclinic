package org.springframework.samples.petclinic.vet;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
public class Vet_orders {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private Long id;

	private int pet_id;
		private int vet_id;
			private int vet_service_id;
			private String payment_method;
			private BigDecimal amount;
			private BigDecimal tax;
			private BigDecimal	tota;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPet_id() {
		return pet_id;
	}

	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}

	public int getVet_id() {
		return vet_id;
	}

	public void setVet_id(int vet_id) {
		this.vet_id = vet_id;
	}

	public int getVet_service_id() {
		return vet_service_id;
	}

	public void setVet_service_id(int vet_service_id) {
		this.vet_service_id = vet_service_id;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTota() {
		return tota;
	}

	public void setTota(BigDecimal tota) {
		this.tota = tota;
	}
}
