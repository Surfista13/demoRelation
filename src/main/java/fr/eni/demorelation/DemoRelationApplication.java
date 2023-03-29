package fr.eni.demorelation;

import fr.eni.demorelation.dal.PersonneDao;
import fr.eni.demorelation.model.Adresse;
import fr.eni.demorelation.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoRelationApplication implements CommandLineRunner {
    @Autowired
    private PersonneDao personneDao;
    public static void main(String[] args) {
        SpringApplication.run(DemoRelationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {




    }
}
