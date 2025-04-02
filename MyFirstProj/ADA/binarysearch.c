#include <iostream.h>
int a[20];
void merge(int,int,int);
void merge_sort(int low,int high)
{
int mid;
if(low<high)
{
mid=(low+high)/2;
merge_sort(low,mid);
merge_sort(mid+1,high);
merge(low,mid,high);
}
}
void merge(int low,int mid,int high)
{
int h,i,j,b[20],k;
h=low;
i=low;
j=mid+1;

while((h<=mid)&&(j<=high))
{
if(a[h]<=a[j])
{
b[i]=a[h];
h++;
}
else
{
b[i]=a[j];
j++;
}
i++;
}
if(h>mid)
{
for(k=j;k<=high;k++)
{
b[i]=a[k];
i++;
}
}
else
{
for(k=h;k<=mid;k++)
{
b[i]=a[k];
i++;
}
}
for(k=low;k<=high;k++) a[k]=b[k];
}
void main()
{
int num,i;
cout<<"How many No. U Want To Sort (Max 20 no.)"<<endl;
cin>>num;
cout<<"Now, Please Enter the ( "<< num <<" ) numbers (ELEMENTS):"<<endl;
for(i=1;i<=num;i++)
{
cin>>a[i] ;
}
merge_sort(1,num);
cout<<endl;
cout<<"So, the sorted list (using MERGE SORT) will be :"<<endl;
for(i=1;i<=num;i++)
cout<<a[i]<<" ";
}