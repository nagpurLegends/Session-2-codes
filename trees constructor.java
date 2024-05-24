import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    //trees constructor
    public static class Node{
        
        int val;
        Node left;
        Node right;
        
        Node(int val,Node left,Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public static class pair{
        Node node;
        int state;
        
        pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }
    
    public static Node construct_BinaryTree(int[] a){
        Stack<pair> st = new Stack<>();
		Node root = new Node(50,null,null);
		pair rp = new pair(root,1);
		st.push(rp);
		int idx=0;
		
		while(st.size()>0){
		    pair top = st.peek();
		    
		    if(top.state==1){
		        idx++;
		        
		        if(a[idx]!=-1){
		            Node ln = new Node(a[idx],null,null);
		            top.node.left = ln;
		            st.push(new pair(ln,1));
		        }
		        else{
		            top.node.left = null;
		        }
		        
		        top.state++;
		    }
		    else if(top.state==2){
		        idx++;
		        
		        if(a[idx]!=-1){
		            Node rn = new Node(a[idx],null,null);
		            top.node.right = rn;
		            st.push(new pair(rn,1));
		        }
		        else{
		            top.node.right = null;
		        }
		        
		        top.state++;
		    }
		    else{
		        st.pop();
		    }
		}
		
		return root;
    }
    
    public static void Display_BinaryTree(Node root){
        if(root==null)
        return;
        String s1="";
        if(root.left!=null)
        s1+=root.left.val;
        else
        s1+=".";
        
        s1+=" <-- "+ root.val+" -- > ";
        
        if(root.right!=null)
        s1+=root.right.val;
        else
        s1+=".";
        
        System.out.println(s1);
        
        Display_BinaryTree(root.left);
        Display_BinaryTree(root.right);
    }
    
    public static int size_BT(Node root){
        if(root==null)
        return 0;
        
        int Size_LN = size_BT(root.left);
        int Size_RN = size_BT(root.right);
        
        return Size_LN+Size_RN+1 ;
    }
    
    public static int sum_BT(Node root){
        if(root==null)
        return 0;
        
        int sum_LN = sum_BT(root.left);
        int Sum_RN = sum_BT(root.right);
        
        return sum_LN+Sum_RN+root.val ;
    }
    
    public static int max_BT(Node root){
        if(root==null)
        return Integer.MIN_VALUE;
        
        
        int max_LN = max_BT(root.left);
        int max_RN = max_BT(root.right);
        
        return Math.max(root.val,Math.max(max_LN,max_RN));
    }
    
    static String pre,post,in;
    
    public static void Traversal(Node root){
        if(root==null)
        return;
        
        pre+=root.val+" ";
        Traversal(root.left);
        in+=root.val+" ";
        Traversal(root.right);
        post+=root.val+" ";
    }
    
    public static void levelOrder(Node root){
        Queue<Node> q = new ArrayDeque<>();
        
        q.add(root);
        
        while(q.size()>0){
            int s = q.size();
            
            while(s-->0){
                
                Node node = q.remove();
                
                System.out.print(node.val+" ");
                
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
                
            }
            System.out.println();
        }
    }
    
    public static void iterative_trav(Node root){
        Stack<pair> st = new Stack<>();
        pair rp = new pair(root,1);
        
        st.push(rp);
        
        while(st.size()>0){
            pair top = st.peek();
            
            if(top.state==1){
                pre+=top.node.val+" ";
                top.state++;
                if(top.node.left!=null){
                    st.push(new pair(top.node.left,1));
                }
            }
            else if(top.state==2){
                in+=top.node.val+" ";
                top.state++;
                if(top.node.right!=null){
                    st.push(new pair(top.node.right,1));
                }
            }
            else{
                post+=top.node.val+" ";
                st.pop();
            }
        }
    }
    
    public static boolean find(Node root,int data){
        if(root==null)
        return false;
        
        if(root.val == data)
        return true;
        
        boolean isInLn = find(root.left,data);
        if(isInLn==true)
        return true;
        
        boolean isInRn = find(root.right,data);
        if(isInRn==true)
        return true;
        
        return false;
    }
    
    public static boolean find2(Node root,int data,List<Integer> path){
        if(root==null)
        return false;
        
        if(root.val == data){
            path.add(root.val);
            return true;
        }
        
        boolean isInLn = find2(root.left,data,path);
        if(isInLn==true){
            path.add(root.val);
            return true;
        }
        
        boolean isInRn = find2(root.right,data,path);
        if(isInRn==true){
            path.add(root.val);
            return true;
        }
        
        return false;
    }
    
    public static boolean find_Path_node(Node root,int data,List<Node> n2rpath){
        if(root==null)
        return false;
        
        if(root.val == data){
            n2rpath.add(root);
            return true;
        }
        
        
        boolean isInLn = find2(root.left,data,path);
        if(isInLn==true){
            n2rpath.add(root);
            return true;
        }
        
        boolean isInRn = find2(root.right,data,path);
        if(isInRn==true){
            n2rpath.add(root);
            return true;
        }
        
        return false;
    }
    
    public static void Print_k_levelsDown(Node root,int k){
        if(root==null || k<0)
        return;
        
        if(k==0){
            System.out.println(root.val);
        }
        
        Print_k_levelsDown(root.left,k-1);
        Print_k_levelsDown(root.right,k-1);
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a = new int[]{50,25,12,-1,-1,37,30,-1,-1,-1,75,62,-1,70,-1,-1,87,-1,-1};
		
		Node root = construct_BinaryTree(a);
		
// 		Display_BinaryTree(root);
		System.out.println(size_BT(root));
		System.out.println(sum_BT(root));
		System.out.println(max_BT(root));
		
		pre="";
		post="";
		in="";
		
// 		Traversal(root);
		
// 		System.out.println(pre);
// 		System.out.println(post);
// 		System.out.println(in);
		
		levelOrder(root);
		iterative_trav(root);
		
		System.out.println(pre);
		System.out.println(post);
		System.out.println(in);
		
		System.out.println(find(root,37));
		System.out.println(find(root,367));
		
		List<Integer> path = new ArrayList<>();
		boolean f1 = find2(root,30,path);
		System.out.println(path);
		
		Print_k_levelsDown(root,3);
		
		
		
	}
}
