#include<bits/stdc++.h>  
using namespace std;

struct Node{
    public:
    int data;
    Node* next;

    public:
    Node(int data1,Node*next1){
        data=data1;
        next=next1;
    }

    public:
    Node(int data1){
        data=data1;
        next=nullptr;
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
//length
int lengthOfLL(Node*head){
    int cnt=0;
    Node* temp=head;
    while(temp){
    temp=temp->next;
    cnt++;
   }
   return cnt;


}
int checkIfPresent(Node* head, int val)
{
    Node* temp=head;
    while(temp){
    if(temp->data==val){
        return 1;
    }
    temp=temp->next;
}
return 0;
}
//traversal
int main(){
    vector<int>arr={3,5,8,7};
    Node* head=convertArr2LL(arr);
    Node* temp=head;
   while(temp){
    cout<< temp->data<<" ";
    temp=temp->next;

   }
cout<<endl;

cout<<"length of LL is "<<lengthOfLL(head)<<endl;;
cout<<checkIfPresent(head,5);
  
}