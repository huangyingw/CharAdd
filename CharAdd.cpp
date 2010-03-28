// CharAdd.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include<iostream>
using namespace std;

int tranNum(char x)
{
	if(x>57||x<48)
		return -1;
	x-=48;
	return x;
}

int AccuNum(char* x)
{
	int result=0;
	bool positive=true;

	if(*x=='-'||*x=='_')
	{
		positive=false;
		x++;
	}

	while(*x!='\0')
	{
		result+=tranNum(*x);
		x++;
		if(*x!='\0')
			result*=10;
	}
	
	if(!positive)
		result=-result;
	return result;
}

int _tmain(int argc, _TCHAR* argv[])
{
	char source1[30]="-234";
	int result1=AccuNum(source1);
	char source2[30]="235";
	int result2=AccuNum(source2);
	cout<<result1+result2<<endl;
	return 0;
}

