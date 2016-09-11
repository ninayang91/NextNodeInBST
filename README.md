# NextNodeInBST
Given a node in binary search tree, find its next node, we know each node's parent

if null return null
if t.right!=null return leftMost(t.right)
else //focus on parent
    while(t.parent !=null && t is a right child of its parent) 
      t=t.parent//go up
    return t.parent

It is not necessary a BST, it is enough for a binary tree since we use t.parent.left!=t to check if it is the left node of its parent


