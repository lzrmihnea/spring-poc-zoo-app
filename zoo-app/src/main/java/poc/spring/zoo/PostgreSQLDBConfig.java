package poc.spring.zoo;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PostgreSQLDBConfig {

    @Value("${db.default.url}")
    String dbUrl;

    @Value("${db.default.user}")
    String dbUser;

    @Value("${db.default.password}")
    String dbPass;

    @Value("${db.default.driver}")
    String dbDriver;

    @Value("${db.default.pool.size}")
    Integer maxPoolSize;


    @Bean
    public DataSource getPostgresDataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName(dbDriver);
        hikariDataSource.setJdbcUrl(dbUrl);
        hikariDataSource.setConnectionTestQuery("select 1");
        hikariDataSource.setUsername(dbUser);
        hikariDataSource.setPassword(dbPass);
        hikariDataSource.setMaximumPoolSize(maxPoolSize);
        return hikariDataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getPostgresDataSource());
        return sessionFactory.getObject();
    }
}

