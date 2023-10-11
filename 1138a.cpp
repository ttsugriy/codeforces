#include <iostream>
#include <algorithm>
#include <utility>

int main() {
    int n; std::cin >> n;
    int mx = 0, curr = 0, prev = 0, val = 0;
    for (int i = 0; i < n; ++i) {
        int sushi; std::cin >> sushi;
        if (val == sushi) ++curr; else prev = std::exchange(curr, 1);
        val = sushi;
        mx = std::max(mx, std::min(curr, prev));
    }
    std::cout << mx * 2 << std::endl;
}