package generation.mx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Va a ser controlado por rest
public class HolaMundoSpring {

    @RequestMapping(path = "/", method = RequestMethod.GET) //
    public String holaMundo(@RequestParam(name = "nombre", defaultValue = "default") String nombre) {
        return "Hola " + nombre;
    }
}
