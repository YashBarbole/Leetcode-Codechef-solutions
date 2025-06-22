#include <iostream>
#include <vector>
using namespace std;

struct Node {
    int data;
    Node* next;

    // Constructor for one argument
    Node(int val) {
        data = val;
        next = nullptr;
    }

    // Constructor for two arguments
    Node(int val, Node* nextNode) {
        data = val;
        next = nextNode;
    }
};

Node* convertArr2LL(vector<int>& arr) {
    if (arr.empty()) return nullptr;

    Node* head = new Node(arr[0]);
    Node* mover = head;
    for (int i = 1; i < arr.size(); i++) {
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}

Node* removesHead(Node* head) {
    if (head == NULL) return head;
    Node* temp = head;
    head = head->next;
    delete temp;
    return head;
}

Node* removesTail(Node* head) {
    if (head == NULL || head->next == NULL) return NULL;
    Node* temp = head;
    while (temp->next->next != NULL) {
        temp = temp->next;
    }
    delete temp->next;
    temp->next = nullptr;
    return head;
}

// Remove kth element
Node* removeK(Node* head, int k) {
    if (head == NULL) return head;
    if (k == 1) {
        Node* temp = head;
        head = head->next;
        delete temp;  // ✅ changed from free() to delete
        return head;
    }
    int cnt = 0;
    Node* temp = head;
    Node* prev = NULL;
    while (temp != NULL) {
        cnt++;
        if (cnt == k) {
            prev->next = temp->next;
            delete temp;  // ✅ changed from free() to delete
            break;
        }
        prev = temp;
        temp = temp->next;
    }
    return head;
}

Node* insertHead(Node* head, int val) {
    Node* temp = new Node(val, head);
    return temp;
}
Node*inserttail(Node*head,int val){
    if(head==NULL) {
        return new Node(val);
    }
    Node*temp=head;
    while(temp->next!=NULL){
        temp=temp->next;

    }
    Node*newNode=new Node(val);
    temp->next=newNode;

    return head;
}

Node* insertPosition(Node* head, int el,int k){
    if(head==NULL){
        if(k==1){
            return new Node(el);
        }
        else{
            return head;
        }

         
    }
    if (k==1){
        return new Node(el,head);

    }
    int cnt=0;
    Node*temp=head;
    while(temp!=NULL){
        cnt++;
        if(cnt==(k-1)){
            Node*x=new Node(el,temp->next);
           temp->next=x;
           break;
        }
        temp=temp->next;
    }
    return head;


}

void print(Node* head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    vector<int> arr{12, 5, 8, 7};
    Node* head = convertArr2LL(arr);
    head = insertPosition(head, 200,2);

    print(head);
}
