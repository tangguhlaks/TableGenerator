package lakscode.data;

public class OperationDisjungsi {
    public String[][] cekDisjungsi(String[][] pd,int pp,int p,int a,int b){
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
        for (int i=0;i<pp;i++){
            if (pd[a][i].equals("F") && pd[b][i].equals("F")){
                myans[0][i] = "F";
            }else{
                myans[0][i] = "T";
            }
        }
        return myans;
    }
    public void  showHasil(String[][] hasil,String[][] pd,int pp,int p,int a,int b){
        System.out.println(a+"  "+b+" "+a+"V"+b);
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
        for (int i=0;i<pp;i++){
            System.out.println(pd[a][i]+"  "+pd[b][i]+"   "+hasil[0][i]);
        }
    }
}
