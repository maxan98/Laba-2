/**
 * Created by maxan on 14.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyMatrix matr = new MyMatrix(10,10);
        matr.init(10);
        MyMatrix matr2 = new MyMatrix(10,10);
        matr2.init(20);
        MyMatrix result = new MyMatrix(10,10);
        result = matr.sum(matr2);
         result.print();
        MyMatrix test1 = new MyMatrix(4,4);
        test1.init(4);
        MyMatrix test2 = new MyMatrix(4,4);
        test2.init(5);
        MyMatrix test3 = new MyMatrix(3,3);
        test3.zero();
        test3 = test1.mul(test2);
        test3.print();
        System.out.println("KTO MOLODEC?! YA MOLODEC!");
        MyMatrix test4 = new MyMatrix(10,10);
        test4.print();
        MyMatrix test5 = new MyMatrix(4,4);
        test5.init(2);
        MyMatrix test6 = new MyMatrix(4,4);
        test6.zero();
        test6 = test5.binpow(10);
        test6.print();
        MyMatrix.MLG();



    }



}
