  #include <iostream>
using namespace std;
#include<bits/stdc++.h>  

struct Node {
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};

Node* convertArr2LL(vector<int> &arr){
    Node* head=new Node(arr[0]);
    Node* mover=head;
    for(int i=1;i<arr.size();i++){
        Node*temp =new Node(arr[i]);
        mover->next=temp;
        mover=temp;

    }
    return head;

}


Node* removesHead(Node*head){
    if(head==NULL) return head;
    Node*temp=head;
    head=head->next;
    delete temp;
    return head;


}
void print(Node*head){
    while(head!=NULL){
        cout<<head->data<<" ";
        head=head->next;
    }
    cout<<endl;
}

Node* removesTail(Node*head){
    if(head==NULL || head->next==NULL) return NULL;
    Node*temp=head;
    while(temp->next->next != NULL){
        temp=temp->next;
    }
    delete temp->next;
    temp->next=nullptr;

    return head;

}
//remove kth element
Node*removeK(Node*head,int k){
    if(head==NULL) return head;
    if(k==1){
        Node*temp=head;
        head=head->next;
        free (temp);
        return head;
    }
    int cnt=0;
    Node*temp=head;
    Node*prev=NULL;
    while (temp!=NULL)
    {   cnt++;
        if(cnt==k){
            prev->next=prev->next->next;
            free(temp);
            break;
        }
        prev=temp;
        temp=temp->next;
    }
    return head;

}

int main(){
    vector<int> arr{12,5,8,7};
    Node*head=convertArr2LL(arr);
    head=removeK(head,3);

    print(head);

}