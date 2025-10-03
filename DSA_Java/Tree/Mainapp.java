package p2;
import p1.Node;
public class Mainapp {
	Node root;
	public static void main(String[] args) {
		
		Mainapp app=new Mainapp();
		app.insert(50);
		app.insert(30);
		app.insert(6);
		app.insert(9);
		app.insert(11);
		app.insert(33);
		
		app.inorder();
		app.preorder();
		app.postorder();
		

	}
	 void insert(int value) {
		  root = insertvalue(root,value);
	 }
	 
	 
	 Node insertvalue(Node root, int value) {
      if(root==null) {
    	  root=new Node(value);
    	  return root;
      }
      if(value>root.data) {
    	  root.right=insertvalue(root.right,value);
      }
      else
    	  if(value<root.data) {
    		  root.left=insertvalue(root.left,value);
    	  }
		return root;
	}
	
	 
	 public void inorder() {
		 System.out.println("inorder tree is:");
		 inordertree(root);
	 }
	 
	 
	 public void preorder() {
		 System.out.println("Preorder is");
		 preordertree(root);
	 }
	 
	 
	 public void postorder() {
		 System.out.println("Postorder is");
		 postordertree(root);
	 }
	 
	 
    void inordertree(Node root) {
    	if(root != null) {
    		inordertree(root.left);
    		System.out.println(root.data);
    		inordertree(root.right);
    	}
    }
    
    void preordertree(Node root) {
    	if(root != null) {
    		preordertree(root.left);
    		preordertree(root.right);
    		System.out.println(root.data);
    	}
    }
    
    void  postordertree(Node root) {
    	if(root != null) {
    		System.out.println(root.data);
    		postordertree(root.left);
    		postordertree(root.right);
    	}
    }
}
