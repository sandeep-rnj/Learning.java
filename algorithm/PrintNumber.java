package algorithm;

class PrintNumber
{
    
    public static void printnumbers(int n){
        
        if(n==0){
            return;
        }
        printnumbers(n-1);
        System.out.println(n);
    } 
	public static void main(String[] args) {
		int n=10;
		printnumbers(n);
	}
}   