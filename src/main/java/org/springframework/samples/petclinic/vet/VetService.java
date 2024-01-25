package org.springframework.samples.petclinic.vet;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Vet_service {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Long id;


	@OneToMany(mappedBy = "vetService")
	private List<Vet> vets;

		private String service_name;
			private double service_price;

	public Long getId() {
		return id;
	}

	public void setId1(Long id) {
		this.id = id;
	}
}
