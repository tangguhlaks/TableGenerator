package lakscode.app;

import lakscode.data.*;

import java.util.Scanner;

public class MainApp {
    public static GeneratorTable generator = new GeneratorTable();
    public static OperationKonjungsi operationKonjungsi = new OperationKonjungsi();
    public static OperationDisjungsi operationDisjungsi = new OperationDisjungsi();
    public static OperationImplikasi operationImplikasi =  new OperationImplikasi();
    public static OperationBiimpikasi operationBiimpikasi =  new OperationBiimpikasi();
    public static OperationXor operationXor = new OperationXor();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========= Table Generator by Tangguhlaks =========");
        System.out.print("Input the number of propositions = ");
        int p = sc.nextInt();
        int pp = (int) Math.pow(2,p);
        int[] namaProposisi = generator.namaProposisi(p);
        String[][] pd =generator.tableDasar(p,pp);
        showTableDasar(pd,namaProposisi,p,pp);

        System.out.print("Input code name of proposition = ");
        int a  = sc.nextInt();
        System.out.print("Input operator = ");
        String o = sc.next();
        System.out.print("Input code name of proposition = ");
        int b = sc.nextInt();
        cekOperasi(pd,pp,p,a,o,b);



    }

    private static void cekOperasi(String[][] pd, int pp, int p, int a, String o, int b) {
        String[][] myans =  new String[1][pp];
        switch (o){
            case  "^":
                myans = operationKonjungsi.cekKonjungsi(pd,pp,p,a,b);
                operationKonjungsi.showHasil(myans,pd,pp,p,a,b);
                break;
            case "V":
                myans = operationDisjungsi.cekDisjungsi(pd,pp,p,a,b);
                operationDisjungsi.showHasil(myans,pd,pp,p,a,b);
                break;
            case "->":
                myans = operationImplikasi.cekImplikasi(pd,pp,p,a,b);
                operationImplikasi.showHasil(myans,pd,pp,p,a,b);
                break;
            case "<->":
                myans = operationBiimpikasi.cekBiimplikasi(pd,pp,p,a,b);
                operationBiimpikasi.showHasil(myans,pd,pp,p,a,b);
                break;
            case  "xor":
                myans = operationXor.cekXor(pd,pp,p,a,b);
                operationXor.showHasil(myans,pd,pp,p,a,b );
        }
    }

    private static void showTableDasar(String[][] pd, int[] namaproposisi, int p, int pp) {
        for (int i=0;i<p*2;i++){
            if (i<p) {
                if (i+1==p) {
                    System.out.print(namaproposisi[i] + " ");
                }else{
                    System.out.print(namaproposisi[i] + "  ");
                }
            }else {
                System.out.print(namaproposisi[i] + " ");
            }
        }
        System.out.println("");
        for (int i=0;i<pp;i++){
            for (int j=0;j<p*2;j++){
                System.out.print(pd[j][i] + "  ");
            }
            System.out.println("");
        }
    }

}
