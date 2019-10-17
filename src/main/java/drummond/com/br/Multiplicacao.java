package drummond.com.br;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class Multiplicacao {
	
	@RequestMapping(value="/api6/{valor1}/{valor2}",method= RequestMethod.GET)
	
	public Integer multiplicar(@PathVariable Integer valor1,@PathVariable Integer valor2) {
	
		Integer resultado; 
		resultado =valor1*valor2;
		return resultado;
	}
}
