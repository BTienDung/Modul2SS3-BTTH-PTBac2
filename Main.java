package season_3.PTBacHai;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation pt = new QuadraticEquation (-1,2,4);

        if (pt.getDiscriminant()>0){
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println("x1 = "+pt.getRoot1());
            System.out.println("x2 = "+pt.getRoot2());
        } else if (pt.getDiscriminant()<0){
            System.out.println("Phuong trinh co 1 nghiem kep: "+pt.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }

    }
}
