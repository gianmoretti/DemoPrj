package it.gianmo.demonodo.producer;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;

/**
 * Created by Utente on 28/05/2016.
 */
public abstract class AbstractNodoProducer<T> {

    protected static Producer<Integer, String> producer;

    public void closeProducer() {
        //Close the producer
        producer.close();
    }

    public void publishMesssage(T message) throws Exception {
        String msg = message.toString();

        //Define topic name and message
        KeyedMessage<Integer, String> keyedMsg =
                new KeyedMessage<Integer, String>(getTopic(), msg);
        producer.send(keyedMsg); // This publishes message on given topic
        System.out.println("--> Message [" + msg + "] sent. Check message on Consumer 's program console");
    }

    protected abstract String getTopic();
    protected abstract String getPartitionerClass();
}
