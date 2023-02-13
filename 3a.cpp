#include <iostream>

using namespace std;

int main()
{
    char sc, sr, tc, tr;
    cin >> sc >> sr >> tc >> tr;
    
    cout << max(abs(sc - tc), abs(sr - tr)) << '\n';
    while (sc != tc || sr != tr) {
        if (sc < tc) { cout << 'R'; ++sc; }
        if (sc > tc) { cout << 'L'; --sc; }
        if (sr < tr) { cout << 'U'; ++sr; }
        if (sr > tr) { cout << 'D'; --sr; }
        cout << '\n';
    }

    return 0;
}
