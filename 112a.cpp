#include <iostream>
#include <string>

int main() {
    std::string first, second;
    std::cin >> first >> second;
    for (int i = 0; i < first.size(); ++i) {
        const char c1 = std::tolower(first[i]), c2 = std::tolower(second[i]);
        if (c1 < c2) {
            std::cout << -1 << std::endl;
            return 0;
        } else if (c1 > c2) {
            std::cout << 1 << std::endl;
            return 0;
        }
    }
    std::cout << 0 << std::endl;
}
