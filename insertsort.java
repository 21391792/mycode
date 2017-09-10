public class insertsort {
	int key;
	public int[] sort(int[] i){
		for (int k = 0; k < i.length; k++) {
			for(int j=1;j<i.length;j++)
			{
				//System.out.println("key : "+key);
				key=i[j];
			if( j>0 && (i[j-1]<key)){
				//System.out.println("inside key : "+key);
				
				
				i[j]=i[j-1];
				i[j-1]=key;
				
		}
			}
			
		}
		
		
		return i;
		
		
}
	
	public static void main(String[] args){
		
		insertsort ins1 =new insertsort();
		int[] i={1,45,67,34,98,2334,2,5,4,7,77};
		int[] k=ins1.sort(i);
		for(int k1:k){
		System.out.println(k1);
		}
		
	}
}

