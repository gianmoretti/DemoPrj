package it.gianmo.demonodo.partitioner;


import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

public class CanaliPartitioner implements Partitioner {

    public CanaliPartitioner(VerifiableProperties props) {
    }
    public int partition(Object canaleIdStr, int numOfPartitions) {
        int partition = 0;
        String stringKey = (String) canaleIdStr;
        Integer intKey = Integer.parseInt(stringKey);
        if (intKey > 0) {
            partition = intKey % numOfPartitions;
        }
        System.out.println("Returning partition number [" + partition + "] " +
                "for key ["+ canaleIdStr +"]");
        return partition;
    }
}