
class P{
    String pt(short m){
        return "very n";
    }
    String pt(short... m){
        return "merged";
    }
}

public class Main {

    public static void main(String arg[]){
        System.out.println(new P().pt(5));
        // Singly list = new Singly();
        // list.create(0);
        // list.create(1);
        // list.create(2);
        // list.insertAtLast(3);
        // list.insertAt(9, 3);
        // list.print();
        
        // System.out.println("");
        // list.print();
        //  list.reverse();
        //  System.out.println("");
        // list.print();
        // //System.out.println(result);
    }
}
