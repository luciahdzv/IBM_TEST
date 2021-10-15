package com.ibm.ejercicio2.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sucursal {
	private String type;
	private Geometry geometry;
	private Propiedades propiedades;

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@JsonProperty("geometry")
	public Geometry getGeometry() {
		return geometry;
	}

	@JsonProperty("geometry")
	public void setGeometry(Geometry value) {
		this.geometry = value;
	}

	@JsonProperty("propiedades")
	public Propiedades getPropiedades() {
		return propiedades;
	}

	@JsonProperty("propiedades")
	public void setPropiedades(Propiedades value) {
		this.propiedades = value;
	}
}
