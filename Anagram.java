import java.util.*;
// Other imports go here
// Do NOT change the class name
class Anagram{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      for(int i=0;i<n;i++){
        
        String st1=sc.next();
        String st2=sc.next();
        
        String str1=st1.toLowerCase();
        String str2=st2.toLowerCase();
        
        int l1=str1.length();
        int l2=str2.length();
        
        if(l1!=l2)
          System.out.println("Not Anagrams");
        else{
          char arr1[]=new char[l1];
          for(int j=0;j<l1;j++)
            arr1[j]=str1.charAt(j);
          
          char arr2[]=new char[l2];
          for(int j=0;j<l2;j++)
            arr2[j]=str2.charAt(j);
          
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          
          int flag=0;
          for(int j=0;j<l1;j++){
            if(arr1[j]!=arr2[j]){
              //System.out.println("Not Anagrams");
              flag=1;
              break;
            }
          }
          if(flag==1)
            System.out.println("Not Anagrams");
          else
          	System.out.println("Anagrams");
        }
      }
    }
}