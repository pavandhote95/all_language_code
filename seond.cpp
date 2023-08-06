#include <iostream>

using namespace std;
int main()
{
    cout<< "enter your age : ";
    int age;
    cin >> age;


  
    if (age < 18)
    {
        cout << "you are not eligible for vote ";
    }
    else if (age >= 18)
    {
        cout << "contrats you can vote : ";
    }
    else
    {
        cout << "invailed input ";
    }
}