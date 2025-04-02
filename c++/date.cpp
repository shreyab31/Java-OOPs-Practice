#include<iostream>
using namespace std;
int main(){
    int sav;
    cout<<"Enter to your savings"<<endl;
    cin>>sav;
    if(sav>5000)
    {
        if(sav>10000)
            cout<<"shopping with neha";
            else
            cout<<"roadtrip with neha";
    }
    else if(sav>3000)
    {
        if(sav>4000)
        cout<<"cafe with nisha";
        else
        cout<<"park with nisha";
    }
    else
    cout<<"hangout with friends";
}