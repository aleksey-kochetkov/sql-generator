package e.sqlgenerator;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class Config {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                      .type(e.sqlgenerator.sql.DataSource.class).build();
    }

    @Bean
    public List<String> statements(DataSource dataSource) {
        return e.sqlgenerator.sql.DataSource.getStatements();
    }
}
