public class Main {

    public static void main(String[] args) {
        System.out.println(estimate(100000000));
        System.out.println(Math.PI);

    }



    public static double estimate (int n){
        double numPointCircle = 0;
        double numPointTotal = 0;

        for(int i = 0; i<=n; i++){
            double x = Math.random();
            double y = Math.random();
            double distance = Math.sqrt( Math.pow(x,2) + Math.pow(y,2));
            if(distance <=1 ){
                numPointCircle+=1;
            }

            numPointTotal+=1;

        }
        return 4* numPointCircle/numPointTotal;

    }

}
