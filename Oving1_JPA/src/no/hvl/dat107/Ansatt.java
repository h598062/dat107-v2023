package no.hvl.dat107;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;


@Entity
@Table(schema = "oving1")
public class Ansatt {

	@Id
	private String brukernavn;
	private String fornavn;
	private String etternavn;
	private Date   ansettelsesdato;
	private String stilling;
	private int    maanedslonn;

	@Override
	public String toString() {
		return "Ansatt{" + "brukernavn=" + brukernavn + ", fornavn=" + fornavn + ", etternavn=" + etternavn + ", ansettelsesdato=" + ansettelsesdato +
		       ", stilling=" + stilling + ", maanedslonn=" + maanedslonn + '}';
	}

	public void setStilling(String stilling) {
		this.stilling = stilling;
	}

	public void setMaanedslonn(int maanedslonn) {
		this.maanedslonn = maanedslonn;
	}

	public String getBrukernavn() {
		return brukernavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public Date getAnsettelsesdato() {
		return ansettelsesdato;
	}

	public String getStilling() {
		return stilling;
	}

	public int getMaanedslonn() {
		return maanedslonn;
	}
}