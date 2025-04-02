#include <iostream>
using namespace std;

int main() {
    int n, i;
    cout << "Enter the number to know whether the number is prime or not: ";
    cin >> n;

    // Special case for n = 1
    if (n <= 1) {
        cout << "Not a prime number" << endl;
        return 0;
    }

    for (i = 2; i < n; i++) {
        if (n % i == 0) {
            cout << "Not a prime number" << endl;
            break;
        }
    }

    if (i == n) {
        cout << "Prime number" << endl;
    }

    return 0;
}
