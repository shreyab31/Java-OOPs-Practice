#include<stdio.h>
#include<ctype.h>
#include<string.h>

int main(){
    char input[100];
    printf("Enter an input string ");
    fgets(input,100,stdin);

    int len=strlen(input);
    char token[len];
    int i,j=0;
    while (i<len){
    if (isalpha(input[i]))
    {
        token[j++]=input[i++];
        while (i<len&&isalnum(input[i]))
        {
            token[j++]=input[i++];
        }
        token[j]='\0';
        printf("identifier :%s\n",token);
        j=0;
    } else if (isdigit(input[i]))
    {
        token[j++]=input[i++];
        while (i<len&& isdigit(input[i]))
        {
            token[j++]=input[i++];
        }
    token[j]='\0';
    printf("Integer: %s\n", token);
    j=0;
    } else if (ispunct(input[i]))
    {
        printf("Symbol: %c\n",input[i++]);
    }else if (isspace(input[i]))
    {
        i++;
    } else{
        printf("Unknown Character: %c\n",input[i++]);
    }
    }
    return 0;
}
