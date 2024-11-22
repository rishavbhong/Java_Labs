class Person extends Object
{
    int age;
    float weight;
    double height;

    public Person(int age, float weight, double height){
        super();
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public String toString(){
        return "Age " + age + " Weight " + weight+ " Height " + height; //Overwriting the toString() in order to show the object data
    }
    public boolean equals(Object obj){
        Person p2 = (Person) obj;
        if(this.age == p2.age && this.height == p2.height && this.weight == p2.weight){
            return true;                                                // OverWriting the equals method to compare the value
        }
        else {
            return false;
        }
    }
    public int hashCode(){
        String strAge = String.valueOf(age);
        String strWeight = String.valueOf(weight);
        String strHeight = String.valueOf(height);                      // Overwriting the hashCode

        int hashAge = strAge.hashCode();
        int hashWeight = strWeight.hashCode();
        int hashHeight = strHeight.hashCode();

        int hash = 0;
        hash = hashAge + hashHeight + hashWeight;
        return hash;
    }
}

public class PersonManager {
    public static void main(String[] args) {
        int i =10; int j =10;

        System.out.println(i);
        System.out.println(j);
        System.out.println(i==j);
        String s1 = new String("abc");
        String s2 = new String("abc");      //Library defined object donot require any modification in the methods

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        Person p1 = new Person(23, 57.6f,5.6);
        Person p2 = new Person(23,57.6f,5.6);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2)); //However the user defined objects need modification in the methods as per the requirements.
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }

}
