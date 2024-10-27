#include <algorithm>
#include <iostream>

int main() {
    int k, n, w;
    std::cin >> k >> n >> w;
    long total = w * (w + 1) / 2 * k;
    std::cout << std::max(0L, total - n) << std::endl;
}
