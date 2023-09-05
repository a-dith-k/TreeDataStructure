import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    List<Integer> maxHeap=new ArrayList<>();

    public int parentIndex(int child){
        return (child-1)/2;
    }

    public int leftChildIndex(int parentIndex){
        return (2*parentIndex)+1;
    }

    public int rightChildIndex(int parentIndex){
        return (2*parentIndex)+2;
    }

    public void insert(int data){
        maxHeap.add(data);
        int insertIndex=maxHeap.indexOf(data);
        int parentIndex=parentIndex(insertIndex);
        while(insertIndex>0&&maxHeap.get(parentIndex)<maxHeap.get(insertIndex)){
                swap(parentIndex,insertIndex);
                insertIndex=parentIndex;
                parentIndex=parentIndex(insertIndex);
        }


    }

    public void remove(){
        int startIndex=0;
        int endIndex= maxHeap.size()-1;
        swap(startIndex,endIndex);
        maxHeap.remove(endIndex);
        int leftChild=leftChildIndex(startIndex);
        int rightChild=rightChildIndex(startIndex);
        while(leftChild<endIndex){

            int maxIndex= maxHeap.indexOf(Math.max(maxHeap.get(leftChild),maxHeap.get(rightChild)));
            if(startIndex<maxIndex){
                swap(startIndex,maxIndex);
                startIndex=maxIndex;
            }
            leftChild=leftChildIndex(startIndex);
            rightChild=rightChildIndex(startIndex);
        }

    }

    public void traverse(){
        for(Integer i: maxHeap){
            System.out.println(i);
        }
    }

    public void swap(int parentIndex, int childIndex) {
        int temp = maxHeap.get(parentIndex);
        maxHeap.set(parentIndex, maxHeap.get(childIndex));
        maxHeap.set(childIndex, temp);
    }

    public static void main(String[] args){

        MaxHeap heap=new MaxHeap();
        heap.insert(22);
        heap.insert(41);
        heap.insert(13);
        heap.insert(21);
        heap.insert(2);
        heap.insert(27);
        heap.remove();
        heap.traverse();
    }



}
