package it.gianmo.demonodo.partitioner;


import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

public class CanaliPartitioner implements Partitioner {

    public CanaliPartitioner(VerifiableProperties props) {
    }
    public int partition(Object canaleIdObj, int numOfPartitions) {
        int partition = 0;
        String keyIdObj = (String) canaleIdObj;
        int intKey = Integer.parseInt(keyIdObj);
        if (intKey > 0) {
            partition = intKey % numOfPartitions;
        }
        System.out.println("Returning partition number [" + partition + "] " +
                "for key ["+ canaleIdObj +"]");
        return partition;
    }
}