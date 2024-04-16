class PrimeCalculator {
    int[] prime;
    private boolean isPrime(int num,int index){
        for(int k=0;k<index;k++){
            if(num%prime[k]==0)
                return false;
        }
        return true;
    }
    int nth(int n) {
//        ArrayList<Integer> prime = new ArrayList<Integer>();
        if(n<=0){
            throw new IllegalArgumentException();
        }
        prime = new int[n];
        int i=0;
        int j=2;
        while(i<n){
            if(isPrime(j,i)){
                prime[i]=j;
                i++;
            }
            j++;
        }
        return prime[n-1];
    }
}
