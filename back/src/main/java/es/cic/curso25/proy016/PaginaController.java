package es.cic.curso25.proy016;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/pagina.html")
public class PaginaController {

    @RequestMapping(method = RequestMethod.GET)
    public String mostrarPagina() {
        return "pagina";
    }
}
