package config;

import fr.afpa.pompey.cda.appweb.repository.PersonRepository;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "fr.afpa.pompey.cda.appweb")
@Data
public class CustomProperties {

    private String apiUrl;

    public String getapiUrl() {
        return apiUrl;
    }
    //TODO
}
