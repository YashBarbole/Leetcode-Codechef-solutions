#include<bits/stdc++.h>
using namespace std;

class Node{
    public:
    int data;
    Node* next;
    Node*back;
    public:
    Node(int data1,Node* next1,Node*back1){
        data=data1;
        next=next1;
        back=back1;
    }
    public:
    Node(int data1){
        data=data1;
        next=nullptr;
        back=nullptr;
    }
}; 

Node*deleteHead(Node*head){
    if(head==NULL || head->next==NULL){
        return NULL;
    }
    Node*prev=head;
    head=head->next;

    head->back=nullptr;
    prev->next=nullptr;

    delete prev;
    return head;
}

Node*convertArr2Dll(vector<int>&arr){
        Node*head=new Node(arr[0]);
        Node*prev=head;
        for(int i=1;i<arr.size();i++){
            Node*temp=new Node(arr[i],nullptr,prev);
            prev->next=temp;
            prev=temp;

        }
        return head;
}
//yash
void print(Node*head){
    while(head!=NULL){
        cout<<head->data<<" ";
        head=head->next;
    }

}

Node* deleteTail(Node*head){
       if(head==NULL || head->next==NULL){
        return NULL;   
    }
    Node*tail=head;
    while(tail->next!=NULL){
       tail= tail->next;
    }
    Node*newTail=tail->back;
    newTail->next=nullptr;
    tail->back=nullptr;
    delete tail;
    return head;

}

Node* deleteK(Node*head,int k){
    if (head==NULL){
        return NULL;
    }
    int cnt=0;
    Node*knode=head;
    while(knode!=NULL){
        cnt++;
        if(cnt==k) break;
        knode=knode->next;
    }
    Node*prev=knode->back;
    Node*front=knode->next;

    if(prev==NULL && front == NULL) return NULL;

    else if(prev==NULL){
      return   deleteHead(head);
    }

    else if(front==NULL){
       return  deleteTail(head);
    }

    else{
        prev->next=front;
        front->back=prev;

        knode->next=nullptr;
        knode->back=nullptr;
        delete knode;
    }
    return head;


}

void deleteNode(Node*temp){
    Node*prev= temp->back;
    Node*front=temp->next;

    if(front==NULL){
        prev->next=nullptr;
        temp->back=nullptr;
        free(temp);
        return;
    }
    prev->next=front;
    front->back=prev;

    temp->next=nullptr;
    temp->back=nullptr;
    free(temp);

    
}
Node * insertBeforeHead(Node*head,int val){
    Node*newHead=new Node(val,head,nullptr);
    head->back=newHead;

    return newHead;

}

Node* insertBeforeTail(Node*head,int val){
    if (head->next==NULL){
        return insertBeforeHead(head,val);
    }
    
    Node*tail=head;
    while(tail->next!=NULL){
        tail=tail->next;
    }

    Node*prev=tail->back;
    Node*newNode=new Node(val,tail,prev);
    prev->next=newNode;
    tail->back=newNode;
    return head;
}
//yash made


int main(){
    vector <int> arr={12,5,8,7};
    Node*head=convertArr2Dll(arr);
    deleteNode(head->next);
    print(head);


    return 0;

}