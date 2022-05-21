

class Euclid_algorithm{
    public static void main(String[] args){


        int a = 100;
        int b = 68;
        int c = findDivisor(a,b);

        System.out.format("The greatest common divisor of %d and %d is %d%n",a,b,c);
    }


    public static int findDivisor(int a, int b){
        if(b == 0) return a;
        else return findDivisor(b, a%b);
    }
}