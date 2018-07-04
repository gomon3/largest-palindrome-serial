/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestpalindrome;

/**
 *
 * @author Vaio
 */
public class Calculating {
    
    private long n;
    
    public Calculating(long n) throws Exception {
        
        setN(n);
        
    }
    
    public boolean isPalindrome(String cad){
        
        StringBuilder cadTemp = new StringBuilder(cad);
        String inverted = cadTemp.reverse().toString();
        
        return cad.equals(inverted);
    }
    
    public long getLargestPalindrome(){
        int start = 100;
        int until = 999;
        
        long largestPalindrome = -1000000000;
        
        for(int i = start; i <= until; i++){
            for(int j = start; j <= until; j++){
                long temp = i * j;
                
                if(isPalindrome(temp + "")){
                    
                    //El palíndromo tiene que ser menor que n
                    if(temp<this.n){
                        if(largestPalindrome<temp)
                            largestPalindrome = temp;
                    }
                }
                
            }
        }
        
        return largestPalindrome;
    }
    
    public long getN() {
        return n;
    }

    public void setN(long n) throws Exception {
        
        if(n<1000000){
            
            this.n = n;
            
        }else{
            
            throw new Exception("N debe ser menor que 1 Millon");
            
        }
        
    }
    
    
    
}
