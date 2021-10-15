package com.ibm.ejercicio2.Service;

import java.util.List;

import com.ibm.ejercicio2.DTO.ConsultaJSON;
import com.ibm.ejercicio2.Model.Sucursal;
import com.ibm.ejercicio2.Model.Util;

public interface ApiService {
	public List<Sucursal> getDireccionTypeByParameters(ConsultaJSON consultaJson);

}
