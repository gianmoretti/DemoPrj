package it.gianmo.demoprj.partitioner;


import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

public class PartitionerExample implements Partitioner {

    public PartitionerExample(VerifiableProperties props) {
    }
    public int partition(Object employeeIdStr, int numOfPartitions) {
        int partition = 0;
        String stringKey = (String) employeeIdStr;
        Integer intKey = Integer.parseInt(stringKey);
        if (intKey > 0) {
            partition = intKey % numOfPartitions;
        }
        System.out.println("Returning partition number [" + partition + "] " +
                "for key ["+employeeIdStr+"]");
        return partition;
    }
}