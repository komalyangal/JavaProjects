#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
	int n,temp;
	cout<<"Enter the size ";
	cin>>n;
	int a[n],b[n],c;
	cout<<"enter the array elementd ";
	for(int i=0;i<n;i++)
		cin>>a[i];
		
	for(int i=0;i<n;i++)
	{	c=0;
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			{
				c++;	
			}
			b[i]=c;
		}	
	}
	
	for(int k=0;k<n;k++)
	{
		cout<<a[k]<<":"<<b[k]<<" ";
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(b[j]>b[j+1])
			{
				temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
				
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	cout<<endl;

	int v[n];
	for(int i=0;i<n;i++)
		v[i]=-1;
		
	for(int k=0;k<n;k++)
	{
		if(v[k]==-1)
		{
			cout<<a[k]<<" ";
			for(int j=k;j<n;j++)
			{
				if(a[j]==a[k])
					v[k]=0;
			}
		} 
	
	}
}
