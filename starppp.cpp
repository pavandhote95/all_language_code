#include <iostream>
using namespace std;

int main(){                                                                                                                                                                                                                  
  
  int n;
  cin>>n;
  int i=1;
 

  while(n>=i){
    int j=i+1;

    while(i<=n){
        cout<<("*");

        j=j-1;

    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
       cout<<endl;
       i=i+1;

  }
}