import java.io.Serializable;
public class Person implements Serializable { //Marker interface
    String name;
    int age;
    float weight;
    double height;
    static int pid;
    transient int adha; //transient and static value we can't write.
}
