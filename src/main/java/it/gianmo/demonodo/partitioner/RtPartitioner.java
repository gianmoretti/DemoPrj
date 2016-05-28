package it.gianmo.demonodo.partitioner;


import it.gianmo.demonodo.producer.KeyRTDTO;
import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;


public class RtPartitioner implements Partitioner {

    public RtPartitioner(VerifiableProperties props) {
    }

    public int partition(Object rtKeyIdObj, int numOfPartitions) {
        int partition = 0;
        KeyRTDTO keyIdObj = (KeyRTDTO) rtKeyIdObj;
        int intKey = keyIdObj.hashCode();
        if (intKey > 0) {
            partition = intKey % numOfPartitions;
        }
        System.out.println("Returning partition number [" + partition + "] " +
                "for key [" + rtKeyIdObj + "]");
        return partition;
    }
}