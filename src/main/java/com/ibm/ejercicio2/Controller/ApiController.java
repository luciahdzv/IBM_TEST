package com.ibm.ejercicio2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ejercicio2.DTO.ConsultaJSON;
import com.ibm.ejercicio2.Model.Sucursal;
import com.ibm.ejercicio2.Model.Util;
import com.ibm.ejercicio2.Service.ApiService;

@RestController
@RequestMapping(path = "/api2")
public class ApiController {

	@Autowired
	private ApiService apiService;

	@PostMapping("/sucursales_cajeros")
	public List<Sucursal> getDireccion(@RequestBody ConsultaJSON consultaJson) {
		return apiService.getDireccionTypeByParameters(consultaJson);

	}

}
