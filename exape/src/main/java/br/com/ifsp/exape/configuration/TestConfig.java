package br.com.ifsp.exape.configuration;

import br.com.ifsp.exape.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;

@Configuration
public class TestConfig {

    @Autowired
    private DBService dbService;

    @Bean
    public boolean instancia() throws ParseException {
        dbService.instanciarBaseDeDados();
        return true;
    }
}
