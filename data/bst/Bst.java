package data.bst;

import data.Quotes;

public class Bst {
    public Node root;

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
                    System.out.println("Kiri");
                    flag=0;
                }else {
                    tmp=tmp.kanan;
                    flag=1;
                    System.out.println("kanan");

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

//    public void display(Quotes data){
//        Node tmp = root;
//        Node tmp2 = root;
//        int flag=0;
//        if(this.root==null){
//            Node node =new Node();
//            node.setData(data);
//            root=node;
//        }else {
//            while (tmp!=null){
//                tmp2=tmp;
//                if(data.toString().equals(tmp.toString())){
//                    tmp=tmp.kiri;
//                    System.out.println("Kiri");
//                }else {
//                    tmp=tmp.kanan;
//                    flag=1;
//                    System.out.println("kanan");
//
//                }
//            }
//            Node node = new Node();
//            node.setData(data);
//            if(flag==0){
//                tmp2.setKiri(node);
//            }else {
//                tmp2.setKanan(node);
//            }
//        }
//    }
}
