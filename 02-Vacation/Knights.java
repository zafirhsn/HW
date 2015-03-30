public class Knights {
    private char[][] board;
    private int maxX;
    private int maxY;

    public void Delay(int n) {
	try {
	    Thread.sleep(n);
	}
	catch (Exception e){}
    }

    public Knights(int x, int y){
	board = new char[x][y];
	
	for(int i=0;i<x;i++){
	    for(int j=0;j<y;j++){
		board[i][j] = '.';
		Delay(100);
		System.out.print(board[i][j]);
	    }
	    System.out.println();
	}
    }

    public Knights() {
	this(5,5);
    }

    public void solve() {
    }

    public static void main(String[] args) {
	Knights test = new Knights();

    }
}

    
