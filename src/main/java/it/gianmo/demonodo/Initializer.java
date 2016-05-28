package it.gianmo.demonodo;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.javaapi.producer.Producer;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * Created by Utente on 28/05/2016.
 */
public class Initializer {

    public static void initialize(Producer<Integer, String> producer, String partitionerClass) {
        Properties producerProps = new Properties();
        producerProps.put("metadata.broker.list", "localhost:9092");
        producerProps.put("serializer.class", "kafka.serializer.StringEncoder");
        producerProps.put("request.required.acks", "1");
        producerProps.put("partitioner.class", partitionerClass);

        ProducerConfig producerConfig = new ProducerConfig(producerProps);
        producer = new Producer<Integer, String>(producerConfig);

    }

    public static void initialize(ConsumerConnector consumerConnector) {
        Properties props = new Properties();
        props.put("zookeeper.connect", "localhost:2181");
        props.put("group.id", "testgroup2");
        props.put("zookeeper.session.timeout.ms", "400");
        props.put("zookeeper.sync.time.ms", "300");
        props.put("auto.commit.interval.ms", "1000");
        ConsumerConfig conConfig = new ConsumerConfig(props);
        consumerConnector = Consumer.createJavaConsumerConnector(conConfig);
    }
}