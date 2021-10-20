package eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 激活eurekasclient有两个注解都可以
 * @EnableEurekaClient
 * @EnableDiscoveryClient
 * 其中@EnableDiscoveryClient包含了@EnableEurekaClient
 *
 * 在新版本的eurekaclient中不写注解也可以
 */
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
