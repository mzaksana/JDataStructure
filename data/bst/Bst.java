package data.bst;

import data.Quotes;

public class Bst {
    public Node root;
    private Node flagNode;
    public void add(Quotes data){
        Node tmp = root;
        Node tmp2 = root;
        int flag=0;
        if(this.root==null){
            Node node =new Node();
            node.setData(data);
            root=node;
        }else {
            while (tmp!=null){
                tmp2=tmp;
                    if(data.toString().compareToIgnoreCase(tmp.data.toString())<=0){
                    tmp=tmp.kiri;
//                    System.out.println("Kiri");
                    flag=0;
                }else {
                    tmp=tmp.kanan;
                    flag=1;
//                    System.out.println("kanan");

                }
            }
            Node node = new Node();
            node.setData(data);
            if(flag==0){
                tmp2.setKiri(node);
            }else {
                tmp2.setKanan(node);
            }
        }
    }

    public void display(Node node){

        if(node==null){
            return;
        }
        System.out.println(node.data);
        display(node.kiri);
        display(node.kanan);
    }



    public Node remove(Node node,Quotes data){
        if(node==null){
            return node;
        }

        if(data.toString().compareTo(node.data.toString())<0){

            remove(node.kiri,data);
        } else if (data.toString().compareTo(node.data.toString()) > 0) {
            remove(node.kanan, data);
        } else {
            if (node.kiri == null)
                return node.kanan;
            else if (node.kanan == null)
                return node.kiri;
            node.kiri = minValue(node.kanan);

            // Delete the inorder successor
            node.kanan = remove(node.kanan, node.data);
        }
        return node;
    }
    Node minValue(Node root)
    {
        Node minv = root;
        while (root.kiri!= null)
        {
            minv = root.kiri;
            root = root.kiri;
        }
        return minv;
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.kanan);
//        System.out.println(node.data);
        postOrder(node.kiri);
        flagNode=node;

    }
}
