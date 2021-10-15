package com.ibm.ejercicio2.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {
	 private String type;
     private List<Double> coordinates;

     @JsonProperty("type")
     public String getType() { return type; }
     @JsonProperty("type")
     public void setType(String value) { this.type = value; }

     @JsonProperty("coordinates")
     public List<Double> getCoordinates() { return coordinates; }
     @JsonProperty("coordinates")
     public void setCoordinates(List<Double> value) { this.coordinates = value; }
}
