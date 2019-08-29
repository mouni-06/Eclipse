
public class StringsSorting {

    public static void main(String []  args)
    {  
      String []names=new String[]{"java","hadoop","linux","unix","servlet","jsp","html"};
      
      System.out.println ("Before Sorting ");
      
      for (int i = 0; i < names.length; i++)
      {
		System.out.println (names[i]);
      }
      
      for (int i = 0; i < names.length; i++)
      {
    	  for(int j=0; j<names.length-1-i;j++)
    	  {
    		  if((names[j].compareTo(names[j+1]))>0) //comparing by values 
    		  {
    			 String temp = names[j];
    			 names[j]=names[j+1];
    			 names[j+1]=temp;    			  
    		  }    		  
    	  }		

      }
      System.out.println ("After Sorting ");
      
     
       for (int i = 0; i < names.length; i++)
      {
		System.out.println (names[i]);
     }    

}
}