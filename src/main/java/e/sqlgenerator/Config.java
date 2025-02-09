package e.sqlgenerator;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class Config {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                            .type(e.sqlgenerator.sql.DataSource).build();
    }
}
