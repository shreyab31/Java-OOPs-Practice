#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the number to know whether it is divisble by 2 or 3 or both";
    cin>>n;
    for(int i=0;i<=n;i++)
    {
        if(n%2==0)
        {
            cout<<n;
        }
    }
}