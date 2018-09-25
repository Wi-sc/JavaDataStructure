import java.util.*;

public class SuffixExpression {
    public static void main(String[] args){
    	Map<String, Integer> caculator = new HashMap(); 
    	caculator.put("+", 1);
    	caculator.put("-", 1);
    	caculator.put("*", 4);
    	caculator.put("/", 4);
    	caculator.put("^", 5);
    	caculator.put("(", 0);
        String[] infix = {"7","+","4","*","(","3","+","2",")","+","10"};
        Stack<Double> stNumber = new Stack<Double>();
        Stack<String> stCaculator = new Stack<String>();
        int i=0;
        while(i<infix.length){
            if (infix[i]!="+"&&infix[i]!="-"&&infix[i]!="*"&&infix[i]!="/"&&infix[i]!="("&&infix[i]!=")"&&infix[i]!="^"){
                stNumber.push(Double.valueOf(infix[i].toString()));
                i++;
                continue;
            }
            if(stCaculator.empty()||infix[i]=="("){
            	stCaculator.push(infix[i]);
            	i++;
            	continue;
            }
            if (infix[i]==")"){
            	while(stCaculator.peek()!="("){
            		evaluation(stCaculator.pop(), stNumber);
            	}
            	stCaculator.pop();
            	i++;
            	continue;
            }
            if(caculator.get(stCaculator.peek())>=caculator.get(infix[i])){
            	while(!stCaculator.empty()&&caculator.get(stCaculator.peek())>=caculator.get(infix[i])){
            			evaluation(stCaculator.pop(), stNumber);
            	}
            	stCaculator.push(infix[i]);
            	i++;	
	        }
            else{
            	stCaculator.push(infix[i]);
            	i++;
            }
        }
    	while(!stCaculator.empty()){
    		evaluation(stCaculator.pop(), stNumber);
    	}
        System.out.println(stNumber.pop());
}

    private static void evaluation(String op, Stack<Double> s){
        Double right = s.pop();
        Double left = s.pop();
        switch (op) {
            case "+":
                s.push(left + right);
                break;
            case "-":
                s.push(left - right);
                break;
            case "*":
                s.push(left * right);
                break;
            case "/":
                if (right != 0.0)
                    s.push(left / right);
                break;
            case "^":
                s.push(Math.pow(left, right));
                break;
        }
        
    }


}
