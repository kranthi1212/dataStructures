
package interviewQuestions;

import java.util.HashMap;
import java.util.Stack;

import com.sun.javafx.image.impl.ByteIndexed.ToByteBgraAnyConverter;

/**
 * @author Kranthi
 *
 */
public class BalancedBracket {
	private final static HashMap<Character,Character> TOKENS = new HashMap<>();

	private static boolean isBalanced(String expression) {

		Stack<Character> stack = new Stack<>();

		for (char c : expression.toCharArray()) {
			if (isOpenTerm(c)) {
				stack.push(c);
			} else if (!stack.isEmpty() && !match(stack.pop(), c)) {
				return false;
			}
			
		}

		return stack.isEmpty();
	}

	private static boolean isOpenTerm(char c) {
		for (char token : TOKENS.keySet()) {
			if (c == token) {
				return true;
			}
		}
		return false;
	}

	private static boolean match(Character pop, char c) {
		for (char term : TOKENS.keySet()) {
			if (term == pop) {
				return TOKENS.get(term) == c;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		TOKENS.put( '{', '}'); 
		TOKENS.put( '[', ']'); 
		TOKENS.put( '(', ')'); 
		TOKENS.put( '<', '>'); 
		
		String expression = "[()]{}{[()()]()}";

		System.out.println(isBalanced(expression));

	}

}
