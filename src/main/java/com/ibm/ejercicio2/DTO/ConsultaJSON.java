package com.ibm.ejercicio2.DTO;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaJSON {

	public Gps gps;
	public Integer codigoPostal;
	public String delegacion;
	public String estado;

}
