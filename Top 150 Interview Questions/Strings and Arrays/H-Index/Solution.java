class Solution {
    public int hIndex(int[] citations) {
     Arrays.sort(citations);
     int temp=0,h=0;
     for(int i=0;i<citations.length/2;i++){// Reversing the Array Manually
        temp=citations[i];
        citations[i]=citations[citations.length-1-i];
        citations[citations.length-1-i]=temp;
     }
     for(int i=0;i<citations.length;i++){
       if(citations[i]>=i+1){
        h=i+1;
       }
       else{
        break;
       }
    }
   return h;
}
}
