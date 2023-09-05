//import java.util.ArrayList;
//import java.util.List;
//
//public class MinHeaps {
//
//    List<Integer> heap = new ArrayList<>();
//
//    public int parentIndex(int childIndex) {
//        return (childIndex - 1) / 2;
//    }
//
//    public int leftChildIndex(int parentIndex){
//        return (2*parentIndex)+1;
//    }
//
//    public int rightChildIndex(int parentIndex){
//        return (2*parentIndex)+2;
//    }
//
//    public void insert(int data) {
//        heap.add(data);
//        int childIndex = heap.indexOf(data);
//        int parentIndex = parentIndex(childIndex);
//        while (childIndex > 0 && heap.get(parentIndex) > heap.get(childIndex)) {
//            swap(parentIndex, childIndex);
//            childIndex = parentIndex;
//            parentIndex = parentIndex(childIndex);
//        }
//    }
//
//    public void delete(){
//        int deleteEleIndex=0;
//        int lastEleIndex=heap.size()-1;
//        swap(deleteEleIndex,lastEleIndex);
//        heap.remove(lastEleIndex);
//        while(deleteEleIndex< heap.size()&&leftChildIndex(deleteEleIndex)<heap.size()&&rightChildIndex(deleteEleIndex)<heap.size()){
//            int minIndex=heap.indexOf(Math.min(heap.get(leftChildIndex(deleteEleIndex)),heap.get(rightChildIndex(deleteEleIndex))));
//            if(heap.get(deleteEleIndex)>heap.get(minIndex)){
//                swap(deleteEleIndex,minIndex);
//                deleteEleIndex=minIndex;
//            }
//        }
//    }
//    public void traverse() {
//        for (Integer h : heap) {
//            System.out.println(h);
//        }
//    }
//
//    public void swap(int parentIndex, int childIndex) {
//        int temp = heap.get(parentIndex);
//        heap.set(parentIndex, heap.get(childIndex));
//        heap.set(childIndex, temp);
//    }
//
//
//    public static void main(String[] args) {
//
//        MinHeaps HEAP = new MinHeaps();
//        HEAP.insert(28);
//        HEAP.insert(24);
//        HEAP.insert(25);
//        HEAP.insert(29);
//        HEAP.insert(23);
//
//        HEAP.delete();
//        HEAP.traverse();
//    }
//
//
//}
