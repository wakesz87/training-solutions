package week11d01;

public class DivisonFinder {

    public int findDivisors(int n) {

        String num =Integer.toString(n);

        int count=0;

        for(int i=0; i< num.length(); i++){

            if(n%(Integer.parseInt(num.substring(i,i+1)))==0){
                count++;
            }

        }

        return count;
    }
}
