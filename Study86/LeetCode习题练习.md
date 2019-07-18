#                                LeetCode习题练习

1 给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/symmetric-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

解题思路： 采用递归的思路，如果根节点为空，则直接返回true，若不为空，分别对其左右子树进行判断，如果左右结构不对称，则其必然不是镜像二叉树，返回false。如果左右结构相同，并且其左右都为空，则返回true。如果其左右都不为空，则在其左右值相等的情况下，递归其子树的左右子树。

```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if(leftTree==null&&rightTree!=null||leftTree!=null&&rightTree==null){
            return false;
        }
        if((leftTree==null&&rightTree==null)){
            return true;
        }
        return leftTree.val==rightTree.val
            &&isSymmetricChild(leftTree.left,rightTree.right)
            &&isSymmetricChild(leftTree.right,rightTree.left);
    }
}
```

2 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。

空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。

示例 1:

输入: 二叉树: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

输出: "1(2(4))(3)"

解释: 原本将是“1(2(4)())(3())”，
在你省略所有不必要的空括号对之后，
它将是“1(2(4))(3)”。
示例 2:

输入: 二叉树: [1,2,3,null,4]
       1
     /   \
    2     3
     \  
      4 

输出: "1(2()(4))(3)"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/construct-string-from-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

解题思路：根据情况，依然采用递归的思路来解决问题。通过分析，我们可以得出几种情况，一种为根节点为空，则直接返回，不为空打印根节点。然后判断其左右子树，在左子树为空，右子树不为空，则直接字符串拼接“()”，然后继续往下走，哪边不为空，则继续递归，并在递归前后分别拼接“（”和“）”。

```java
class Solution {
    
    StringBuilder sb=new StringBuilder();
    public String tree2str(TreeNode t) {
        if(t!=null){
            sb.append(t.val);
        }
        if(t==null){
            return sb.toString();
        }
        if(t.left==null&&t.right!=null){
            sb.append("()");
        }
        if(t.left!=null){
            sb.append("(");
            tree2str(t.left);
            sb.append(")");
        }
        if(t.right!=null){
            sb.append("(");
            tree2str(t.right);
            sb.append(")");
        }
        return sb.toString();
    }
}
```

3 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。

百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”

例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]



 

示例 1:

输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
输出: 3
解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
示例 2:

输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
输出: 5
解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

解题思路：当给定的p或者q任意一个为根节点的时候，其必然是最近的公共祖先。然后分别递归左右子树，若两边都不为空，则根节点就为其最小公共祖先。否则哪边不为空哪边为其公共祖先。

```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(q==root||p==root){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        if(left==null&&right!=null){
            return right;
        }
        if(left!=null&&right==null){
            return left;
        }
        return null;
    }
}
```

