#include <algorithm>
#include <iostream>

int main() {
    int t; std::cin >> t;
    for (int ti = 0; ti < t; ++ti) {
        int n, x, a, b; std::cin >> n >> x >> a >> b;
        if (a > b) std::swap(a, b);
        int diff = b - a + (std::min(x, a - 1 + n - b));
        std::cout << diff << std::endl;
    }
}