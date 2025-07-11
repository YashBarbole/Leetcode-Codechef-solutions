#include<bits/stdc++.h>
using namespace std;

struct Node{
    public:
    int data;
    Node*next;

    Node(int data1, Node* next1){
        data=data1;
        next=next1;
    }

    Node(int data1){
        data=data1;
        next=nullptr;
    }
};

Node* convertArr2LL(vector<int> arr){
    Node* head= new Node(arr[0]);
    Node* mover= head;

    for(int i=1;i<arr.size();i++){
        Node*temp = new Node(arr[i]);
        mover->next=temp;
        mover=temp;

    }
        return head;
} 

int length(Node*head){
    int cnt=0;
     Node*temp= head;
    while(temp){

        temp=temp->next;
        cnt++;

    }
    return cnt;

}

int check(Node*head, int val){
     Node*temp= head;
    while(temp){
        if(temp->data==val) return 1;
        temp=temp->next;
    }
    return 0;

}

Node* removehead(Node*head){
    if(head==NULL) return head;
    Node* temp=head;
    head=head->next;
    delete temp;
    return head;
}

Node* removeTail(Node*head)
{
    if(head==NULL || head->next==NULL) return NULL;
    Node*temp=head;
    while(temp->next->next!=NULL){
        temp=temp->next;
    }
    delete temp->next;
    temp->next=nullptr;
     
    return head;

}

void print(Node*head){
    while(head!=NULL){
        cout<<head->data<<" ";
        head=head->next;
    }
}
//yash
int main(){
    vector<int> arr={2,5,6,7};

    Node*head =convertArr2LL(arr);
     head=removeTail(head);
     print(head);
    // head=removehead(head);
    // print(head);
    // cout<<endl;
    // cout<<"lenght is"<<length(head)<<endl;
   
    // cout<<check(head,3)<<endl;
    
}