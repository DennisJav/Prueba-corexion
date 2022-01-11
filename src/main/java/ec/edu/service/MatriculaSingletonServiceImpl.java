package ec.edu.service;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Propietario;
import ec.edu.modelo.Vehiculo;
import ec.edu.repository.VehiculoLivianoImpl;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MatriculaSingletonServiceImpl implements IMatriculaService {
	
	public Vehiculo auto;
	public static final Logger LOG = LoggerFactory.getLogger(MatriculaSingletonServiceImpl.class);

	@Override
	public double calcularMatricula(double precio, int tipo) {
		// TODO Auto-generated method stub

		if (tipo == 1) {
			mensajesPrecio(precio);
			double valorMaticula = precio * 0.25;
			return valorMaticula;
		} else if (tipo == 2) {
			mensajesPrecio(precio);
			double valorMAtricula = precio * 0.1;
			return valorMAtricula;
		}
		return 0;

	}

	@Override
	public String mensajesPrecio(double precio) {

		if (precio < 0) {
			LOG.error("Error precio 0");
		}
		if (precio > 0 && precio < 10000) {
			LOG.warn("PRECIO BAJO VALOR");
		}
		if (precio > 10000) {
			LOG.info("PRECIO CORRECTO");
		}

		return "";

	}

	
	public Vehiculo getAuto() {
		return auto;
	}

	public void setAuto(Vehiculo auto) {
		this.auto = auto;
	}

	




}
