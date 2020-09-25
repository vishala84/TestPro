import java.util.HashMap;

interface StringFunction {
  String run(String str);
}

public class MyClass {
  public static void main(String[] args) {
	  String java = new String("java");
	  String val = "King is happy and queen is happy too";
	  String[] Array = val.split(" ");
	  HashMap<String,Integer> m = new HashMap<String,Integer>();
	  
	for(int i=0; i<Array.length;i++) {		  
		  if(m.containsKey(Array[i])) {
		  m.put(Array[i], m.get(Array[i])+1);}else {
			  m.put(Array[i], 1);
		  }
		  
	  }
	System.out.println(m);
//	  StringFunction exclaim = (s) -> s + "!";
//    StringFunction ask = (s) -> s + "?";
//    System.out.println(exclaim.run("Hello"));
//    printFormatted("Hello", exclaim);
//    printFormatted("Hello", ask);
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
   // System.out.println(result);
  }
}
