#include <iostream>
#include <string>  // required for string usage
using namespace std;

class Solution {
private:
    bool valid(char ch) {
        return (ch >= 'a' && ch <= 'z') || 
               (ch >= 'A' && ch <= 'Z') || 
               (ch >= '0' && ch <= '9');
    }

    char tolowercase(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return ch;
        }
        return ch - 'A' + 'a';
    }

    bool checkpalindrome(string a) {
        int s = 0, e = a.length() - 1;
        while (s <= e) {
            if (a[s] != a[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

public:
    bool isPalindrome(string a) {
        string temp = "";
        for (int j = 0; j < a.length(); j++) {
            if (valid(a[j])) {
                temp.push_back(tolowercase(a[j]));
            }
        }
        return checkpalindrome(temp);
    }
};

int main() {
    Solution sol;

    string input;
    cout << "Enter a string to check if it is a palindrome: ";
    getline(cin, input);  // use getline to accept spaces

    if (sol.isPalindrome(input)) {
        cout << " It's a palindrome!" << endl;
    } else {
        cout << " Not a palindrome." << endl;
    }

    return 0;
}
