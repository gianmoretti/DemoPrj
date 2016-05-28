package it.gianmo.demonodo.producer;

import it.gianmo.demonodo.Initializer;
import it.gianmo.demonodo.TopicConstants;
import it.gianmo.demonodo.partitioner.RtPartitioner;

public class RtProducer<KeyRTDTO> extends AbstractNodoProducer {

    public RtProducer() {
        // Initialize producer
        producer = Initializer.initializeProducer(getPartitionerClass());
    }

    private static RtProducer singleInstance;

    public static RtProducer getSingleInstance() {
        if(singleInstance == null)
            singleInstance = new RtProducer();
        return singleInstance;
    }


    @Override
    protected String getTopic() {
        return TopicConstants.RT;
    }


    @Override
    protected String getPartitionerClass() {
        return RtPartitioner.class.getCanonicalName();
    }
}