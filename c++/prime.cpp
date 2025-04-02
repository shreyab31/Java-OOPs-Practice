#include<iostream>
using namespace std;
int main(){
    int n,i;
    cout<<"Enter the nunber to know whether the number is prime or not";
    cin>>n;
    for(i=2;i<n;i++){
    if (n%i==0){
        cout<<"Not a prime number";
        break;
    }
    }
    if(i==n)
        cout<<"prime number";
        return 0;
    }