package prime2;
public class PrimeExample{    
 public boolean primeornot(int n){    
  int i,m=0,flag=0;        
  m=n/2;      
  if(n==0||n==1){  
  return false;      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     return false;          
    }      
   }      
   if(flag==0)  { return true;}  
  }//end of else  
  return false;
} 

}
