package ec.edu.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Vehiculo;

@Repository
@Qualifier("Pesado")
public class VehiculoPesadoImpl implements IVehiculo {
	public static final Logger LOG = LoggerFactory.getLogger(VehiculoPesadoImpl.class);
	@Override
	public void matricularVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		LOG.info("Se matriculo el vehiculo pesado"+ vehiculo);
	}

	@Override
	public void imprimirVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		LOG.info("Datos de vehiculo pesado"+ vehiculo);
	}



}
