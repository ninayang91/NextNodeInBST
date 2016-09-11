import java.util.ArrayList;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class Main {

	public static void main(String[] args) {

		
		TreeNode f =new TreeNode(3,null,null);
		TreeNode e =new TreeNode(1,null,null);
		TreeNode c =new TreeNode(6,null,null);
		TreeNode d= new TreeNode(2,e,f);
		e.parent=d;f.parent=d;
		TreeNode b= new TreeNode(4,d,null);
		d.parent=b;
		TreeNode a= new TreeNode(5,b,c);
		b.parent=a;c.parent=a;
		
		TreeNode x=new TreeNode(1,null,null);
		System.out.println(nextNode(x));


	}
	
	public static TreeNode nextNode(TreeNode t){
		if(t==null) return null;
		//if(t.parent==null && t.right==null) return null;//root without right
		
		if(t.right!=null){
			return leftMost(t.right);
		}else{//t.right==null, focus on parent
			while(t.parent!=null && t.parent.left!=t){
				t=t.parent;
			}
			return t.parent;
		}
		
	}
	
	public static TreeNode leftMost(TreeNode t){
		if(t==null) return null;
		while(t.left!=null){
			t=t.left;
		}
		return t;
	}

}
