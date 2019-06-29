package ListConcept;

public class SpiralTriangle {

	public static void main(String[] args) {
			int R = 3; 
			int C = 4; 
			int a[][] = { {1, 2, 3, 4}, 
						{5, 6, 7, 8}, 
						{9, 10, 11, 12}
						}; 
			spiralPrint(R,C,a); 
	}
	static void spiralPrint(int rows, int columns, int array[][]) {
		int firstRow=0,firstCol=0;
		int i,lastRow=rows-1,lastCol=columns-1;
		while(firstRow<=lastRow && firstCol <= lastCol) {
			for(i = firstRow;i<=lastCol;i++) {
		    	System.out.print(array[firstRow][i]+ " ");
		    }
		    firstRow++;
		    for(int j = firstRow; j <=lastRow; j++) {
		    	System.out.print(array[j][lastCol]+ " ");
		    }
		    lastCol--; 
		    if(firstRow<= lastRow) {
		    	for(int k = lastCol; k >= firstCol ; k--) {
			    	System.out.print(array[lastRow][k]+ " ");
			    }
			    lastRow--;
		    }
		    if(firstCol <= lastCol)
		    for(int l = lastRow ; l >= firstRow ; l--) {
		    	System.out.print(array[l][firstCol]+ " ");
		    }
		    firstCol++;
		}	    
	}
}