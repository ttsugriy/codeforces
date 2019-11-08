#include <iostream>

bool can_equalize(char* s, char* t, int n) {
    int mismatches[3] = {0};
    int mismatch_count = 0;
    for (int i = 0; i < n && mismatch_count <= 2; ++i) {
        if (s[i] != t[i]) {
            mismatches[mismatch_count++] = i;
        }
    }
    if (mismatch_count == 0) return true;
    if (mismatch_count != 2) return false;
    return s[mismatches[0]] == s[mismatches[1]] && t[mismatches[0]] == t[mismatches[1]];
}

int main() {
    int k; std::cin >> k;
    for (int _ = 0; _ < k; ++_) {
        int n; std::cin >> n;
        char s[n+1], t[n+1]; std::cin >> s >> t;
        std::cout << (can_equalize(s, t, n) ? "Yes" : "No") << std::endl;
    }
}