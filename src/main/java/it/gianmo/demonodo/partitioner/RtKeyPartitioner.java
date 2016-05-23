package it.gianmo.demonodo.partitioner;


import it.gianmo.demonodo.domain.ChiavePagamento;
import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

public class RtKeyPartitioner implements Partitioner {

    public RtKeyPartitioner(VerifiableProperties props) {
    }
    public int partition(Object rtKeyIdObj, int numOfPartitions) {
        int partition = 0;
        ChiavePagamento keyIdObj = (ChiavePagamento) rtKeyIdObj;
        int intKey = keyIdObj.hashCode();
        if (intKey > 0) {
            partition = intKey % numOfPartitions;
        }
        System.out.println("Returning partition number [" + partition + "] " +
                "for key ["+ rtKeyIdObj +"]");
        return partition;
    }
}