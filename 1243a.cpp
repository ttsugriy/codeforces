#include <algorithm>
#include <functional>
#include <iostream>

int main() {
    int k; std::cin >> k;
    for (int i = 0; i < k; ++i) {
        int n; std::cin >> n;
        int a[n]; for (int j = 0; j < n; ++j) std::cin >> a[j];
        std::sort(a, a + n, std::greater<int>());
        int max_side = 0;
        for (int i = 0; i < n; ++i) {
            max_side = std::max(max_side, std::min(i + 1, a[i]));
        }
        std::cout << max_side << std::endl;
    }
}