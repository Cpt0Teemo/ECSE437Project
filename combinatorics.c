#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include "exponentRoot.c"


double factorial(double n){
    double result = 1;
    while(n>0){
        result*=n;
        n--;       
    }
    return result;
}

double permute_with_repetition(double n, double r){
    return power(n,r);
}

// n Permute r
double permute_without_repetition(double n, double r){
    return (factorial(n)/factorial(n-r));
}

double combine_with_repetiion(double n, double k){
    return (factorial(k+n-1)/(factorial(k)*factorial(n-1)));
}

// n Choose k
double combine_without_repetition(double n, double k){
    double result = (factorial(n)/(factorial(k)*factorial(n-k)));
    return result;
}