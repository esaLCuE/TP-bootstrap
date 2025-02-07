package fr.afpa.pompey.cda.appweb.repository;

import config.CustomProperties;
import fr.afpa.pompey.cda.appweb.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class PersonRepository {

    CustomProperties customProperties = new CustomProperties();
    // TODO : ~page 50, créer avec @Autowired sans le new
    
    public Iterable<Person> getPersons() {

        String baseURL = customProperties.getapiUrl();
        String getPersonsURL = baseURL + "/persons";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Iterable<Person>> response = restTemplate.exchange(
                getPersonsURL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {}
        );

        log.debug("Get Persons call"+response.getStatusCode());

        return response.getBody();
    }

    public Person getPerson(int id) {
        String baseApiUrl = customProperties.getapiUrl();
        String getPersonURL = baseApiUrl + "/person/" + id;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Person> response = restTemplate.exchange(
                getPersonURL,
                HttpMethod.GET,
                null,
                Person.class
        );
        log.debug("Get Person call"+response.getStatusCode());
        return response.getBody();
    }

    public Person createPerson(Person person) {
        String baseApiUrl = customProperties.getapiUrl();
        String createPersonURL = baseApiUrl + "/persons";

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Person> request = new HttpEntity<>(person);
        ResponseEntity<Person> response = restTemplate.exchange(
                createPersonURL,
                HttpMethod.POST,
                request,
                Person.class);
        log.debug("Create Person call"+response.getStatusCode());

        return response.getBody();
    }

    public Person updatePerson(Person person) {
        String baseApiUrl = customProperties.getapiUrl();
        String updatePersonURL = baseApiUrl + "/persons/" + person.getId();

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Person> request = new HttpEntity<>(person);
        ResponseEntity<Person> response = restTemplate.exchange(
                updatePersonURL,
                HttpMethod.PUT,
                request,
                Person.class
        );
        log.debug("Update Person call"+response.getStatusCode());
        return response.getBody();
    }

    public void deletePerson(int id) {
        String baseApiUrl = customProperties.getapiUrl();
        String deletePersonURL = baseApiUrl + "/persons/" + id;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Void> response = restTemplate.exchange(
                deletePersonURL,
                HttpMethod.DELETE,
                null,
                Void.class
        );
        log.debug("Delete Person call"+response.getStatusCode());
    }
}
