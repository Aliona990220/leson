public class JavaDataTypes {
    public static void main(String[] args) {
        byte[] v = new byte[]{1,2,3,4,5,6,7};
        for (byte h : v){
            System.out.println(h);
        }
        short[] w = new short[]{7,8,9,10,11,2};
        for (int i = 0; i < 5; i++){
            System.out.println(w[i]);
        }
        int[] t = new int[]{23,24,25,27,34};
        for (int o = 0; o < t.length; o++){
            System.out.println(t[o]);
        }
        long[] l = new long[]{23454,345665,5484,59859853};
        for (long q : l){
            System.out.println(q);
        }
        char[] c = new char[]{'Y','X','Z'};
        for (int m = 0; m < c.length; m++) {
            System.out.println(c[m]);
        }
        float[] f = new float[]{2989.48f,6045.58f};
        for (int i = 0; i < 2; i++){
            System.out.println(f[i]);
        }
        double[] d = new double[]{850840.648,950594.9049};
        for (double k : d){
            System.out.println(k);
        }
        boolean[] b = new boolean[]{true,false,true};
        for (int u = 0; u < 2; u++){
            System.out.println(b[u]);
        }
        String[] j = new String[]{"ЗИМА","ОСІНЬ","ВЕСНА","ЛІТО"};
        for (int s = 0; s < j.length; s++) {
            System.out.println(j[s]);
        }
    }

}
