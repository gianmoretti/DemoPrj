package it.gianmo.demonodo.producer;

import it.gianmo.demonodo.Initializer;
import it.gianmo.demonodo.TopicConstants;
import it.gianmo.demonodo.partitioner.CanaliPartitioner;

public class CanaliProducer<CanaleDTO> extends AbstractNodoProducer {

    public CanaliProducer() {
        // Initialize producer
        producer = Initializer.initializeProducer(getPartitionerClass());
    }

    private static CanaliProducer singleInstance;

    public static CanaliProducer getSingleInstance() {
        if(singleInstance == null)
            singleInstance = new CanaliProducer();
        return singleInstance;
    }

    @Override
    protected String getTopic() {
        return TopicConstants.CANALI;
    }

    @Override
    protected String getPartitionerClass() {
        return CanaliPartitioner.class.getCanonicalName();
    }
}