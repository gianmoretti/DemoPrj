package it.gianmo.demonodo.producer;

import it.gianmo.demonodo.Initializer;
import it.gianmo.demonodo.TopicConstants;
import it.gianmo.demonodo.partitioner.RtKeyPartitioner;

public class KeyRtProducer<KeyRTDTO> extends AbstractNodoProducer {

    public KeyRtProducer() {
        // Initialize producer
        Initializer.initialize(producer, getPartitionerClass());
    }

    private static KeyRtProducer singleInstance;

    public static KeyRtProducer getSingleInstance() {
        if(singleInstance == null)
            singleInstance = new KeyRtProducer();
        return singleInstance;
    }


    @Override
    protected String getTopic() {
        return TopicConstants.KEY_RT;
    }


    @Override
    protected String getPartitionerClass() {
        return RtKeyPartitioner.class.getCanonicalName();
    }
}