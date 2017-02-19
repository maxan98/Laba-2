import java.io.File;

/**
 * Created by maxan on 14.02.2017.
 */
public class MyMatrix {
    private int[][] data;
    MyMatrix(int n,int n1){

        this.data = new int[n][n1];
        int i = 0;
        int j = 0;
        while (i != data.length){
            this.data[i][j] = 1;
            i++;
            j++;
        }
    }

    @Override
    public String toString() {
        String a = this.data + "";
        return a;
    }

    public void print(){
        for(int i = 0;i!=data.length;i++){
            for(int j = 0;j!=data.length;j++){
                if(j == 0)
                    System.out.print("[");
                System.out.print(this.data[i][j] + " ");
            }
            System.out.println("]");
        }
    }
    public void init(int value){
        for(int i = 0;i!=data.length;i++){
            for(int j = 0;j!=data.length;j++){
                this.data[i][j] = value;
            }
        }
    }
    public void setData(int i,int j,int value) {
        this.data[i][j] = value;
    }
    public int getData(int i, int j){
        return this.data[i][j];
    }
    public MyMatrix sum(MyMatrix m2){
        MyMatrix tmp = new MyMatrix(data.length,data.length);
        tmp.zero();
        for(int i = 0;i!=data.length;i++){
            for(int j = 0;j!=data.length;j++){
                tmp.data[i][j] = this.data[i][j] + m2.data[i][j];

            }
        }
        return tmp;
    }
    public MyMatrix mul(MyMatrix m2){
        MyMatrix tmp = new MyMatrix(data.length,data.length);
        tmp.zero();
        for(int i = 0;i!=data.length;i++){
            for(int j = 0;j!=data.length;j++){
                for (int k = 0; k != data.length; k++) {
                    tmp.data[i][j] += this.data[i][k] * m2.data[k][j];
                }
            }
        }
        return tmp;
    }
    public MyMatrix binpow(int stepen){
    stepen--;
        MyMatrix tmp = new MyMatrix(data.length,data.length);
        tmp.zero();
        for(int i = 0;i != data.length;i++){
            for(int j = 0; j != data.length;j++){
                tmp.data[i][j] = this.data[i][j];
            }
        }
        for(int l = 0; l < stepen; l++) {
            tmp = tmp.mul(this);


        }
        return tmp;
    }
    public void zero(){
       for(int i = 0; i != data.length;i++){
           for(int j = 0; j != data.length;j++){
               this.data[i][j] = 0;
           }
       }
    }
    public static int MLG() {
        System.out.println("OH MY GOOOOOD MAMAMAMAAA!!!!!\n NICEEEEEEE!!!!!!\nSHOT!!!!\nOHHHHHHHHHHHHHHHHHHHHHH MLGGGGGGGG!!!!\n GOD DAMMIT ITS WORKING!!!!!!!!! OHHHHHHHH");
        File f = new File("src/1.wav");
        Sound sound = new Sound(f);
        sound.play();

            if (sound.isPlaying()) {
                sound.join();
            }
            return 0;

    }
}
