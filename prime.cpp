#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int i = 1;
    int temp = 0;
    while (i <= n)
    {

        if (n % i == 0){
            temp = temp + 1;
        }
    i = i + 1;
    }
if (temp == 2)

{
    cout << "prime";
}
else
{
    cout << "notprime";
}
}


