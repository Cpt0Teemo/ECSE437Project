#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


double factorial(double n){
    double result = 1;
    while(n>0){
        result*=n;
        n--;       
    }
    return result;
}

double permute(double n, double R){
    double result = (factorial(n)/factorial(n-R));
    return result;
}

double choose(double n, double k){
    double result = (factorial(n)/(factorial(k)*factorial(n-k)));
    return result;
}
