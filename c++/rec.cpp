#include<iostream>
using namespace std;
int main(){
    int row, col, i, j;
    cout<<"Enter the number of rows";
    cin>>row;
    cout<<"Enter the numbwe of columns";
    cin>>col;
    for(i=1;i<=row;i++)
    {
        for(j=1;j<=col;j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    return 0;

}