import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinHeap {

    List<Integer>minheap=new ArrayList<>();

    public int parent(int index){
        return (index-1)/2;
    }

    public int leftChild(int index){
            return (2*index)+1;
    }

    public int rightChild(int index){
        return (2*index)+2;
    }

    public void insert(int data){
        minheap.add(data);
        shiftUp(minheap.size()-1);
    }

    public void shiftUp(int currentIndex){
        int parent=parent(currentIndex);
        while(currentIndex>0&&minheap.get(currentIndex)<minheap.get(parent)){
            swap(parent,currentIndex,minheap);
            currentIndex=parent;
            parent=parent(currentIndex);
        }
    }

    private void swap(int index1,int index2,List<Integer> minheap){
        int temp=minheap.get(index1);
        minheap.set(index1,minheap.get(index2));
        minheap.set(index2,temp);
    }

    public void display(){
        for(Integer i:minheap){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MinHeap heap=new MinHeap();
        List<Integer>list=Arrays.asList(12,23,45,4,2,1,5);

        for(Integer i: list){
            heap.insert(i);
        }

        heap.display();



    }


}
