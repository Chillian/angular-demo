package nl.capgemini.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {

    @CrossOrigin
    @GetMapping("/stamboom")
    public Stamboom kind() {
        Opa opa1 = new Opa("Opa Henk");
        Opa opa2 = new Opa("Opa Piet");
        Oma oma1 = new Oma("Oma Nikki");
        Oma oma2 = new Oma("Oma Paulien");
        Vader vader = new Vader("Vader Frank");
        Moeder moeder = new Moeder("Moeder Kim");
        Kind kind1 = new Kind("Suzanne");
        Kind kind2 = new Kind("Peter");
        Kind kind3 = new Kind("Ashley");

        ArrayList<Kind> kinderen = new ArrayList();
        ArrayList<Opa> opas = new ArrayList();
        ArrayList<Oma> omas = new ArrayList();
        kinderen.add(kind1);
        kinderen.add(kind2);
        kinderen.add(kind3);
        opas.add(opa1);
        opas.add(opa2);
        omas.add(oma1);
        omas.add(oma2);

        Stamboom stamboom = new Stamboom(kinderen,vader,moeder,opas,omas);
        return stamboom;
    }
}
