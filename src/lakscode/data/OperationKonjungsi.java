package lakscode.data;

public class OperationKonjungsi {
    public String[][] cekKonjungsi(String[][] pd,int pp,int p,int a,int b){
        String[][] myans = new String[1][pp];
        if (a < 0) {
            a = a*-1+p-1;
        }else{
            a-=1;
        }
        if (b < 0) {
            b = b*-1+p-1;
        }else {
            b-=1;
        }
        for (int i=0;i<pp;i++) {
            if (pd[a][i].equals("T") && pd[b][i].equals("T")) {
                myans[0][i] = "T";
            } else {
                myans[0][i] = "F";
            }

        }
        return myans;
    }
    public void showHasil(String[][] hasil, String[][] pd, int pp,int p,int a,int b) {
            System.out.print(a+"  "+b+" "+a+"^"+b);
            System.out.println("");
        if (a < 0) {
            a = a*-1+p-1;
        }else{
            a-=1;
        }
        if (b < 0) {
            b = b*-1+p-1;
        }else {
            b-=1;
        }
        for (int j=0;j<pp;j++){
            System.out.print(pd[a][j] +"  "+pd[b][j]+"   "+hasil[0][j]);
            System.out.println("");
        }

    }
}
