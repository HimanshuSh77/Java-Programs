
public class String_InitialLetterCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="my name is himanshu";
	      String s[]=input.split(" ");

	      for (int i=0;i<s.length;i++){

	          for(int j=0 ;j<s[i].length();j++){
	              if(j==0){
	                  System.out.print(String.valueOf(s[i].charAt(j)).toUpperCase());
	              }
	              else{
	                  System.out.print(String.valueOf(s[i].charAt(j)));
	              }
	          }
	          System.out.print(" ");
	      }

	  
		
	}

}
