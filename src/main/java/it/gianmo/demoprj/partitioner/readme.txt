bin/zookeeper-server-start.sh config/zookeeper.properties
C:\Users\Utente\Desktop\DatiGian\tools\kafka_2.11-0.9.0.0>bin\windows\zookeeper-server-start.bat config\zookeeper.properties

bin/kafka-server-start.sh config/server.properties
bin/kafka-server-start.sh config/server-1.properties &
C:\Users\Utente\Desktop\DatiGian\tools\kafka_2.11-0.9.0.0>bin\windows\kafka-server-start.bat config\server.properties

bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 2 --partitions 2 --topic EmployeeLoginEventTopic


bin/kafka-topics.sh --describe --zookeeper localhost:2181 --topic <nome topic>

bin/kafka-console-consumer.sh --zookeeper localhost:2181 --topic <nome topic> --from-beginning
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic <nome topic>

bin/kafka-topics.sh --zookeeper localhost:2181 --delete --topic <nome topic>
C:\Users\Utente\Desktop\DatiGian\tools\kafka_2.11-0.9.0.0>bin\windows\kafka-topics.bat --zookeeper localhost:2181 --delete --topic canali


Link utili:
https://cwiki.apache.org/confluence/display/KAFKA/Replication+tools#Replicationtools-5.AddPartitionTool
http://nverma-tech-blog.blogspot.it/2015/12/apache-kafka-example-of.html
http://nverma-tech-blog.blogspot.it/2015/12/apache-kafka-multibroker-partitioning.html
http://www.confluent.io/blog/how-to-choose-the-number-of-topicspartitions-in-a-kafka-cluster/

