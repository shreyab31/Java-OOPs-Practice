#include<iostream>
using namespace std;
int main(){
    char button;
    cout<<"Input a characte";
    cin>>button;
    switch(button)
    {
        case 'a':
        cout<<"Hello";
        break;

        case 'b':
        cout<<"bonjour";
        break;

        case 'c':
        cout<<"Ciao";
        break;

        case'd':
        cout<<"Hola";
        break;

        case'e':
        cout<<"Salut";
        break;

        default:
        cout<<"I am still learning";
    }
    return 0;
}