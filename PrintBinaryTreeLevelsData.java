import java.util.*;

class Node
{
        Node left;
        Node right;
        int data;

        public Node(int data)
        {
                this.data = data;
        }

}

class TreeOperation
{
        public void  leftView(Node root,int level,List<List<Integer>> output)
        {
                if(root == null)
                {
                        return;
                }
                else
                {
                        if(output.size() <  level)
                        {
                                output.add(new ArrayList<Integer>());
                        }
                        output.get(level-1).add(root.data);
                        leftView(root.left,level + 1,output);
                        leftView(root.right,level + 1,output);
                }
        }
}



class Driver
{
        public static void main(String[] d)
        {
                Node root = new Node(4);
                root.left = new Node(3);
                root.right = new Node(2);

                root.left.right = new Node(5);

                 root.right.left = new Node(6);
                 root.right.right = new Node(1);

                 root.right.right.left = new Node(0);




                TreeOperation op = new TreeOperation();
                List<List<Integer>> elements = new ArrayList<List<Integer>>();
                op.leftView(root,1,elements);



                for(List<Integer> level:elements)
                {
                        for(Integer item:level)
                        {
                                System.out.print(item + " ");
                        }
                        System.out.print("\n");
                }

        }
}

