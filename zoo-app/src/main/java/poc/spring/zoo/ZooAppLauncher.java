package poc.spring.zoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "poc.spring.zoo.mapper")
@SpringBootApplication(scanBasePackages = "poc.spring.zoo")
public class ZooAppLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ZooAppLauncher.class);
    }
}
