public class Main
{
	public static void main(String[] args) {
		int i, evensum,oddsum;
		evensum=0;
		oddsum=0;
		for(i=1;i<=10;i++){
		    if(i%2==0){
		        evensum=evensum+i;
		    }
		    else if(i%2!=0){
		        oddsum=oddsum+i;
		    }
		    
		}
		System.out.println(evensum);
		System.out.println(oddsum);
	}
}
