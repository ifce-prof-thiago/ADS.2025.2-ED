#include <iostream>

using namespace std;

int fat(int n) {
    if (n == 1 || n == 0) return 1;
    return n * fat(n - 1);
}

int fatI(int n) {
    int res = 1;
    for (int i = n; i >= 1; i--) {
        res = res * i;
    }
    return res;
}

int main() {
    int x = fat(5);
    cout << x << endl;
}
