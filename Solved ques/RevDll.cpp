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
Node*RevDLL(Node*head ){
   if (head == NULL || head->next == NULL) return head;

    Node* current = head;
    Node* temp = NULL;

    // Swap next and back for all nodes
    while (current != NULL) {
        temp = current->back;
        current->back = current->next;
        current->next = temp;
        current = current->back;  // Because we swapped, move to 'back' (which was next)
    }

    // New head is the last node processed
    if (temp != NULL)
        head = temp->back;

    return head;
}
void print(Node*head){
    while(head!=NULL){
        cout<<head->data<<" ";
        head=head->next;
    }

}

int main(){
    vector <int> arr={12,5,8,7};
    Node*head=convertArr2Dll(arr);
    head= RevDLL(head);
    print(head);
    
}