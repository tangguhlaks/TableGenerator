package lakscode.data;

public class GeneratorTable {
    public int[] namaProposisi(int p){
        int[] nama = new int[p*2];
        for (int i=0;i<p*2;i++){
            if (i<p){
                nama[i]= i+1;
            }else{
                nama[i] = -(i-p+1);
            }

        }
        return nama;
    }
    public String[][] tableDasar(int p,int pp){
        String[][] pd = new String[p*2][pp];
        int len = pp;
        for (int i=0;i<p;i++) {
            int change =2;
            int count =0;
            len/=2;
            for (int j = 0; j < pp; j++) {
                if (count == len){
                    change++;
                    count=0;
                }
                if (change%2==0){
                    pd[i][j] = "T";
                }else {
                    pd[i][j] ="F";
                }
                count++;
            }
        }
        int len2=pp;
        for (int i=p;i<p*2;i++) {
            int change =2;
            int count =0;
            len2/=2;
            for (int j = 0; j < pp; j++) {
                if (count == len2){
                    change++;
                    count=0;
                }
                if (change%2==0){
                    pd[i][j] = "F";
                }else {
                    pd[i][j] ="T";
                }
                count++;
            }
        }
        return pd;
    }
}
