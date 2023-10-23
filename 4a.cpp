#include <iostream>

int main() {
    int w; std::cin >> w;
    int p2 = w - 2;
    std::cout << (((p2 > 0) && (p2 & 1) == 0) ? "YES" : "NO") << std::endl;
}