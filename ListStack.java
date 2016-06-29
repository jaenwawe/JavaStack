import java.util.EmptyStackException;

public class ListStack implements DStack {
	
	private int size;
	int max = 10;
	private double [] data = new double[10];
	private int tos;

	@Override
	public boolean isEmpty() {
		if (tos != -1) 
			return true; // stack height is -1;
		return false;
	}

	@Override
	public void push(double d) {
		if(size > max)
		{
		data[size+1] = d;
		tos ++;
		}
		
		else{
			//error - stack full

		}

	}

	@Override
	public double pop() {
		if (tos > -1)
			tos --;
		
		// TODO Auto-generated method stub
		return arr[tos];
	}

	@Override
	public double peek() {
		// TODO Auto-generated method stub
		return 0;
	}

}
