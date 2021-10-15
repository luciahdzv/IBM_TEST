package com.ibm.ejercicio2.Service;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ibm.ejercicio2.DTO.ConsultaJSON;
import com.ibm.ejercicio2.Model.Sucursal;
import com.ibm.ejercicio2.Model.Util;

@Service
public class ApiServiceImp implements ApiService {

	@Override
	public List<Sucursal> getDireccionTypeByParameters(ConsultaJSON consultaJson) {
		Gson gson = new Gson();

		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("src/main/resources/Data.json"));

			Type collectionType = new TypeToken<List<Sucursal>>() {
			}.getType();

			List<Sucursal> sucursalesQuery = new ArrayList<Sucursal>();
			
			List<Sucursal> sucursales = gson.fromJson(obj.toString(), collectionType);
			for (Sucursal s : sucursales) {
				System.out.println(s.getPropiedades().getDireccion());
			}

			return sucursalesQuery;
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

	}
}
