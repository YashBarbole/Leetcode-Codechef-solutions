#include <iostream>
using namespace std;

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

// Main function to test multiple test cases
int main() {
    int T;
    cin >> T;

    while (T--) {
        int n;
        cin >> n;
        Node* head = createList(n);
        head = removeDuplicates(head);
        printList(head);
    }

    return 0;
}
