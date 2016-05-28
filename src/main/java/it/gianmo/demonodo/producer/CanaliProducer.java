package it.gianmo.demonodo.producer;

import it.gianmo.demonodo.Initializer;
import it.gianmo.demonodo.TopicConstants;

public class CanaliProducer<CanaleDTO> extends AbstractNodoProducer {

    public CanaliProducer() {
        // Initialize producer
        Initializer.initialize(producer);
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
}