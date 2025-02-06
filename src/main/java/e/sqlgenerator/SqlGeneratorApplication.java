package e.sqlgenerator;

import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import e.sqlgenerator.repository.CriteriaRepository;

@SpringBootApplication
public class SqlGeneratorApplication implements CommandLineRunner {
    @Autowired
    private CriteriaRepository criteriaRepository;
    @Autowired
    private List<String> statements;

    public static void main(String[] args) {
        SpringApplication.run(SqlGeneratorApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        criteriaRepository.run();
        for (String statement : statements) {
            System.out.println(statement);
        }
    }
}