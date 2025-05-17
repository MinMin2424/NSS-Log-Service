/*
 * Created by minmin_tranova on 17.05.2025
 */

package cz.cvut.fel.NSS_log_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class NssLogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NssLogServiceApplication.class, args);
	}
}

