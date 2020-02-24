package listavip.controller;

import listavip.model.Convidado;
import listavip.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadoController {

// TODO: resolver desgraça de repository

    @Autowired
    private ConvidadoRepository convidadoRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/listaconvidados")
    public String listaConvidados(Model model) {

        Iterable<Convidado> convidados = convidadoRepository.findAll();

        model.addAttribute("convidados", convidados);

        return "listaconvidados";
    }
}
