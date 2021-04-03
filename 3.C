#include<stdio.h>
void pattern(int n)
{
    int i,j;
 
    // This is upper half of pattern
    for (i=1; i<=n; i++)
    {
        for (j=1; j<=n; j++) {
            if (i%2 != 0 || j/2==0 || j==n) {
                printf("* ");
            } else {
                printf("= ");
            }
        }
        printf("\n");
    }

}
 
int main()
{
    pattern(5);
    return 0;
}
