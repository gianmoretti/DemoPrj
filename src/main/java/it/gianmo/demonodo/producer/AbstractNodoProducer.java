package it.gianmo.demonodo.producer;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;

/**
 * Created by Utente on 28/05/2016.
 */
public abstract class AbstractNodoProducer<T> {

    protected static Producer<String, String> producer;

    public void closeProducer() {
        //Close the producer
        producer.close();
    }

    public void publishMesssage(String key, T message) throws Exception {
        String msg = message.toString();

        //Define topic name and message
        KeyedMessage<String, String> keyedMsg = new KeyedMessage<String, String>(getTopic(), key, msg);
        producer.send(keyedMsg); // This publishes message on given topic
        System.out.println("--> Message [" + msg + "] sent. Check message on Consumer 's program console");
    }

    protected abstract String getTopic();
    protected abstract String getPartitionerClass();
}
