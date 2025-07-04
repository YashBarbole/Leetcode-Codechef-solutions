#include <iostream>
#include <climits>
using namespace std;

class Node {
public:
    int data;
    int minSoFar;
    Node* next;

    Node(int x, int minVal) {
        data = x;
        minSoFar = minVal;
        next = NULL;
    }
};

class MinStack {
    Node* topNode;

public:
    MinStack() {
        topNode = NULL;
    }

    void push(int x) {
        int minVal = (topNode == NULL) ? x : min(x, topNode->minSoFar);
        Node* temp = new Node(x, minVal);
        temp->next = topNode;
        topNode = temp;
    }

    void pop() {
        if (topNode == NULL) {
            cout << "Stack is empty!" << endl;
            return;
        }
        Node* temp = topNode;
        topNode = topNode->next;
        delete temp;
    }

    int top() {
        if (topNode == NULL) {
            cout << "Stack is empty!" << endl;
            return -1;
        }
        return topNode->data;
    }

    int getMin() {
        if (topNode == NULL) {
            cout << "Stack is empty!" << endl;
            return INT_MAX;
        }
        return topNode->minSoFar;
    }

    void display() {
        Node* temp = topNode;
        cout << "Stack (top to bottom): ";
        while (temp != NULL) {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
};

int main() {
    MinStack s;
    s.push(10);
    s.push(5);
    s.push(20);
    s.push(3);
    s.display();                // Stack: 3 20 5 10

    cout << "Top: " << s.top() << endl;        // 3
    cout << "Min: " << s.getMin() << endl;     // 3

    s.pop(); // remove 3
    cout << "Top: " << s.top() << endl;        // 20
    cout << "Min: " << s.getMin() << endl;     // 5

    return 0;
}
