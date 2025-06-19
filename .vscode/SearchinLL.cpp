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

// Function to remove duplicates from sorted linked list
Node* removeDuplicates(Node* head) {
    if (head == nullptr || head->next == nullptr) return head;

    Node* curr = head;
    while (curr && curr->next) {
        if (curr->data == curr->next->data) {
            // Duplicate found, skip the next node
            Node* temp = curr->next;
            curr->next = curr->next->next;
            delete temp; // Free memory
        } else {
            curr = curr->next;
        }
    }
    return head;
}

// Helper to create a linked list from input
Node* createList(int n) {
    int x;
    cin >> x;
    Node* head = new Node(x);
    Node* tail = head;
    for (int i = 1; i < n; i++) {
        cin >> x;
        tail->next = new Node(x);
        tail = tail->next;
    }
    return head;
}

// Helper to print a linked list
void printList(Node* head) {
    while (head) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}
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
int checkIfpresent(Node*head,int val){
    Node*temp=head;
    while(temp){
        if(temp->data==val) return 1;
        temp=temp->next;
    }
    return 0;
}
// Main function to test multiple test cases
int main() {
    vector<int> arr={12,5,8,7};
    Node*head=convertArr2LL(arr);
    cout<<checkIfpresent(head,9);
}
