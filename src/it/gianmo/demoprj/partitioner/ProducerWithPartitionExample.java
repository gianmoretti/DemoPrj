package it.gianmo.demoprj.partitioner;

import java.util.Date;
import java.util.Properties;
import java.util.Random;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class ProducerWithPartitionExample {

    private static Producer<String, String> producer;
    public final static String brokerList = "localhost:9092,localhost:9093";
    public final static String PARTITIONER_IMPLEMENTATION_CLASS = "it.gianmo.demoprj.partitioner.PartitionerExample";
    private static final String TOPIC = "EmployeeLoginEventTopicNew";

    public void initialize() {
        Properties props = new Properties();
        props.put("metadata.broker.list", brokerList);
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("partitioner.class", PARTITIONER_IMPLEMENTATION_CLASS);
        props.put("request.required.acks", "1");
        ProducerConfig config = new ProducerConfig(props);
        producer = new Producer<String, String>(config);
    }
    public void publish(String key, String message) {
        KeyedMessage<String, String> data = new KeyedMessage<String, String>(
                TOPIC, key, message);
        producer.send(data);
    }
    public void closeProducer() {
        producer.close();
    }
    public static void main(String[] args) {
        ProducerWithPartitionExample producerWithPartition
                = new ProducerWithPartitionExample();
        // Initialize the producer with required properties
        producerWithPartition.initialize();
        // Publish message to brokers
        Random rnd = new Random();
        for (long employeeLogInEvent = 0; employeeLogInEvent < 10;
             employeeLogInEvent++) {
            String employeeId = String.valueOf(rnd.nextInt(10));
            String msg =   "EmployeeID:" + employeeId + ", LoginTime: " + new Date();
            producerWithPartition.publish(employeeId, msg);
        }
        // Close the connection between broker and producer
        producerWithPartition.closeProducer();
    }
}