import java.util.*;

public class SimpleCalculator {
	
	public static class OutOfRangeException extends Exception{
		public OutOfRangeException(String msg) {
			super(msg);
		}
	}
	
	public static class AddZeroException extends Exception{
		public AddZeroException(String msg) {
			super(msg);
		}
	}
	
	public static class SubtractZeroException extends Exception{
		public SubtractZeroException(String msg) {
			super(msg);
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		if(input.contains("+")) {			//µ°º¿¿œ ∂ß
			String[] data = input.split("\\+");
			int a = Integer.parseInt(data[0]);
			int b = Integer.parseInt(data[1]);
			
			try {
				int result = a + b;
				
				if(a == 0 || b == 0) {
					throw new Exception("AddZeroException");
				}
				else if(a < 0 || a > 1000 || b < 0 || b > 1000 || result > 1000) {
					throw new Exception("OutOfRangeException");
				} else {
					System.out.println(result);
				}
			} catch(AddZeroException e) {
				System.out.println(e.getMessage());
			} catch(OutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			
			
		}else {								//ª¨º¿¿œ ∂ß
			String[] data = input.split("-");
			int a = Integer.parseInt(data[0]);
			int b = Integer.parseInt(data[1]);
			
			try {
				int result = a - b;
			if(a == 0 || b == 0) {
				throw new Exception("SubtractZeroException");
			}
			else if(a < 0 || a > 1000 || b < 0 || b > 1000 || result > 1000 || result < 0) {
				throw new Exception("OutOfRangeException");
			} else {
				System.out.println(result);
			}
			}
		 catch(SubtractZeroException e) {
			System.out.println(e.getMessage());
		} catch(OutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
}
