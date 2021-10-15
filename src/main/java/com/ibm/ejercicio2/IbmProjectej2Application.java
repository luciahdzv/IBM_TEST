package com.ibm.ejercicio2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ibm.ejercicio2.Model.Sucursal;

@SpringBootApplication
public class IbmProjectej2Application {

	public static void main(String[] args) {
		SpringApplication.run(IbmProjectej2Application.class, args);
		
	}

}
