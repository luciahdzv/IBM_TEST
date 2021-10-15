package com.ibm.ejercicio2.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Propiedades {
	  private long numeroReferencia;
      private long tipoSucursal;
      private String tipoRegistro;
      private String nombre;
      private String direccion;
      private String direccion2;
      private String estado;
      private long tipoUblicacion;
      private String entrecallesEspanol;
      private String entrecallesIngles;
      private String telefono;
      private long claveHorario;
      private String horaApertura;
      private String horaCierre;
      private long aperturaSabado;
      private String horaAperturaSabado;
      private String horaCierreSabado;
      private long cuentaConBanamex1;

      @JsonProperty("numero_referencia")
      public long getNumeroReferencia() { return numeroReferencia; }
      @JsonProperty("numero_referencia")
      public void setNumeroReferencia(long value) { this.numeroReferencia = value; }

      @JsonProperty("tipo_sucursal")
      public long getTipoSucursal() { return tipoSucursal; }
      @JsonProperty("tipo_sucursal")
      public void setTipoSucursal(long value) { this.tipoSucursal = value; }

      @JsonProperty("tipo_registro")
      public String getTipoRegistro() { return tipoRegistro; }
      @JsonProperty("tipo_registro")
      public void setTipoRegistro(String value) { this.tipoRegistro = value; }

      @JsonProperty("nombre")
      public String getNombre() { return nombre; }
      @JsonProperty("nombre")
      public void setNombre(String value) { this.nombre = value; }

      @JsonProperty("direccion")
      public String getDireccion() { return direccion; }
      @JsonProperty("direccion")
      public void setDireccion(String value) { this.direccion = value; }

      @JsonProperty("direccion2")
      public String getDireccion2() { return direccion2; }
      @JsonProperty("direccion2")
      public void setDireccion2(String value) { this.direccion2 = value; }

      @JsonProperty("estado")
      public String getEstado() { return estado; }
      @JsonProperty("estado")
      public void setEstado(String value) { this.estado = value; }

      @JsonProperty("tipo_ublicacion")
      public long getTipoUblicacion() { return tipoUblicacion; }
      @JsonProperty("tipo_ublicacion")
      public void setTipoUblicacion(long value) { this.tipoUblicacion = value; }

      @JsonProperty("entrecalles_espanol")
      public String getEntrecallesEspanol() { return entrecallesEspanol; }
      @JsonProperty("entrecalles_espanol")
      public void setEntrecallesEspanol(String value) { this.entrecallesEspanol = value; }

      @JsonProperty("entrecalles_ingles")
      public String getEntrecallesIngles() { return entrecallesIngles; }
      @JsonProperty("entrecalles_ingles")
      public void setEntrecallesIngles(String value) { this.entrecallesIngles = value; }

      @JsonProperty("telefono")
      public String getTelefono() { return telefono; }
      @JsonProperty("telefono")
      public void setTelefono(String value) { this.telefono = value; }

      @JsonProperty("clave_horario")
      public long getClaveHorario() { return claveHorario; }
      @JsonProperty("clave_horario")
      public void setClaveHorario(long value) { this.claveHorario = value; }

      @JsonProperty("hora_apertura")
      public String getHoraApertura() { return horaApertura; }
      @JsonProperty("hora_apertura")
      public void setHoraApertura(String value) { this.horaApertura = value; }

      @JsonProperty("hora_cierre")
      public String getHoraCierre() { return horaCierre; }
      @JsonProperty("hora_cierre")
      public void setHoraCierre(String value) { this.horaCierre = value; }

      @JsonProperty("apertura_sabado")
      public long getAperturaSabado() { return aperturaSabado; }
      @JsonProperty("apertura_sabado")
      public void setAperturaSabado(long value) { this.aperturaSabado = value; }

      @JsonProperty("hora_apertura_sabado")
      public String getHoraAperturaSabado() { return horaAperturaSabado; }
      @JsonProperty("hora_apertura_sabado")
      public void setHoraAperturaSabado(String value) { this.horaAperturaSabado = value; }

      @JsonProperty("hora_cierre_sabado")
      public String getHoraCierreSabado() { return horaCierreSabado; }
      @JsonProperty("hora_cierre_sabado")
      public void setHoraCierreSabado(String value) { this.horaCierreSabado = value; }

      @JsonProperty("cuenta_con_Banamex1")
      public long getCuentaConBanamex1() { return cuentaConBanamex1; }
      @JsonProperty("cuenta_con_Banamex1")
      public void setCuentaConBanamex1(long value) { this.cuentaConBanamex1 = value; }
}
