#include <iostream>
#include <stack>
using namespace std;

class MinStack {
private:
    stack<long long> st;
    long long minVal;

public:
    void push(int val) {
        if (st.empty()) {
            st.push(val);
            minVal = val;
        } else {
            if (val >= minVal) {
                st.push(val);
            } else {
                st.push(2LL * val - minVal);
                minVal = val;
            }
        }
    }

    void pop() {
        if (st.empty()) return;

        long long top = st.top();
        st.pop();

        if (top < minVal) {
            minVal = 2LL * minVal - top;
        }
    }

    int top() {
        long long top = st.top();
        if (top >= minVal) {
            return top;
        } else {
            return minVal;
        }
    }

    int getMin() {
        return minVal;
    }

    bool isEmpty() {
        return st.empty();
    }
};

int main() {
    MinStack s;

    s.push(5);
    s.push(3);
    s.push(1);
    cout << "Current Min: " << s.getMin() << endl;  // Output: 1

    s.pop();
    cout << "Top: " << s.top() << endl;             // Output: 3
    cout << "Current Min: " << s.getMin() << endl;  // Output: 3

    s.push(0);
    cout << "Top: " << s.top() << endl;             // Output: 0
    cout << "Current Min: " << s.getMin() << endl;  // Output: 0

    return 0;
}
