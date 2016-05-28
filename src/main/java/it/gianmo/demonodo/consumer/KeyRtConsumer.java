package it.gianmo.demonodo.consumer;


import it.gianmo.demonodo.Initializer;
import it.gianmo.demonodo.TopicConstants;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyRtConsumer {
    private ConsumerConnector consumerConnector = null;
    private final String topic = TopicConstants.KEY_RT;

    public KeyRtConsumer(String groupId) {
        // Configure Kafka consumer
        this.consumerConnector = Initializer.initializeConsumer(groupId);
    }

    public void consume() {
        //Key = topic name, Value = No. of threads for topic
        Map<String, Integer> topicCount = new HashMap<String, Integer>();
        topicCount.put(topic, new Integer(1));

        //ConsumerConnector creates the message stream for each topic
        Map<String, List<KafkaStream<byte[], byte[]>>> consumerStreams =
                consumerConnector.createMessageStreams(topicCount);

        // Get Kafka stream for topic 'mytopic'
        List<KafkaStream<byte[], byte[]>> kStreamList =
                consumerStreams.get(topic);
        // Iterate stream using ConsumerIterator
        for (final KafkaStream<byte[], byte[]> kStreams : kStreamList) {
            ConsumerIterator<byte[], byte[]> consumerIte = kStreams.iterator();

            while (consumerIte.hasNext())
                System.out.println("Message consumed from topic [" + topic + "] : "       +
                        new String(consumerIte.next().message()));
        }
        //Shutdown the consumer connector
        if (consumerConnector != null)   consumerConnector.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        KeyRtConsumer kafkaConsumer = new KeyRtConsumer(args[0]);
        // Start consumption
        kafkaConsumer.consume();
    }
}