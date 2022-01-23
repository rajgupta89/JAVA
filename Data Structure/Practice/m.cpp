#include<iostream>
using namespace std;
int count=0;
class m
{
    public :
    m()
    {
        count++;
    }
    ~m()
    {
        count--;
    }
};
int main()
{
    m A,B,C,D,E;
    m F;
    {
        m G;
    }
    cout<<count;
    return 0;
}