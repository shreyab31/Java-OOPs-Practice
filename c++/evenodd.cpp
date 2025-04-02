#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter your num";
    cin>>n;
    if(n!=0)
    {
    if(n%2==0)
    {
        cout<<"Even";
    }
    else if(n%2!= 0)
    {
        cout<<"odd";
    }
    }
    else
    {
        cout<<"num is zero";
    }
    }