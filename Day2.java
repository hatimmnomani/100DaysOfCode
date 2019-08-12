// WRITE YOUR CODE HERE
public void makePerfect(){
    int h= height();
    if(overallRoot!=null){
    makePerfect(overallRoot,0,h);
    }
}
private void makePerfect(IntTreeNode root,int i,int h){
    int ch=height(root);
    if(ch==1 && i+1==h){
    return ;
    }else{
        if(h!=ch+i || root.right==null || root.left==null){
            if(root.right == null){
                root.right= new IntTreeNode(0);
            }
            if(root.left == null){
                root.left = new IntTreeNode(0);
            }
        }
            makePerfect(root.left,i+1,h);
            makePerfect(root.right,i+1,h);
        
    }
}