package it.gianmo.demonodo.producer;

import it.gianmo.demonodo.Initializer;
import it.gianmo.demonodo.TopicConstants;

public class KeyRtProducer<KeyRTDTO> extends AbstractNodoProducer {

    public KeyRtProducer() {
        // Initialize producer
        Initializer.initialize(producer);
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
}