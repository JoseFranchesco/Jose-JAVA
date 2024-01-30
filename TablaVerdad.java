public class TablaVerdad {
    public static void main(String[] args) {
        boolean p , q;
        
        p = true;
        q = false;
        System.out.println("p ="+p);
        System.out.println("p ="+q);
        System.out.println("p && q = "+(p && q));
        System.out.println("p | q = "+(p || q));
        System.out.println("!p = "+!p);

        //
        System.out.println("p || (6>10) = "+(p || (6>10)));
        System.out.println("((4<=4) || false) && (!p) = "+(((4<=4) || false ) && (!p)));
    }
}
