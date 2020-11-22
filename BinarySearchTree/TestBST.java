import java.util.*;


class TestBST {
    public static void main (String [] args){
     /*   BST tree = new BST(50);
        tree.insert(30);
        tree.insert(60);
        tree.insert(100);
        tree.insert(20);
        tree.insert(5);
      //  tree.displayTree();
      //tree.preOrder(tree.root);
      //tree.inOrder(tree.root);
      tree.postOrder(tree.root); */
      Scanner input = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<>();
      ArrayList<ArrayList<String>> wordMatrix = new ArrayList<>();
      String line ;
      while (input.hasNextLine()){
          line = input.nextLine();
          if(line.isEmpty()){
            input.close();
              break;
          }
          list.add(line);
      }
      for (String n: list){
          ArrayList<String> temp = new ArrayList<>();
          for (String k: n.split(" ")){
              temp.add(k);
          }
          wordMatrix.add(temp);
      }
      for(ArrayList<String> l: wordMatrix){
          for(String k: l){
              System.out.println(k);
          }
      }
    }
    
}