package it.gianmo.demonodo.producer;

import it.gianmo.demonodo.Initializer;
import it.gianmo.demonodo.TopicConstants;

public class RtProducer<KeyRTDTO> extends AbstractNodoProducer {

    public RtProducer() {
        // Initialize producer
        Initializer.initialize(producer);
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
}