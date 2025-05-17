/*
 * Created by minmin_tranova on 17.05.2025
 */

package cz.cvut.fel.NSS_log_service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LogConsumer {
    @KafkaListener(topics="log.created")
    public void handleLog(String logMessage){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(String.format("[%s] %s", formattedDateTime, logMessage));
    }
}
