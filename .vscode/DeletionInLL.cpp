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

int main(){
    vector<int> arr{12,5,8,7};
    Node*head=convertArr2LL(arr);
    head=removesHead(head);
    print(head);

}