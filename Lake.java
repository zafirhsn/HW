public class Lake {
    private int[][] pasture = new int[][] {
	{28,25,20,32,34,36},	
	{27,25,20,20,30,34},
	{24,20,20,20,20,30},
	{20,20,14,14,20,20}
    };

    public int stomp(int row, int col, int depth) {
	int max = 0;
	for(int i=row;i<=row+2; i++) {
	    for(int h=col;h<=col+2;h++) {
		if (pasture[i][h] > max) {
		    max = pasture[i][h];
		}
	    }
	}
	return max;
    }

    public static void main(String[] args) {
	Lake test = new Lake();

	System.out.println(test.stomp(0,1,4));
    }
	    
}
