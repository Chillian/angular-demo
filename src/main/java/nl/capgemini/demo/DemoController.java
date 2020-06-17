package nl.capgemini.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {

    @GetMapping("/stamboom")
    public Stamboom kind() {
        Opa opa1 = new Opa("Opa1");
        Opa opa2 = new Opa("Opa2");
        Oma oma1 = new Oma("Oma1");
        Oma oma2 = new Oma("Oma2");
        Vader vader = new Vader("vader");
        Moeder moeder = new Moeder("moeder");
        Kind kind1 = new Kind("kind1");
        Kind kind2 = new Kind("kind2");
        Kind kind3 = new Kind("kind3");

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
