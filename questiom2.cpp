#include <iostream>

using namespace std;

class Queue{
    int front,rear,size,*queue;

    Queue(){
        cout <<"Enter the  size of the queue : "
        cin >> size;
        queue = new int[size];
        front = rear = -1;
    }

    void insert(){

        int num;
        cout << "\nEnter number to be inserted in the queue: ";
        cin >> num;
        
        if(rear ==(size-1)){
            cout << "\nOverflow";
        }
        else if(front == -1 && rear ==-1){
            front=rear=0;
        }
        else
        rear++;

        queue[rear]= num;
        
    }

    void delete(){
        int val;
        if(front == -1 || front > rear){
            cout << "\n Underflow";
        }

        else{

            val = queue[front];
            front++;
            if(front >rear)
            front = rear = -1;
            cout << "The number delete is :" << val;
        }

    }

    void oparator == (Queue q1,Queue q2){

        
    }
}