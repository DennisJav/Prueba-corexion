package ec.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.modelo.Propietario;
import ec.edu.modelo.Vehiculo;
import ec.edu.modelo.VehiculoLiviano;
import ec.edu.modelo.VehiculoPesado;
import ec.edu.service.IMatriculaService;

@SpringBootApplication
public class PruebaCorexionDtApplication implements CommandLineRunner{
	public static final Logger LOG = LoggerFactory.getLogger(PruebaCorexionDtApplication.class);
	
	@Autowired
	private IMatriculaService auto1;
	@Autowired
	private IMatriculaService auto2;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaCorexionDtApplication.class, args);
		
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Propietario propie1=new Propietario();
		propie1.setApellido("Tapia");
		propie1.setCedula("111111111");
		propie1.setNombre("Denis");
		
		Vehiculo carro = new Vehiculo();
		carro.setMarca("chevy");
		carro.setPaisOrigen("EEUU");
		carro.setPlaca("PLL0215");
		carro.setPrecio(20000);
		carro.setTipo(1);
		carro.setValorMatricula(0);
		carro.setDatos(propie1);
		//carro.VehiculoPropietario("Dennis", "Tapia", "1721334686");
		
		
		
		if (carro.getTipo() == 1 ) {
			VehiculoLiviano liviano=new VehiculoLiviano();
			liviano.setPesoToneladas("10 toneladas");
		}else if(carro.getTipo() == 2) {
			VehiculoPesado pesado=new VehiculoPesado();
			pesado.setCilindrajeTubo("1202");
		}
		
		LOG.info(carro.toString());
		
		//this.auto1.calcularMatricula(10000, 1);
		LOG.info(this.auto1.mensajesPrecio(1000));
		double valorapagar = this.auto1.calcularMatricula(10000, 1);
		LOG.info("Valor a pagar matricula = "+ valorapagar);
		
		//this.auto2.calcularMatricula(100000, 1);
		LOG.info(this.auto2.mensajesPrecio(10000));
		double valorapagar2 = this.auto1.calcularMatricula(100000, 1);
		LOG.info("Valor a pagar matricula = "+ valorapagar2);
		
		
		
		
		
	}
	
	
}
