#include <iostream>
using namespace std;

class Solution {
private:
    bool valid(char ch) {
        return (ch >= 'a' && ch <= 'z') || 
               (ch >= 'A' && ch <= 'Z') || 
               (ch >= '0' && ch <= '9');
    }

    char toLowerCase(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return ch;
        } else {
            return ch - 'A' + 'a';
        }
    }

    bool checkPalindrome(string a) {
        int s = 0;
        int e = a.length() - 1;

        while (s < e) {
            if (a[s] != a[e]) {
                return false;
            } else {
                s++;
                e--;
            }
        }
        return true;
    }

public:
    bool isPalindrome(string s) {
        string temp = "";
        for (int j = 0; j < s.length(); j++) {
            if (valid(s[j])) {
                temp.push_back(toLowerCase(s[j]));
            }
        }
        return checkPalindrome(temp);
    }
};

int main() {
    Solution sol;
    cout << sol.isPalindrome("A man, a plan, a canal: Panama") << endl; // Output: 1 (true)
    cout << sol.isPalindrome("race a car") << endl; // Output: 0 (false)
    cout << sol.isPalindrome("") << endl; // Output: 1 (true)
    return 0;
}
