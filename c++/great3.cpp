#include<iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter 3 numbers: ";
    cin >> a >> b >> c;

    if (a == b && b == c || a == 0&& b==0&& c==0) {
        cout << "All numbers are either equal or are 0";
    } else 
       if (a > b) {
        if (a > c) {
            cout << "A is the greatest";
        } else {
            cout << "C is the greatest";
        }
    } else
     if (b > c) {
        if (b > a) {
            cout << "B is the greatest";
        } else {
            cout << "A is the greatest";
        }
    } else {
        cout << "C is the greatest";
    }

    return 0;
}
