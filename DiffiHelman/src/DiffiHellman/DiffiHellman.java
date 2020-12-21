package DiffiHellman;

import java.math.BigInteger;

public class DiffiHellman {

    private static int Formula(int g,int p,int a){
        BigInteger G=new BigInteger(Integer.toString(g));
        BigInteger P=new BigInteger(Integer.toString(p));
        BigInteger A=new BigInteger(Integer.toString(a));
        return G.modPow(P,A).intValue();
    }

    public void DiffiH(int a,int b, int p, int g){
        int A,B,K1,K2;
        A=Formula(g,a,p);
        B=Formula(g,b,p);
        System.out.println("A = "+A+" B = "+B);
        K1=Formula(Formula(g,b,p),a,p);
        K2=Formula(Formula(g,a,p),b,p);
        System.out.println("K1 = "+K1+" K2 = "+K2);
    }
}
