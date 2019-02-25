package lab2;


public class BracketMatching {
	Stack s= new Stack();
	public boolean BracketMatch(String x,int n){
		for(int i = 0; i<x.length();i++){
			if (x.charAt(i)!='0' && x.charAt(i)!='1'&&x.charAt(i)!='2'&&x.charAt(i)!='3'
			&&x.charAt(i)!='4'&&x.charAt(i)!='5'&&x.charAt(i)!='6'&&x.charAt(i)!='7'
			&&x.charAt(i)!='8'&&x.charAt(i)!='9'&&x.charAt(i)!='{'&&x.charAt(i)!='('
			&&x.charAt(i)!='['&&x.charAt(i)!='}'&&x.charAt(i)!=')'&&x.charAt(i)!=']'
			&&x.charAt(i)!='+'&&x.charAt(i)!='-'&&x.charAt(i)!='*'&&x.charAt(i)!='/'){
				System.out.println("Invalid character");
				System.exit(0);
				
			}
			
		}
		
		for(int i = 0 ; i<x.length();i++){
			
			if (x.charAt(i)== '{' || x.charAt(i) == '(' || x.charAt(i) == '['){
				Node c = new Node(x.charAt(i),null);
				s.push(c);
			}
			
			else if (x.charAt(i)== '}' || x.charAt(i) == ')' || x.charAt(i) == ']'){
				if (s.isEmpty()){
					return false;
				}
				else if ((s.top().getValue().equals('{') && x.charAt(i)== '}')){
					s.pop();
				}
				
				else if((s.top().getValue().equals('(') && x.charAt(i)== ')')){
					s.pop();
				}
				else if((s.top().getValue().equals('[') && x.charAt(i)== ']')){
					s.pop();
				}
				
				
			}
		}
		//System.out.println(s.size());
		if (s.isEmpty()){
			
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		BracketMatching bm = new BracketMatching();
		String sample = "(()";
		if (bm.BracketMatch(sample,sample.length())){
			System.out.println("The string is balanced");
		}
		else{
			System.out.println("The string is not balanced");
		}

	}

}
