#include <algorithm>
#include <iostream>

int thanos_length(int a[], int left, int right) {
    if (std::is_sorted(a + left, a + right)) {
        return right - left;
    }
    int mid = left + (right - left) / 2;
    return std::max(thanos_length(a, left, mid), thanos_length(a, mid, right));
}

int main() {
    int n; std::cin >> n;
    int a[n]; for (int i = 0; i < n; ++i) std::cin >> a[i];
    std::cout << thanos_length(a, 0, n) << std::endl;
}