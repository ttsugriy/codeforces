#include <algorithm>
#include <cctype>
#include <iostream>
#include <string>

int main() {
    std::string s; std::cin >> s;
    auto nb_lower = std::count_if(s.begin(), s.end(), islower);
    if (nb_lower * 2 >= s.size()) {
        std::transform(s.begin(), s.end(), s.begin(), tolower);
        std::cout << s << std::endl;
    } else {
        std::transform(s.begin(), s.end(), s.begin(), toupper);
        std::cout << s << std::endl;
    }
}
