#include <iostream>
#include <string>

int main() {
    int n; std::cin >> n;
    std::string s; std::cin >> s;
    int count = 0;
    for (int i = 1; i < n; ++i)
        count += s[i-1] == s[i];
    std::cout << count << std::endl;
}
