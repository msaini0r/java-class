package string;
import java.util.ArrayList;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println('a'+'b');
		System.out.println("a"+"b");
		System.out.println((char)('a'+3));
		
		System.out.println("a"+1);
//	this is same as after few steps as "a"+"1"
//	integer will be converted to integer that will call toSring()
//  Operator overloading - Operator is giving more Functionalities . In java it is not supported but in c++ it is supported
//  it means we can choose what the "+" sign is doing in line 9. we can modify this in c++ & python. but is results in poor code.
//  this sign is intentionally overloaded to support string catinatoion.
//	if one of the following is string in addition thr answer will always be string.	
		
		System.out.println("Karan"+ new ArrayList<>());
		System.out.println("Karan"+ new Integer(56));

	}

}
