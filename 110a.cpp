#include <algorithm>
#include <iostream>

bool is_lucky(size_t x) {
    for (size_t tmp = x; tmp; tmp /= 10)
        if (int digit = tmp % 10; digit != 4 and digit != 7) return false;
    return x;
}

int main() {
    std::string n; std::cin >> n;
    auto count = std::count_if(begin(n), end(n), [](char c) { return c == '4' or c == '7'; });
    std::cout << (is_lucky(count) ? "YES" : "NO") << std::endl;
}
