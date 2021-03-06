 
package com.distributedworkflowengine.stateinit.config;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.distributedworkflowengine.stateinit.domain.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

//<!----ReportingService Producer Config -->


@Configuration
public class StateInitializerProducerConfig {   
//    @Bean
//    public ProducerFactory<String, String> producerStringFactory() {
//        Map<String, Object> configProps = new HashMap<>();
//        configProps.put(
//          ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, 
//          "172.23.238.158:9092");
//        configProps.put(
//          ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, 
//          StringSerializer.class);
//        configProps.put(
//          ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, 
//          StringSerializer.class);
//        
//        return new DefaultKafkaProducerFactory<>(configProps);
//    }
// 
//    @Bean
//    public KafkaTemplate<String, String> kafkaStringTemplate() {
//        return new KafkaTemplate<>(producerStringFactory());
//    }
	
	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServer;
	
    @Bean
    public ProducerFactory<String, User> producerUserFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(
          ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, 
          bootstrapServer);
        configProps.put(
          ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, 
          StringSerializer.class);
        configProps.put(
          ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, 
          JsonSerializer.class);
        
        return new DefaultKafkaProducerFactory<>(configProps);
    }
 
    @Bean
    public KafkaTemplate<String, User> kafkaUserTemplate() {
        return new KafkaTemplate<>(producerUserFactory());
    }
    @Bean
    public ProducerFactory<String, ReportModel> producerReportFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(
          ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, 
          bootstrapServer);
        configProps.put(
          ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, 
          StringSerializer.class);
        configProps.put(
          ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, 
          JsonSerializer.class);
        
        return new DefaultKafkaProducerFactory<>(configProps);
    }
 
    @Bean
    public KafkaTemplate<String, ReportModel> kafkaReportTemplate() {
        return new KafkaTemplate<>(producerReportFactory());
    }
}
