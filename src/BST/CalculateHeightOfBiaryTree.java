package BST;

class CalculateHeightOfBiaryTree {

	int key;
	CalculateHeightOfBiaryTree left,right;
	CalculateHeightOfBiaryTree(int key)
	{
		this.key=key;
	}
	
	public static int  height(CalculateHeightOfBiaryTree root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+Math.max(height(root.left),height(root.right));
	}
	
	public static void main(String[] args) {
		
	CalculateHeightOfBiaryTree root=null;
	root=new CalculateHeightOfBiaryTree(15);
	root.left=new CalculateHeightOfBiaryTree(10);
	root.right=new CalculateHeightOfBiaryTree(30);
	
	root.left.right=new CalculateHeightOfBiaryTree(10);
	root.right.left=new CalculateHeightOfBiaryTree(30);
	
	System.out.println("The height of the binary tree"+height(root));
	
	}
	
	
}
