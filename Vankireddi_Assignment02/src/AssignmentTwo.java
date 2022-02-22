import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AssignmentTwo {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		
		//1 
		
		System.out.print("Enter no of elements for array: ");
		  int size = scan.nextInt();
		  String[] str = new String[size]; 
		  for (int i = 0; i < str.length; i++) {
				
				System.out.print("Enter the value at index "+ i +" is: ");
				str[i] = scan.next();
				
			}
		  
		  StringOccurance(str);

		//2
		System.out.print("Enter no of elements for array: ");
		int size2 = scan.nextInt(); 
		
		String[] a = new String[size2];
		for (int i = 0; i < a.length; i++) {
			
			System.out.print("Enter the value at index "+ i +" is: ");
			a[i] = scan.next();

		}
		System.out.println(concatenation(a).toString());
	
		
		//3
		System.out.println("Enter the length of the array");
		int size3 = scan.nextInt();
		int[] arr = new int[size3];
		System.out.println("Enter the elements");
		for (int i = 0; i < size3; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(Sequence(arr));
		
		
		//4
		ArrayList<String> array = new ArrayList<String>();
		
		System.out.println("Enter the no of strings");
		int size4 = scan.nextInt();
		System.out.println("Enter the strings");
		for (int i = 0; i < size4; i++) {
			array.add(scan.next());
			
		}
		
		System.out.println(duplicatecharacter(array));

		
		//5
		System.out.println("Enter the no of strings");
		int size5 = scan.nextInt();
		
        ArrayList<String>paray = new ArrayList<String>();
		
		System.out.println("Please enter strings");
		for (int i = 0; i < size5; i++) {
			paray.add(scan.next());
			
		}
		System.out.println(lastcharacter(paray));
		
		//6
		System.out.println("Please number of strings");
		int size6 = scan.nextInt();
		ArrayList<String> paray1 = new ArrayList<String>();
		

		
		System.out.println("Enter each strings");
		for (int i = 0; i < size6; i++) {
			paray1.add(scan.next());
			
		}
		
		System.out.println(stringappearance(paray1));

		
	
	}
	
	
	
	//1
		private static void StringOccurance(String[] a) {

				Map<String, Integer> objMap = new LinkedHashMap<String,Integer>();
					 
			    for(String str: a) {
			       Integer i = objMap.get(str);
			       if (i ==  null) {
			           i = 0;
			       }
			       objMap.put(str, ++i);
			    } 
					
				System.out.println(objMap.keySet().stream().map(k-> k+ "-" + objMap.get(k)).collect(Collectors.joining(", ")));
			
			
		}

	
	//2
	private static Map<String,String> concatenation(String[] p) {
		
		Map<String, String> objMap = new LinkedHashMap<String,String>();
		
		String st="";
		
		for(String str: p) {
			String charVal =str.charAt(0)+"";
			st=objMap.get(charVal)==null?str:objMap.get(charVal);
			if(objMap.containsKey(charVal)) {
				st+=str;
			}
			
			objMap.put(charVal, st);
		} 
		
		
		return objMap;
		
	}
	
	//3
	public static Set<Integer> Sequence(int objarr [])
	{
		

		Set<Integer> value= new LinkedHashSet<Integer>();
		
		int k =0;
		for(int i=0;i<objarr.length;i++)
		{
			k++;
			int l =-1;
			for(int j=0;j<k;j++)
			{
				
				if(objarr[j]==objarr[i])
					l++;
				
			}
			
			value.add(objarr[i]+l);			
		}
		return value;
		
}

	//4
	public static ArrayList<String> duplicatecharacter(ArrayList<String> objarr)
	{
		
             ArrayList<String> objarr1 = new ArrayList<String>();
             
             for (int i=0;i<objarr.size();i++)
            	 
             {
            	 String nxt = "";
            	 
            	 for(char ch: objarr.get(i).toCharArray())
            	 {
            		 if(nxt.contains(ch+"")==false)
            			 nxt=nxt+ch+"";
            	 }
            	 objarr1.add(nxt.toString());
             }

		
		return objarr1;
		
		
	}

	
	
	//5
	public static Map<String,String> lastcharacter ( ArrayList<String> objar)
	{
		Map<String,String> mm = new LinkedHashMap<String,String>();
		
		for (String pvr : objar) {
			
			mm.put(pvr.charAt(0)+"", pvr.charAt(pvr.length()-1)+"");
			
		}
		
		return mm;
	}
	
	//6
	public static Map <String,Boolean> stringappearance(ArrayList<String> array)
	{
		Map<String,Boolean> objMapoutput = new LinkedHashMap<String,Boolean>();
		
		
		for (int i=0;i<array.size();i++) {
			if(objMapoutput.containsKey(array.get(i)))
				objMapoutput.put(array.get(i), true);
			else
				objMapoutput.put(array.get(i), false);
				
		}
		
		return objMapoutput;
	}

	
}

